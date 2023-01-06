package models.users;
/*
 * @(#) GetUserResponse.java 1.0
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
public class UserDataModel {

    @JsonProperty("id")
    public Long id;

    @JsonProperty("username")
    public String username;

    @JsonProperty("firstName")
    public String firstName;

    @JsonProperty("lastName")
    public String lastName;

    @JsonProperty("email")
    public String email;

    @JsonProperty("password")
    public String password;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("userStatus")
    public Integer userStatus;
}
