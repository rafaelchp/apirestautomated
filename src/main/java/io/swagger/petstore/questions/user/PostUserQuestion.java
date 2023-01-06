package io.swagger.petstore.questions.user;
/*
 * @(#) PostUserQuestion.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.swagger.petstore.models.users.PostResponseModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PostUserQuestion implements Question {
    @Override
    public PostResponseModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(PostResponseModel.class);
    }
}
