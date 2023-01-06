package models.orders;
/*
 * @(#) SendDataOrderModel.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SendDataOrderModel {
    @JsonProperty("id")
    public Long id;

    @JsonProperty("petId")
    public Integer petId;

    @JsonProperty("quantity")
    public Integer quantity;

    @JsonProperty("shipDate")
    public String shipDate;

    @JsonProperty("status")
    public String status;

    @JsonProperty("complete")
    public Boolean complete;
}
