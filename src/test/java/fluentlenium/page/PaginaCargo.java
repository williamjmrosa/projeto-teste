package fluentlenium.page;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.fluentlenium.assertj.FluentLeniumAssertions;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("http://localhost:8080/cargos/cadastrar")
public class PaginaCargo extends FluentPage{
	
	@FindBy(id = "nome")
    private FluentWebElement nome;

	@FindBy(id = "departamento")
	private FluentWebElement departamento;
	
    @FindBy(css = "form.button")
    private FluentWebElement salvar;

    public void isAt() {
        assertThat(window().title()).isEqualTo("Spring-Boot Básico");
        
    }
}
