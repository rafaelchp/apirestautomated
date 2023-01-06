package questions.user;
/*
 * @(#) ResponseObjectUser.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import models.users.UserDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ObjectUser implements Question {
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String phone;

    public ObjectUser(String username, String firstName, String lastName, String email, String password, String phone) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }


    @Override
    public UserDataModel answeredBy(Actor actor) {
        UserDataModel users= UserDataModel.builder()
                .id(Long.parseLong("0")).username(username).firstName(firstName).lastName(lastName).email(email)
                .password(password)
                .phone(phone).userStatus(1)
                .build();
        return users;
    }
}
