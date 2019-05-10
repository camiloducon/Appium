package com.elempleo.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.elempleo.app.utils.Helpers;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject {

	Helpers helpers = new Helpers();
	@AndroidFindBy(id = "com.elempleo.app:id/register_et_email")
	WebElement txtCorreoElectronico;
	@AndroidFindBy(id = "com.elempleo.app:id/register_spinner_tipodoc")
	WebElement btnTipoDocumento;
	@AndroidFindBy(id = "android:id/text1")
	List<WebElement> cmbTipoDocumento;
	@AndroidFindBy(id = "com.elempleo.app:id/register_et_numerodoc")
	WebElement txtNumeroIdentificacion;
	@AndroidFindBy(id = "com.elempleo.app:id/register_et_password")
	WebElement txtContrasena;
	@AndroidFindBy(id = "com.elempleo.app:id/register_et_passwordconfirm")
	WebElement txtConfirmarContrasena;
	@AndroidFindBy(id = "com.elempleo.app:id/register_bt_register")
	WebElement btnRegistrarme;

	public void registroUsuario(String correoElectronico, String tipoDocumento, String numeroDocumento,
			String contrasena, String confirmarContrasena) {

		element(txtCorreoElectronico).sendKeys(correoElectronico);
		this.getDriver().navigate().back();
		element(btnTipoDocumento).click();
		seleccionarTipoDocumento(tipoDocumento);
		element(txtNumeroIdentificacion).sendKeys(numeroDocumento);
		element(txtContrasena).sendKeys(contrasena);
		this.getDriver().navigate().back();
		element(txtConfirmarContrasena).sendKeys(confirmarContrasena);
		this.getDriver().navigate().back();
		helpers.esperaSelenium(2);
		element(btnRegistrarme).click();
		helpers.esperaSelenium(5);
	}

	public void seleccionarTipoDocumento(String tipoDocumento) {
		for (int i = 0; i < cmbTipoDocumento.size(); i++) {
			if (cmbTipoDocumento.get(i).getText().equals(tipoDocumento)) {
				cmbTipoDocumento.get(i).click();
				break;
			}
		}
	}
}
