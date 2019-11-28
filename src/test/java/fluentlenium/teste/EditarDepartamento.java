package fluentlenium.teste;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import static org.junit.Assert.*;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;

import fluentlenium.page.PaginaEditarDep;
import io.github.bonigarcia.wdm.WebDriverManager;

@Wait
@FluentConfiguration(webDriver="chrome")
public class EditarDepartamento extends FluentTest{

	@Page PaginaEditarDep paginaListarDep;
	
	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	 @Test
	 public void verificaEditarDepartamento() {
		 paginaListarDep.go();
		 paginaListarDep.isAt();
		 paginaListarDep.getEditar().click();
		 paginaListarDep.getNomeCampo().fill().with("Nome editado");
		 paginaListarDep.getEnviar().submit();
		 assertThat($(".alerta")).hasText("Departamento editado com sucesso.");


	 }

}
