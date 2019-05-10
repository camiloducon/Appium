package com.elempleo.app.pages;

import java.awt.Dimension;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.elempleo.app.utils.Helpers;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class PersonalInformationPage extends PageObject {

	Helpers helpers = new Helpers();
	@AndroidFindBy(id = "com.elempleo.app:id/personal_data_et_names")
	WebElement txtNombres;
	@AndroidFindBy(id = "com.elempleo.app:id/personal_data_et_last_name_1")
	WebElement txtPrimerApellido;
	@AndroidFindBy(id = "com.elempleo.app:id/personal_data_et_last_name_2")
	WebElement txtSegundoApellido;
	@AndroidFindBy(id = "com.elempleo.app:id/personal_data_et_phone")
	WebElement txtTelefono;
	@AndroidFindBy(id = "com.elempleo.app:id/personal_data_et_date")
	WebElement txtFechaNacimiento;
	@AndroidFindBy(id = "android:id/date_picker_header_year")
	WebElement btnAnio;
	@AndroidFindBy(id = "android:id/text1")
	List<WebElement> cmbAnios;

	public void completarRegistro(String nombres, String primerApellido, String segundoApellido, String telefono, String fechaNacimiento) {
		element(txtNombres).sendKeys(nombres);
		this.getDriver().navigate().back();
		element(txtPrimerApellido).sendKeys(primerApellido);
		this.getDriver().navigate().back();
		element(txtSegundoApellido).sendKeys(segundoApellido);
		this.getDriver().navigate().back();
		element(txtTelefono).sendKeys(telefono);
		this.getDriver().navigate().back();
		helpers.esperaSelenium(5);
		element(txtFechaNacimiento).click();
		fecha(fechaNacimiento);

	}

	public void fecha(String fechaNacimiento) {

		//String[] fechaN = fecha.split(",");
		btnAnio.click();
		for (int i = 0; i < cmbAnios.size(); i++) {
			//for (String nacimiento : fechaN) {
				if (cmbAnios.get(i).getText().contains(fechaNacimiento)) {
					cmbAnios.get(i).click();
					break;
				}
			}
		}
	}
