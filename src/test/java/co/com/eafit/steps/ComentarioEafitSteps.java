package co.com.eafit.steps;

import co.com.eafit.pageobject.ComentarioEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ComentarioEafitSteps {

	ComentarioEafitPage comentarioEafitPage;
	
	@Step
	public void abrirUrl() {
		
		comentarioEafitPage.open();
	}

	public void diligenciarComentario(DataTable dtDatos) {
		// TODO Auto-generated method stub
		comentarioEafitPage.ingresarDatosComentariod(dtDatos);
	}

	public void verificarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		comentarioEafitPage.validarMensaje(mensaje);
		
	}
	
	
}
