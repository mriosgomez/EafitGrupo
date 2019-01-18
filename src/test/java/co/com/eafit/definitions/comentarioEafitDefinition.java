package co.com.eafit.definitions;

import co.com.eafit.steps.ComentarioEafitSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class comentarioEafitDefinition {

	@Steps
	ComentarioEafitSteps comentarioEafitSteps;
	
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
	   comentarioEafitSteps.abrirUrl();
	}


	@When("^el diligencia el comentario$")
	public void elDiligenciaElComentario(DataTable dtDatos) throws Exception {
		comentarioEafitSteps.diligenciarComentario(dtDatos);
	}

	@Then("^el visualiza el pantalla el mensaje \"([^\"]*)\"$")
	public void elVisualizaElPantallaElMensaje(String mensaje) throws Exception {
		comentarioEafitSteps.verificarMensaje(mensaje);
	}
	
}
