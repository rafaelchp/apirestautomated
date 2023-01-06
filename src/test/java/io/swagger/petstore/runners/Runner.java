package io.swagger.petstore.runners;
/*
 * @(#) Runner.java 1.0
 *
 * Copyright 2022 ATH, Inc. Todos los derechos reservados.
 */

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Esta clase crea una instancia de las clases de inicialización de variables…
 * Utilizadas en todas las clases.
 *
 * @autor Rafael Chica
 * @Fecha: --o--
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = { "pretty" },
        glue = "io.swagger.petstore.stepDefinitions",
        tags = "@PostUser",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class Runner {

}
