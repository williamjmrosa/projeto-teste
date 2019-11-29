package fluentlenium.teste;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;

import fluentlenium.page.PaginaCadastraFuncionario;
import io.github.bonigarcia.wdm.WebDriverManager;
@Wait
@FluentConfiguration(webDriver="chrome")
public class CadastrarFuncionario extends FluentTest{

	@Page PaginaCadastraFuncionario paginaCadastrarFuncionario;
	
	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	 @Test
	 public void cadastrarFuncioanrio()
	 {
		 paginaCadastrarFuncionario.go();
		 paginaCadastrarFuncionario.isAt();
		 paginaCadastrarFuncionario.getNomeFuncionario().fill().with("Melissa");
		 paginaCadastrarFuncionario.getSalarioFuncionario().fill().with("120000");
		 paginaCadastrarFuncionario.getDataFuncionario().fill().with("12112019");
		 paginaCadastrarFuncionario.getFuncionarioCargo().fillSelect().withText("Gerente");
		 paginaCadastrarFuncionario.getFuncionarioCidade().fill().with("São Leopoldo");
		 paginaCadastrarFuncionario.getFuncionarioComplemento().fill().with("complemento");
		 paginaCadastrarFuncionario.getFuncionarioLogradouro().fill().with("casa");
		 paginaCadastrarFuncionario.getFuncionarioCep().fill().with("92120890");
		 paginaCadastrarFuncionario.getFuncionarioBairro().fill().with("Bairro 1");
		 paginaCadastrarFuncionario.getFuncionarioUf().fillSelect().withText("RS");
		 paginaCadastrarFuncionario.getFuncionarioNumero().fill().with("120");
		 paginaCadastrarFuncionario.getFuncionarioEnviar().submit();
		 assertThat($(".alerta")).hasText("Funcionário inserido com sucesso."); 
	 }
	 @Test
	 public void cadastrarFuncioanrioComDataDeSaidaInferiorADataDeEntrada()
	 {
		 paginaCadastrarFuncionario.go();
		 paginaCadastrarFuncionario.isAt();
		 paginaCadastrarFuncionario.getNomeFuncionario().fill().with("Eduarda");
		 paginaCadastrarFuncionario.getSalarioFuncionario().fill().with("120000");
		 paginaCadastrarFuncionario.getDataFuncionario().fill().with("12112019");
		 paginaCadastrarFuncionario.getDataSaidaFuncionario().fill().with("11112019");
		 paginaCadastrarFuncionario.getFuncionarioCargo().fillSelect().withText("Gerente");
		 paginaCadastrarFuncionario.getFuncionarioCidade().fill().with("São Leopoldo");
		 paginaCadastrarFuncionario.getFuncionarioComplemento().fill().with("complemento");
		 paginaCadastrarFuncionario.getFuncionarioLogradouro().fill().with("casa");
		 paginaCadastrarFuncionario.getFuncionarioCep().fill().with("92120890");
		 paginaCadastrarFuncionario.getFuncionarioBairro().fill().with("Bairro 1");
		 paginaCadastrarFuncionario.getFuncionarioUf().fillSelect().withText("RS");
		 paginaCadastrarFuncionario.getFuncionarioNumero().fill().with("120");
		 paginaCadastrarFuncionario.getFuncionarioEnviar().submit();
		 assertThat($("span")).hasText("Data de saída deve ser posterior a data de entrada."); 
	 }
	 
	 @Test
	 public void cadastrarFuncioanrioComNomeInvalido()
	 {
		 paginaCadastrarFuncionario.go();
		 paginaCadastrarFuncionario.isAt();
		 paginaCadastrarFuncionario.getNomeFuncionario().fill().with("a");
		 paginaCadastrarFuncionario.getSalarioFuncionario().fill().with("120000");
		 paginaCadastrarFuncionario.getDataFuncionario().fill().with("12112019");
		 paginaCadastrarFuncionario.getDataSaidaFuncionario().fill().with("11112019");
		 paginaCadastrarFuncionario.getFuncionarioCargo().fillSelect().withText("Gerente");
		 paginaCadastrarFuncionario.getFuncionarioCidade().fill().with("São Leopoldo");
		 paginaCadastrarFuncionario.getFuncionarioComplemento().fill().with("complemento");
		 paginaCadastrarFuncionario.getFuncionarioLogradouro().fill().with("casa");
		 paginaCadastrarFuncionario.getFuncionarioCep().fill().with("120890");
		 paginaCadastrarFuncionario.getFuncionarioBairro().fill().with("Bairro 1");
		 paginaCadastrarFuncionario.getFuncionarioUf().fillSelect().withText("RS");
		 paginaCadastrarFuncionario.getFuncionarioNumero().fill().with("120");
		 paginaCadastrarFuncionario.getFuncionarioEnviar().submit();
		 assertThat($("span")).hasText("Deve estar entre 3 e 255 caracteres."); 
	 }
	 @Test
	 public void cadastrarFuncioanrioComCepInvalido()
	 {
		 paginaCadastrarFuncionario.go();
		 paginaCadastrarFuncionario.isAt();
		 paginaCadastrarFuncionario.getNomeFuncionario().fill().with("Carlos");
		 paginaCadastrarFuncionario.getSalarioFuncionario().fill().with("120000");
		 paginaCadastrarFuncionario.getDataFuncionario().fill().with("12112019");
		 paginaCadastrarFuncionario.getDataSaidaFuncionario().fill().with("11112019");
		 paginaCadastrarFuncionario.getFuncionarioCargo().fillSelect().withText("Gerente");
		 paginaCadastrarFuncionario.getFuncionarioCidade().fill().with("São Leopoldo");
		 paginaCadastrarFuncionario.getFuncionarioComplemento().fill().with("complemento");
		 paginaCadastrarFuncionario.getFuncionarioLogradouro().fill().with("casa");
		 paginaCadastrarFuncionario.getFuncionarioCep().fill().with("120890");
		 paginaCadastrarFuncionario.getFuncionarioBairro().fill().with("Bairro 1");
		 paginaCadastrarFuncionario.getFuncionarioUf().fillSelect().withText("RS");
		 paginaCadastrarFuncionario.getFuncionarioNumero().fill().with("120");
		 paginaCadastrarFuncionario.getFuncionarioEnviar().submit();
		 assertThat($("span")).hasText("Deve conter 9 caracteres."); 
	 }
}
