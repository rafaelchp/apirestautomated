package io.swagger.petstore.tasks.user;
/*
 * @(#) PostUser.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PostUserTask implements Task {
    private final Object user;
    private final String endPoint;

    public PostUserTask(Object user, String endPoint) {
        this.user = user;
        this.endPoint = endPoint;
    }

    public static Performable fromUser(Object user, String endPoint){
        return instrumented(PostUserTask.class, user, endPoint);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(endPoint).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(user)
                )
        );
    }
}
