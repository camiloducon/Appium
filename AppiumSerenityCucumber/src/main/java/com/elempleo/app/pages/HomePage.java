package com.elempleo.app.pages;

import com.elempleo.app.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{
	
	Helpers helpers = new Helpers();
	@FindBy(xpath = "//android.widget.TextView[@text='Colombia']")
	WebElementFacade btncolombia;
	@FindBy(xpath = "//android.widget.TextView[@text='Saltar']")
	WebElementFacade btnSaltar;
	
	public void seleccionarPais() {
		helpers.esperaSelenium(5);
		btncolombia.click();
		helpers.esperaSelenium(5);
		btnSaltar.click();
	}

}
