package io.swagger.petstore.tasks.order;
/*
 * @(#) PostOrderTask.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import io.swagger.petstore.tasks.user.PostUserTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PostOrderTask implements Task {

    private final Object order;
    private final String endPoint;

    public PostOrderTask(Object order, String endPoint) {
        this.order = order;
        this.endPoint = endPoint;
    }

    public static Performable fromOrder(Object order, String endPoint){
        return instrumented(PostUserTask.class, order, endPoint);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(endPoint).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(order)
                )
        );
    }
}
