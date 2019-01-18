package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class DemoPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"login\"]/form/input[1]")
	public WebElementFacade txtUsuario;
	
	@FindBy(xpath="//*[@id=\"login\"]/form/input[2]")
	public WebElementFacade txtClave;
	
	@FindBy(xpath="//*[@id=\"login\"]/form/button")
	public WebElementFacade btnSignIn;
	
	@FindBy(id="bootstrap-admin-template")
	public WebElementFacade lblTitulo;
	
	
	public void realizarAutenticacion(String usuario, String clave) {
		// TODO Auto-generated method stub
		txtUsuario.sendKeys(usuario);
		txtClave.sendKeys(clave);
		btnSignIn.click();
	}
	
	
	public void verificarTitulo(String tituloPantalla) {
		// TODO Auto-generated method stub
		String strMensaje=lblTitulo.getText();
		assertThat(strMensaje, Matchers.containsString(tituloPantalla));
	}

}
