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
public class CadastroCargoTest extends FluentTest{



	@Page
	PaginaCargo paginaCargo;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void test() {
		paginaCargo.go();
		paginaCargo.isAt();
		paginaCargo.getNome().fill().with("Gerente");
		paginaCargo.getDepartamento().fillSelect().withText("Adm");
		paginaCargo.getSalvar().submit();
		
	}

}
