package com.elempleo.app.steps;

import com.elempleo.app.pages.HomePage;
import com.elempleo.app.pages.LoginPage;
import com.elempleo.app.pages.PersonalInformationPage;
import com.elempleo.app.pages.RegisterPage;

import net.thucydides.core.annotations.Step;

public class RegisterStep {

	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;
	PersonalInformationPage personalInformationPage;

	@Step
	public void seleccionarPais() {
		homePage.seleccionarPais();
	}

	@Step
	public void paginaRegistro(String pestana) {
		loginPage.registro(pestana);
	}

	@Step
	public void registro(String correoElectronico, String tipoDocumento, String numeroDocumento, String contrasena,
			String confirmarContrasena) {
		registerPage.registroUsuario(correoElectronico, tipoDocumento, numeroDocumento, contrasena,
				confirmarContrasena);
	}

	@Step
	public void completarRegistro(String nombres, String primerApellido, String segundoApellido, String telefono,
			String fechaNacimiento) {
		personalInformationPage.completarRegistro(nombres, primerApellido, segundoApellido, telefono, fechaNacimiento);
	}
}
