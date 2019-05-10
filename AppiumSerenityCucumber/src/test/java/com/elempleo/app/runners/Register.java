package com.elempleo.app.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/Register.feature",
		glue = "com.elempleo.app.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Register {

}
