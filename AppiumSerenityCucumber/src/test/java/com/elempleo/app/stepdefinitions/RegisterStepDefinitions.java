package com.elempleo.app.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.elempleo.app.steps.RegisterStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinitions {

	@Steps
	RegisterStep registerStep;

	@Given("^I want to register in elempleo$")
	public void iWantToRegisterInElempleo() throws Exception {
		registerStep.seleccionarPais();
	}

	@When("^put my registration data$")
	public void putMyRegistrationData(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		registerStep.paginaRegistro(datos.get(0).get("pestana"));
		registerStep.registro(datos.get(0).get("correoElectronico"), datos.get(0).get("tipoDocumento"),
				datos.get(0).get("numeroDocumento"), datos.get(0).get("contrasena"),
				datos.get(0).get("confirmarContrasena"));
		registerStep.completarRegistro(datos.get(0).get("nombres"), datos.get(0).get("primerApellido"),
				datos.get(0).get("segundoApellido"), datos.get(0).get("telefono"), datos.get(0).get("fechaNacimiento"));
	}

	@Then("^I can create my profile$")
	public void iCanCreateMyProfile() throws Exception {

	}
}
