package fluentlenium.teste;

import static org.junit.Assert.*;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;

import fluentlenium.page.PaginaListarDep;
import io.github.bonigarcia.wdm.WebDriverManager;

@Wait
@FluentConfiguration(webDriver="chrome")
public class EditarDepartamento extends FluentTest{

	@Page PaginaListarDep paginaListarDep;
	
	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	 @Test
	 public void verificaCadastroFuncionario() {
		 paginaListarDep.go();
		 paginaListarDep.isAt();
		 paginaListarDep.getEditar().click();
		 paginaListarDep.getNomeCampo().fill().with("Nome editado");
		 paginaListarDep.getEnviar().submit();
	 }

}
