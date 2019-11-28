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
import fluentlenium.page.PaginaExcluirCargo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.with;

@RunWith(SpringRunner.class)
@Wait
@FluentConfiguration(webDriver = "chrome")
public class ExcluirCargoTest extends FluentTest {

	@Page
	PaginaExcluirCargo excluirCargo;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void testEditar() {
		excluirCargo.go();
		excluirCargo.isAt();
		excluirCargo.getExcluir().click();
		excluirCargo.getAceitarExcluir().click();
		assertThat($(".alerta")).hasText("Cargo excluido com sucesso.");

	}

}
