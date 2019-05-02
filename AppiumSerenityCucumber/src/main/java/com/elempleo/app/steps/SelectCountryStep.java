package com.elempleo.app.steps;

import com.elempleo.app.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class SelectCountryStep {
	
	HomePage homePage;
	
	@Step
	public void seleccionarPais() {
		homePage.seleccionarPais();
	}
	
}
