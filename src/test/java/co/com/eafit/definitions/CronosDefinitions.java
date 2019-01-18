package co.com.eafit.definitions;

import co.com.eafit.steps.CronosStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CronosDefinitions {
	
	@Steps
	CronosStep cronosStep;
	
	
	@Given("^que yo quiero consultar requerimientos de bienes$")
	public void queYoQuieroConsultarRequerimientosDeBienes() throws Exception {
	    cronosStep.cargaPagina();
	}


	@When("^se selecciona fechaini \"([^\"]*)\" y fechafin \"([^\"]*)\"$")
	public void seSeleccionaFechainiYFechafin(String fechaIni, String fechaFin) throws Exception {
	    cronosStep.escribirFiltros(fechaIni, fechaFin);
	}

	@Then("^se muestra el resultado de \"([^\"]*)\"$")
	public void seMuestraElResultadoDe(String resultado) throws Exception {
	   cronosStep.verificarResultado(resultado);
	}
}
