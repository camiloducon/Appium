package com.elempleo.app.pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject {

	@AndroidFindBy(id="android.support.v7.app.ActionBar$Tab")
	WebElement btnPestanaRegistrarse;
	@AndroidFindBy()
	WebElement txtCorreoElectronico;
	@AndroidFindBy()
	WebElement cmbTipoDocumento;
	@AndroidFindBy()
	WebElement txtNumeroIdentificacion;
	@AndroidFindBy()
	WebElement txtContrasena;
	@AndroidFindBy()
	WebElement txtConfirmarContrasena;
	@AndroidFindBy()
	WebElement btnRegistrarme;

	public void registroUsuario(String correoElectronico, String tipoDocumento, String numeroDocumento,
			String contrasena, String confirmarContrasena) {
		element(btnPestanaRegistrarse).click();
		element(txtCorreoElectronico).sendKeys(correoElectronico);
		element(cmbTipoDocumento).selectByVisibleText(tipoDocumento);
		element(txtNumeroIdentificacion).sendKeys(numeroDocumento);
		element(txtContrasena).sendKeys(contrasena);
		element(txtConfirmarContrasena).sendKeys(confirmarContrasena);
		element(btnRegistrarme).click();
	}

}
