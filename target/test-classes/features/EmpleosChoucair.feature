#Author: edinson.calle@hotmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Busqueda en empleo choucair 
  Como usuario web quiero ingresar a la pagina de empleos de choucair
 

  @tag1
  Scenario: Ser choucair
    Given Un navegador web en la pagina de empleos de choucair
    When desplegar que es ser choucair
    Then muestra el texto "SER CHOUCAIR"


  @tag2
  Scenario: Convocatoria
    Given Un navegador web en la pagina de empleos de choucair
    When desplegar convocatoria
    Then verifica el texto "CONVOCATORIAS"
    
  @tag3
  Scenario: Prepararse para aplicar
    Given Un navegador web en la pagina de empleos de choucair
    When desplegar Prepararse para aplicar
    Then compara el texto "PREPARARSE PARA APLICAR"
    
    
   @tag4  
  Scenario Outline: Cambiar idioma
    Given Un navegador web en la pagina de empleos de choucair
    When Cambio el <idioma>
    Then verifica el mensaje <mensaje>

  Examples: 
      | idioma    | mensaje 	   |
      | "English" | "Services"	|
      
     @tag5
 Scenario Outline: Buscar empleos dispobiles
     Given Un navegador web en la pagina de empleos de choucair
     When Buscar la <empleo> y la <ubicacion>
     Then verifca el titulo <texto>
    
      Examples: 
      | empleo                        | ubicacion  | texto                         |
      | "Automatizador"               | "Peru"     | "Automatizador"               |
      | "Analista de Pruebas Móviles" | "Medellin" | "Analista de Pruebas Móviles" |
      
