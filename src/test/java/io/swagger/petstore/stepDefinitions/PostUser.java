package io.swagger.petstore.stepDefinitions;
/*
 * @(#) PostUser.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.users.UserDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.user.PostUserQuestion;
import questions.user.ObjectUser;
import tasks.user.PostUserTask;

import static constants.Constants.URL_Base;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PostUser {
    private static final String restAPIUrl=URL_Base;

    @When("I consume the endpoint {string} and I send the user information username {string}, firstName {string} lastName {string} email {string} password {string} phone {string}")
    public void sendInformation(String endpoint, String username, String firstName, String lastName, String email, String password, String phone) {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPIUrl));

        UserDataModel users = new ObjectUser(username, firstName, lastName, email, password, phone).answeredBy(user);


        user.attemptsTo(
                PostUserTask.fromUser(users, endpoint)
        );

    }
    @Then("I can validate the creation code is {string}")
    public void iCanValidateTheCreationCodeIs(String code) {
        Actor user= Actor.named("user");

        String codeRes= String.valueOf(new PostUserQuestion().answeredBy(user).getCode());
        user.should(
                seeThat("The responde code is ", res->codeRes, equalTo(code)),
                seeThat("The type is ", res-> new PostUserQuestion().answeredBy(user).getType(),equalTo("unknown"))
        );

    }
}
