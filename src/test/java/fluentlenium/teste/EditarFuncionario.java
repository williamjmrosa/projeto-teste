package fluentlenium.teste;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
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
	 public void verificaEditarFuncionario() {
		 paginaEditarFuncionario.go();
		 paginaEditarFuncionario.isAt();
		 paginaEditarFuncionario.getBotãoEditar().click();
		 paginaEditarFuncionario.getFuncionarioBairro().fill().with("Bairro 1");
		 paginaEditarFuncionario.getFuncionarioCep().fill().with("91110433");
		 paginaEditarFuncionario.getFuncionarioCidade().fill().with("São Leopoldo");
		 paginaEditarFuncionario.getFuncionarioComplemento().fill().with("Casa");
		 paginaEditarFuncionario.getFuncionarioLogradouro().fill().with("Logradouro");
		 paginaEditarFuncionario.getFuncionarioNumero().fill().with("90");
		 paginaEditarFuncionario.getFuncionarioUf().fillSelect().withText("RS");
		 paginaEditarFuncionario.getFuncionarioCargo().fillSelect().withText("Gerente");
		 paginaEditarFuncionario.getDataFuncionario().fill().with("29112019");
		 paginaEditarFuncionario.getFuncionarioEnviar().submit();
		 assertThat($(".alerta")).hasText("Funcionário editado com sucesso.");
	 }
}
