package models.users;
/*
 * @(#) PostResponseModel.java 1.0
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
public class PostResponseModel {

    @JsonProperty("code")
    public Integer code;

    @JsonProperty("type")
    public String type;

    @JsonProperty("message")
    public String message;
}
