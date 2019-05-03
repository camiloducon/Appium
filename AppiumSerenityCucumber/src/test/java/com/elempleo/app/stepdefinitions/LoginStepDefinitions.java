package com.elempleo.app.stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elempleo.app.steps.LoginStep;
import com.elempleo.app.utils.DataDrivenExcel;
import com.elempleo.app.utils.Excel;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	Map<String, String> data = new HashMap<String, String>();
	@Steps
	LoginStep loginStep;

	@Given("^that  I select the country colombia (.*)$")
	public void thatYouEnteredTheApp(int row, DataTable dataExcel) throws Exception {
		List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
		Excel excel = new Excel(dataFeature.get(0).get("PathExcel"), dataFeature.get(0).get("Sheet"), true, row);
		data = dataDriverExcel.leerExcel(excel);
		loginStep.seleccionarPais();
	}

	@When("^put my login data$")
	public void putMyLoginData() throws Exception {
		loginStep.login(data.get("Correo Electronico"), data.get("Contrasena"));
	}

	@Then("^I can enter my profile$")
	public void iCanEnterMyProfile() throws Exception {

	}

}
