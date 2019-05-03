package com.elempleo.app.pages;

import org.openqa.selenium.WebElement;

import com.elempleo.app.utils.Helpers;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	Helpers helpers = new Helpers();
	@AndroidFindBy(id = "com.elempleo.app:id/country_btn_colombia")
	WebElement btncolombia;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Saltar']")
	WebElement btnSaltar;

	public void seleccionarPais() {
		element(btncolombia).click();
		element(btnSaltar).click();
	}
}
