package com.choucair.formacion.pageobjects;

import static org.junit.Assert.assertThat;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.choucairtesting.com/")

public class EmpleoChoucairPageObjects extends PageObject {

	@FindBy(id="menu-item-550") 
	public WebElementFacade lblEmpleo;
	
	@FindBy(xpath="//img[@alt='serchazuleMesa de trabajo 1']") 
	public WebElementFacade btnSerChoucair;
	
	@FindBy(xpath="//div[@id='content']/div/div/div/div/div/section[3]/div/div/div/div/div/div[2]/div/h2") 
	public WebElementFacade lblSerChoucair;	

	@FindBy(xpath="//img[@alt='empleosazuleMesa de trabajo 1']") 
	public WebElementFacade btnConvocatoria;
	
	@FindBy(xpath="//div[@id='content']/div/div/div/div/div/section[4]/div/div/div/div/div/div[2]/div/h2") 
	public WebElementFacade lblConvocatoria;	
	
	@FindBy(xpath="//li[@id='menu-item-10034']/a/span") 
	public WebElementFacade btnIdioma;
	
	@FindBy(xpath="//li[@id='menu-item-10033-es']/a/span") 
	public WebElementFacade btnEspañol;
	
	@FindBy(xpath="//li[@id='menu-item-10034-en']/a/span") 	
	public WebElementFacade btnIngles;
	
	@FindBy(xpath="//li[@id='menu-item-10033-es']/a/span") 
	public WebElementFacade lblServicios;
	
	@FindBy(id="search_keywords") 
	public WebElementFacade txtEmpleo;
	
	@FindBy(id="search_location") 
	public WebElementFacade txtUbicacion;
	
	@FindBy(xpath="//div[@id='content']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li/a/div/h3") 
	public WebElementFacade lblResultado;
	
	@FindBy(xpath="//img[@alt='empleosazulMesa de trabajo 1']") 
	public WebElementFacade btnPreparseParaAplicar;
	
	@FindBy(xpath="//div[@id='content']/div/div/div/div/div/section[9]/div/div/div/div/div/div[3]/div/h2") 
	public WebElementFacade lblComparar;
	
	public void ingresarEmpleados() {
		lblEmpleo.click();
	}
	
	public void btnSerChoucair() {
		btnSerChoucair.click();
	}
	
	public void verificarSerChoucair(String strMensaje) {
		assertThat(strMensaje, containsString(lblSerChoucair.getText()));
		
	}
	
	public void btnConvocatoria() {
		btnConvocatoria.click();
	}
	public void verificarConvocatoria(String strMensaje) {
		assertThat(strMensaje, containsString(lblConvocatoria.getText()));
		
	}
	
	public void clickIdioma(String strIdioma) {
		btnIdioma.click();
	
		if (strIdioma == ("English")) {				
							
				Actions actions = new Actions(getDriver());	
				WebElement subMenu = getDriver().findElement(By.cssSelector("#menu-item-10034-en > a > span"));
				actions.moveToElement(subMenu);
				actions.click().build().perform();		
					//btnIngles.click();
		}		
	}
	
	public void verificarIdioma(String strMensaje) {
		
		System.out.println("lblServicios.getText()");
		assertThat(strMensaje, containsString(lblServicios.getText()));
		
	}
	
	public void buscarEmpleo (String strEmpleo) {
		txtEmpleo.click();
		txtEmpleo.clear();
		txtEmpleo.sendKeys(strEmpleo);
	}
	
	public void buscarUbicacion (String strUbicacion) {
		txtUbicacion.click();
		txtUbicacion.clear();
		txtUbicacion.sendKeys(strUbicacion);
	}
		
	
	public void verificarBusquedaEmpleo(String strMensaje) {
		
		System.out.println("lblResultado.getText()");
		assertThat(strMensaje, containsString(lblServicios.getText()));
		
	}
	
	public void scroll() throws AWTException
	{
	Robot robot = new Robot();	
		robot.keyPress(java.awt.event.KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(java.awt.event.KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(java.awt.event.KeyEvent.VK_PAGE_DOWN);			
	
	}
	
	public void clickBotonPreparse() {
		btnPreparseParaAplicar.click();
	}	
		
	public void compararTexto(String strMensaje) {
		assertThat(strMensaje, containsString(lblComparar.getText()));
		
	}
		
}

