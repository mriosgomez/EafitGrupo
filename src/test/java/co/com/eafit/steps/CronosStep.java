package co.com.eafit.steps;

import co.com.eafit.pageobject.CronosPage;
import net.thucydides.core.annotations.Step;

public class CronosStep {
	
	CronosPage cronosPage;
	
	@Step
	public void cargaPagina() {
		cronosPage.open();
	}

	public void escribirFiltros(String fechaIni, String fechaFin) {
		// TODO Auto-generated method stub
		cronosPage.ingresarFiltros(fechaIni, fechaFin);
	}

	public void verificarResultado(String resultado) {
		// TODO Auto-generated method stub
		cronosPage.verificarRespuesta(resultado);
	}
}
