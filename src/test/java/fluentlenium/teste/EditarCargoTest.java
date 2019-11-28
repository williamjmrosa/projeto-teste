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
import fluentlenium.page.PaginaEditarCargo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.with;

@RunWith(SpringRunner.class)
@Wait
@FluentConfiguration(webDriver = "chrome")
public class EditarCargoTest extends FluentTest {

	@Page
	PaginaEditarCargo editarCargo;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void testEditar() {
		editarCargo.go();
		editarCargo.isAt();
		editarCargo.getEditar().click();
		editarCargo.getNome().fill().with("Gerentes");
		editarCargo.getDepartamento().fillSelect().withText("Adm");
		editarCargo.getSalvar().submit();
		assertThat($(".alerta")).hasText("Registro atualizado com sucesso.");

	}
	
	@Test
	public void testEditarMinimoCaracteres() {
		editarCargo.go();
		editarCargo.isAt();
		editarCargo.getEditar().click();
		editarCargo.getNome().fill().with("Ge");
		editarCargo.getDepartamento().fillSelect().withText("Recursos Humanos");
		editarCargo.getSalvar().submit();
		assertThat($("span")).hasText("O nome do cargo deve conter no máximo 60 caracteres e no mínimo três caracteres.");

	}
	
	@Test
	public void testEditarMaximoCaracteres() {
		editarCargo.go();
		editarCargo.isAt();
		editarCargo.getEditar().click();
		editarCargo.getNome().fill().with("Gerentessssssssssssssssssssssssssssssssssssssssssssssssssssss");
		editarCargo.getDepartamento().fillSelect().withText("Recursos Humanos");
		editarCargo.getSalvar().submit();
		assertThat($("span")).hasText("O nome do cargo deve conter no máximo 60 caracteres e no mínimo três caracteres.");

	}

}
