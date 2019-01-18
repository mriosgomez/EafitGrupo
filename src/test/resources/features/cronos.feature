@Regresion
Feature: Consultar requerimientos
Como usuario
Quiero consultar lista de requerimientos de bienes
A través de la pagina de acceso a la aplicación cronos.

	@Logueo
  Scenario: Realizar la Autenticación en Cronos.
	Given que Margarita quiere acceder a Cronos
	When en escribe el usuario "mmriosg" y la clave "123"
	Then el ve el mensaje de "Bienvenido(a) Margarita María Ríos Gómez"
	
  @ConsultarUnaFecha
  Scenario: Consultar requerimientos de bienes en una fecha especifica
	Given que yo quiero consultar requerimientos de bienes
	When se selecciona fechaini "17/01/2018" y fechafin "17/01/2018"
	Then se muestra el resultado de "54 Registros encontrados, página 1 de 6" 
    