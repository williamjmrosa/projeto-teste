package fluentlenium.teste;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;
import fluentlenium.page.PaginaEditarFuncionario;
import fluentlenium.page.PaginaExcluirFuncionario;
import io.github.bonigarcia.wdm.WebDriverManager;

@Wait
@FluentConfiguration(webDriver="chrome")
public class ExcluirFuncionario extends FluentTest{

	@Page PaginaExcluirFuncionario paginaExcluirFuncionario;
	
	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	 
	 
	 @Test
	 public void verificaExcluirFuncionairo()
	 {
		 paginaExcluirFuncionario.go();
		 paginaExcluirFuncionario.isAt();
		 paginaExcluirFuncionario.getExcluir().click();
		 paginaExcluirFuncionario.getAceitarExcluir().click();
		 assertThat($(".alerta")).hasText("Funcionário removido com sucesso.");
	 }
}
