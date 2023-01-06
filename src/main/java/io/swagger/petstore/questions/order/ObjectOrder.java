package io.swagger.petstore.questions.order;
/*
 * @(#) ResponseObjectOrder.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.swagger.petstore.models.orders.SendDataOrderModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ObjectOrder implements Question<SendDataOrderModel> {

    private final Integer petId;
    private final Integer quantity;
    private  final String shipDate;
    private final String status;
    private final Boolean complete;

    public ObjectOrder( Integer petId, Integer quantity, String shipDate, String status, Boolean complete) {

        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }

    @Override
    public SendDataOrderModel answeredBy(Actor actor) {
        SendDataOrderModel order= SendDataOrderModel.builder()
                .id(Long.parseLong("0"))
                .petId(petId)
                .quantity(quantity)
                .shipDate(shipDate)
                .status(status)
                .complete(complete)
                .build();
        return order;
    }
}
