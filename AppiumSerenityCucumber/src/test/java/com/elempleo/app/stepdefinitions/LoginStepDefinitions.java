package com.elempleo.app.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.elempleo.app.steps.LoginStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

	@Steps
	LoginStep loginStep;

	@Given("^that  I select the country colombia$")
	public void thatYouEnteredTheApp() throws Exception {
		loginStep.seleccionarPais();
	}

	@When("^put my login data$")
	public void putMyLoginData(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		loginStep.login(datos.get(0).get("correoUsuario"), datos.get(0).get("contrasena"));
	}

	@Then("^I can enter my profile$")
	public void iCanEnterMyProfile() throws Exception {

	}

}
