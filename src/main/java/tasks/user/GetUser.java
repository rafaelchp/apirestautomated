package tasks.user;
/*
 * @(#) GetUser.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.HashMap;

import static net.serenitybdd.screenplay.Tasks.instrumented;


/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */

public class GetUser implements Task {
    private final String user;

    public GetUser(String user) {
        this.user = user;
    }

    public static Performable fromUser(String user){
        return instrumented(GetUser.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        HashMap<String, Object> headers= new HashMap<>();
        headers.put("content-type","application/json");
        actor.attemptsTo(
                Get.resource("/user/"+user)
                        .with( requestSpecification ->
                                requestSpecification.headers(headers)
                                        .contentType(ContentType.JSON)
                        )

        );

    }
}
