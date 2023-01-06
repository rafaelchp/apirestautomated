package questions.user;
/*
 * @(#) GetUser.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import models.users.UserDataModel;
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
public class GetUserQuestion implements Question {
    @Override
    public UserDataModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(UserDataModel.class);
    }
}
