package co.com.eafit.steps;

import co.com.eafit.pageobject.DemoPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

public class DemoStep {

	DemoPage demoPage;

	@Step
	public void cargaUrl() {
		demoPage.open();
	}

	public void escribirCredenciales(String usuario, String clave) {
		// TODO Auto-generated method stub
		demoPage.realizarAutenticacion(usuario,clave);
	}

	public void verificarAcceso(String tituloPantalla) {
		// TODO Auto-generated method stub
		demoPage.verificarTitulo(tituloPantalla);
	}

}
