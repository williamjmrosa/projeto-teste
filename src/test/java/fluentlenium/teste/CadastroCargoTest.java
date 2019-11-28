package fluentlenium.teste;

import io.github.bonigarcia.wdm.WebDriverManager;
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

import fluentlenium.page.PaginaCargo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.with;

@RunWith(SpringRunner.class)
@Wait
@FluentConfiguration(webDriver = "chrome")
public class CadastroCargoTest extends FluentTest {

	@Page
	PaginaCargo paginaCargo;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void testCadastro() {
		paginaCargo.go();
		paginaCargo.isAt();
		paginaCargo.getNome().fill().with("Gerentes");
		paginaCargo.getDepartamento().fillSelect().withText("Recursos Humanos");
		paginaCargo.getSalvar().submit();
		assertThat($(".alerta")).hasText("Cargo inserido com sucesso.");

	}
	
	@Test
	public void testCadastroMinimoCaracteres() {
		paginaCargo.go();
		paginaCargo.isAt();
		paginaCargo.getNome().fill().with("Ge");
		paginaCargo.getDepartamento().fillSelect().withText("Recursos Humanos");
		paginaCargo.getSalvar().submit();
		assertThat($("span")).hasText("O nome do cargo deve conter no máximo 60 caracteres e no mínimo três caracteres.");

	}
	
	@Test
	public void testCadastroMaximoCaracteres() {
		paginaCargo.go();
		paginaCargo.isAt();
		paginaCargo.getNome().fill().with("Gerentessssssssssssssssssssssssssssssssssssssssssssssssssssss");
		paginaCargo.getDepartamento().fillSelect().withText("Recursos Humanos");
		paginaCargo.getSalvar().submit();
		assertThat($("span")).hasText("O nome do cargo deve conter no máximo 60 caracteres e no mínimo três caracteres.");

	}

}
