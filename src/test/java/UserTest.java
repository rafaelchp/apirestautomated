
/*
 * @(#) test.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */


import io.swagger.petstore.models.users.UserDataModel;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.swagger.petstore.questions.user.GetUserQuestion;
import io.swagger.petstore.questions.ResponseCode;
import io.swagger.petstore.tasks.user.GetUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
@RunWith(SerenityRunner.class)
public class UserTest {
    private static final String restAPIUrl="https://petstore.swagger.io/v2";

    @Test
    public void getUser(){
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPIUrl));

        user.attemptsTo(
                GetUser.fromUser("RafaelP")
        );

        //assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(200);
        user.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(), equalTo(200))
        );

        String firstName=  new GetUserQuestion().answeredBy(user).getFirstName();
        System.out.println("nombre->"+firstName);

        UserDataModel userRes =  new GetUserQuestion().answeredBy(user);
        user.should(
                seeThat("El usuario no es nulo",actor -> userRes, notNullValue())
        );
        user.should(
                seeThat("El email del usuario", actor -> userRes.getEmail(), equalTo("rafael@mail.com"))
        );

    }
}
