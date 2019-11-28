package fluentlenium.teste;

import static org.junit.Assert.*;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;

import fluentlenium.page.PaginaCadastraFuncionario;
import fluentlenium.page.PaginaEditarFuncionario;
import io.github.bonigarcia.wdm.WebDriverManager;

@Wait
@FluentConfiguration(webDriver="chrome")
public class EditarFuncionario extends FluentTest{

	@Page PaginaEditarFuncionario paginaEditarFuncionario;
	
	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
