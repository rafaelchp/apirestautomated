package io.swagger.petstore.stepDefinitions;
/*
 * @(#) PostOrder.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.orders.SendDataOrderModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.ResponseCode;
import questions.order.ObjectOrder;
import questions.order.PostOrderQuestion;
import tasks.order.PostOrderTask;

import static contants.Contants.URL_Base;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PostOrder {
    private static final String restAPIUrl=URL_Base;

    @When("I consume the endpoint {string} and I send the order information petId {int}, quantity {int} shipDate {string} status {string} complete {string}")
    public void sendInformation(String endpoint, Integer petId, Integer quantity, String shipDate, String status, String complete) {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPIUrl));
        SendDataOrderModel order= new ObjectOrder(petId,quantity,shipDate,status,Boolean.valueOf(complete)).answeredBy(user);

        user.attemptsTo(
                PostOrderTask.fromOrder(order,endpoint)
        );
    }

    @Then("I can validate the response code is {int}")
    public void iCanValidateTheResponseCodeIs(Integer resCode) {
        Actor user= Actor.named("user");


        user.should(
                seeThat("The response code is",ResponseCode.was(),equalTo(resCode)),
                seeThat("The response complete is",res->new PostOrderQuestion().answeredBy(user).getComplete(),equalTo(Boolean.valueOf("true")))
        );



    }

}
