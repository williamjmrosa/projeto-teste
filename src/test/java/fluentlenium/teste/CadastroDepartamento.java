package fluentlenium.teste;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import fluentlenium.page.PaginaDepartamento;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import org.fluentlenium.assertj.FluentLeniumAssertions;

@Wait
@FluentConfiguration(webDriver="chrome")
public class CadastroDepartamento extends FluentTest{

	@Page PaginaDepartamento paginaDepartamento;
	 
	 @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	 
	 @Test
	 public void verificaCadastroDepartamento() {
		 paginaDepartamento.go();
		 paginaDepartamento.isAt();
		 paginaDepartamento.getNomeCampo().fill().with("Contabilidade");
		 paginaDepartamento.getEnviar().submit();
		 assertThat($(".alerta")).hasText("Departamento inserido com sucesso.");
	 }
	 
	 @Test
	 public void cadastroComUmCaracteres()
	 {
		 paginaDepartamento.go();
		 paginaDepartamento.isAt();
		 paginaDepartamento.getNomeCampo().fill().with("A");
		 paginaDepartamento.getEnviar().submit();
		 assertThat($("span")).hasText("O nome do departamento deve ter entre 3 e 60 caracteres.");
	 }
	 @Test
	 public void cadastroSemCaracteres()
	 {
		 paginaDepartamento.go();
		 paginaDepartamento.isAt();
		 paginaDepartamento.getNomeCampo().fill().with("");
		 paginaDepartamento.getEnviar().submit();
		 assertThat($("span")).hasText("O nome do departamento deve ter entre 3 e 60 caracteres.");
		 assertThat($("span")).hasText("Informe um nome.");
	 }
	 
}
