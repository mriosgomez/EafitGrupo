package co.com.eafit.definitions;

import co.com.eafit.steps.DemoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoDefinitions {
	
	@Steps
	DemoStep demoStep;
	
	
	
	@Given("^que Yeison quiere acceder a Metis$")
	public void queYeisonQuiereAccederAMetis() throws Exception {
		demoStep.cargaUrl();
		
	}

	@When("^en escribe el usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
	public void enEscribeElUsuarioYLaClave(String usuario, String clave) throws Exception {
		demoStep.escribirCredenciales(usuario,clave);
	}

	@Then("^el ve el mensaje de \"([^\"]*)\"$")
	public void elVeElMensajeDe(String tituloPantalla) throws Exception {
		demoStep.verificarAcceso(tituloPantalla);
	}

}
