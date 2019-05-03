package com.elempleo.app.pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
	
	@AndroidFindBy(id="android.support.v7.app.ActionBar$Tab")
	WebElement btnPestanaInicioSesion;
	@AndroidFindBy(id="com.elempleo.app:id/login_et_email")
	WebElement txtCorreoUsuario;
	@AndroidFindBy(id="com.elempleo.app:id/login_et_password")
	WebElement txtContrasena;
	@AndroidFindBy(id="com.elempleo.app:id/login_bt_ingresar")
	WebElement btnIniciarSesion;
	
	
	public void inicioSesion(String correoUsuario, String contrasena) {
		element(txtCorreoUsuario).sendKeys(correoUsuario);
		element(txtContrasena).sendKeys(contrasena);
		element(btnIniciarSesion).click();
	}

}
