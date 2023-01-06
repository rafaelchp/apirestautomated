package questions.order;
/*
 * @(#) PostOrderQuestion.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import models.orders.SendDataOrderModel;
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
public class PostOrderQuestion implements Question<SendDataOrderModel> {
    @Override
    public SendDataOrderModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(SendDataOrderModel.class);
    }
}
