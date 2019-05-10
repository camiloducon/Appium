package com.elempleo.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.elempleo.app.utils.Helpers;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	Helpers helpers = new Helpers();
	@AndroidFindBy(id = "com.elempleo.app:id/nav_label")
	List<WebElement> lblNombrePestana;
	@AndroidFindBy(id = "com.elempleo.app:id/nav_label")
	List<WebElement> btnPestana;
	@AndroidFindBy(id = "com.elempleo.app:id/login_et_email")
	WebElement txtCorreoUsuario;
	@AndroidFindBy(id = "com.elempleo.app:id/login_et_password")
	WebElement txtContrasena;
	@AndroidFindBy(id = "com.elempleo.app:id/login_bt_ingresar")
	WebElement btnIniciarSesion;

	public void inicioSesion(String correoUsuario, String contrasena) {
		helpers.esperaSelenium(2);
		element(txtCorreoUsuario).sendKeys(correoUsuario);
		element(txtContrasena).sendKeys(contrasena);
		element(btnIniciarSesion).click();
	}

	public void registro(String pestana) {
		seleccionarPestana(pestana);
	}

	public void seleccionarPestana(String pestana) {
		for (int i = 0; i < lblNombrePestana.size(); i++) {
			if (lblNombrePestana.get(i).getText().contains(pestana)) {
				btnPestana.get(i).click();
				break;
			}
		}
	}
}
