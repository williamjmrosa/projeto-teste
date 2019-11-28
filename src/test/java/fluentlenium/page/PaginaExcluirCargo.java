package fluentlenium.page;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.fluentlenium.assertj.FluentLeniumAssertions;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Data;

@PageUrl("http://localhost:8080/cargos/listar")
public class PaginaExcluirCargo extends FluentPage{
	
	@FindBy(id = "btn_cargos/excluir/6")
	private FluentWebElement excluir;
	
	@FindBy(id = "ok_confirm")
	private FluentWebElement aceitarExcluir;
	
	public FluentWebElement getExcluir() {
		return excluir;
	}

	public void setExcluir(FluentWebElement excluir) {
		this.excluir = excluir;
	}

	public FluentWebElement getAceitarExcluir() {
		return aceitarExcluir;
	}

	public void setAceitarExcluir(FluentWebElement aceitarExcluir) {
		this.aceitarExcluir = aceitarExcluir;
	}

	public void isAt() {
        assertThat(window().title()).isEqualTo("Spring-Boot Básico");
        
    }
}
