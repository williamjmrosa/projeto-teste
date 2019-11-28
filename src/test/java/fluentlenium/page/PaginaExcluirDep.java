package fluentlenium.page;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
@PageUrl("http://localhost:8080/departamentos/listar")

public class PaginaExcluirDep extends FluentPage{

	@FindBy(id = "btn_departamentos/excluir/2")
	private FluentWebElement excluir;
	
	@FindBy(id = "ok_confirm")
	private FluentWebElement aceitarExcluir;
	
	public FluentWebElement getAceitarExcluir() {
		return aceitarExcluir;
	}

	public void setAceitarExcluir(FluentWebElement aceitarExcluir) {
		this.aceitarExcluir = aceitarExcluir;
	}
	public FluentWebElement getExcluir() {
		return excluir;
	}

	public void setExcluir(FluentWebElement excluir) {
		this.excluir = excluir;
	}
	
	public void isAt() {
        assertThat(window().title()).isEqualTo("Spring-Boot Básico");
               
    }
}
