package fluentlenium.page;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import org.fluentlenium.assertj.FluentLeniumAssertions;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("http://localhost:8080/departamentos/cadastrar")

public class PaginaDepartamento extends FluentPage{

    @FindBy(id = "nome")
	private FluentWebElement nomeCampo;
    @FindBy(css = "button.btn.btn-primary.btn-sm")
    private FluentWebElement enviar;
    
    public FluentWebElement getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(FluentWebElement nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public FluentWebElement getEnviar() {
		return enviar;
	}

	public void setEnviar(FluentWebElement enviar) {
		this.enviar = enviar;
	}

	public void isAt() {
        assertThat(window().title()).isEqualTo("Spring-Boot Básico");
        
    }
}

