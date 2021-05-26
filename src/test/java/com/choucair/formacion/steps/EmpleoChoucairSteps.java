package com.choucair.formacion.steps;

import java.awt.AWTException;

import com.choucair.formacion.pageobjects.EmpleoChoucairPageObjects;

import net.thucydides.core.annotations.Step;

public class EmpleoChoucairSteps {
	
	EmpleoChoucairPageObjects empleoChoucairPageObjects;
	
@Step
public void ingresarEmpleo () {
	empleoChoucairPageObjects.open();
	empleoChoucairPageObjects.ingresarEmpleados();
}

@Step
public void btnSerChoucair2 () {
	empleoChoucairPageObjects.btnSerChoucair();
}

@Step
public void verificarSerChoucair2 (String strMensaje) {
	empleoChoucairPageObjects.verificarSerChoucair(strMensaje);
}

@Step
public void btnConvocatoria() {
	empleoChoucairPageObjects.btnConvocatoria();
}

@Step
public void verificaConvocatoria(String strMensaje) {
	empleoChoucairPageObjects.verificarConvocatoria(strMensaje);
}

@Step
public void clickIdioma (String strIdioma) {
	empleoChoucairPageObjects.clickIdioma(strIdioma);
}

@Step
public void verificarIdioma (String strMensaje) {
	empleoChoucairPageObjects.verificarIdioma(strMensaje);
}

@Step
public void buscarEmpleo (String strEmpleo, String strUbicacion ) throws AWTException {
	empleoChoucairPageObjects.scroll();
	empleoChoucairPageObjects.buscarEmpleo(strEmpleo);
	empleoChoucairPageObjects.buscarUbicacion(strUbicacion);	
}

@Step
public void verificarEmpleo (String strMensaje) {
	empleoChoucairPageObjects.verificarIdioma(strMensaje);
}


@Step
public void preparse() {
	empleoChoucairPageObjects.clickBotonPreparse();
}

@Step
public void coparar(String strMensaje) {
	empleoChoucairPageObjects.compararTexto(strMensaje);
}





}
