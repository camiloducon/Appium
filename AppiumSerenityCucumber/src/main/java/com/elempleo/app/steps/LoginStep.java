package com.elempleo.app.steps;

import com.elempleo.app.pages.HomePage;
import com.elempleo.app.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {
	
	HomePage homePage;
	LoginPage loginStep;
	
	@Step
	public void seleccionarPais() {
		homePage.seleccionarPais();
	}
	@Step
	public void login(String correoUsuario, String contrasena) {
		loginStep.inicioSesion(correoUsuario, contrasena);
	}
	
}
