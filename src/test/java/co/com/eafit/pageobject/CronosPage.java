package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tapp.eafit.edu.co/cronosServicios/faces/bienes/crxConsultasRequerimientos.xhtml")
public class CronosPage extends PageObject {

	@FindBy(id="formData:fechaDesdeF_input")
	public WebElementFacade txtFechaIni;
	
	@FindBy(id="formData:fechaHastaF_input")
	public WebElementFacade txtFechaFin;
	
	@FindBy(xpath="//*[@id=\"formData:consultarRequerimiento\"]/span[2]")
	public WebElementFacade btnConsultar;
	
	@FindBy(id="bootstrap-admin-template")
	public WebElementFacade lblResultado;
	
	
	public void ingresarFiltros(String fechaIni, String fechaFin) {
		// TODO Auto-generated method stub
		txtFechaIni.sendKeys(fechaIni);
		txtFechaFin.sendKeys(fechaFin);
		btnConsultar.click();
	}
	
	
	public void verificarRespuesta(String resultado) {
		// TODO Auto-generated method stub
		String strMensaje=lblResultado.getText();
		assertThat(strMensaje, Matchers.containsString(resultado));
	}
	
	
}
