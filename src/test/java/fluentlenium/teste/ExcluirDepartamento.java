package fluentlenium.teste;

import static org.junit.Assert.*;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;

import fluentlenium.page.PaginaExcluirDep;
import fluentlenium.page.PaginaEditarDep;
import io.github.bonigarcia.wdm.WebDriverManager;

@Wait
@FluentConfiguration(webDriver="chrome")
public class ExcluirDepartamento extends FluentTest{


	@Page PaginaExcluirDep paginaExcluirDep;
	

	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	 @Test
	 public void verificaExcluirDepartamento() {
		 paginaExcluirDep.go();
		 paginaExcluirDep.isAt();
		 paginaExcluirDep.getExcluir().click();
		 paginaExcluirDep.getAceitarExcluir().click();
	 }

}
