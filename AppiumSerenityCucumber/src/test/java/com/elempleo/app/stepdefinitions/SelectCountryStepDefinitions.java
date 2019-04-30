package com.elempleo.app.stepdefinitions;

import com.elempleo.app.steps.SelectCountryStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SelectCountryStepDefinitions {

	@Steps
	SelectCountryStep selectCountryStep;
	
	
	@Given("^that you entered the app$")
	public void thatYouEnteredTheApp() throws Exception {
		selectCountryStep.seleccionarPais();
	}

	@When("^I select the country colombia$")
	public void iSelectTheCountryColombia() throws Exception {

	}

	@Then("^I can enter the offers of my country$")
	public void iCanEnterTheOffersOfMyCountry() throws Exception {

	}

}
