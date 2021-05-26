package com.choucair.formacion.definition;

import java.awt.AWTException;

import com.choucair.formacion.steps.EmpleoChoucairSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmpleoChoucairDefinition {
	@Steps
	EmpleoChoucairSteps empleoChoucairSteps;

	@Given("^Un navegador web en la pagina de empleos de choucair$")
	public void un_navegador_web_en_la_pagina_de_empleos_de_choucair() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.ingresarEmpleo();
	
	}

	@When("^desplegar que es ser choucair$")
	public void desplegar_que_es_ser_choucair() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.btnSerChoucair2();

	}

	@Then("^muestra el texto \"([^\"]*)\"$")
	public void muestra_el_texto(String mensaje) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.verificarSerChoucair2(mensaje);
	}	
	

	@When("^desplegar convocatoria$")
	public void desplegar_convocatoria() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.btnConvocatoria();
	}

	@Then("^verifica el texto \"([^\"]*)\"$")
	public void verifica_el_texto(String strMensaje) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.verificaConvocatoria(strMensaje);
	}
	
	@When("^Cambio el \"([^\"]*)\"$")
	public void cambio_el(String strIdioma) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.clickIdioma(strIdioma);
	   
	}

	@Then("^verifica el mensaje \"([^\"]*)\"$")
	public void verifica_el_mensaje(String strMensaje) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.verificarIdioma(strMensaje);
	}
	
	@When("^Buscar la \"([^\"]*)\" y la \"([^\"]*)\"$")
	public void buscar_la_y_la(String strEmpleo, String strUbicacion) throws AWTException {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.buscarEmpleo(strEmpleo, strUbicacion);
	}

	@Then("^verifca el titulo \"([^\"]*)\"$")
	public void verifca_el_titulo(String strMensaje) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.verificarEmpleo(strMensaje);
	}
	
	@When("^desplegar Prepararse para aplicar$")
	public void desplegar_Prepararse_para_aplicar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.preparse();
	}

	@Then("^compara el texto \"([^\"]*)\"$")
	public void compara_el_texto(String strMensaje) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		empleoChoucairSteps.coparar(strMensaje);
	}
}
