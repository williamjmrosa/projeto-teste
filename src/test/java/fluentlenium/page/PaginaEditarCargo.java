package fluentlenium.page;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.fluentlenium.assertj.FluentLeniumAssertions;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Data;

@PageUrl("http://localhost:8080/cargos/listar")
public class PaginaEditarCargo extends FluentPage{
	
	@FindBy(css = "a.btn.btn-info.btn-sm")
    private FluentWebElement editar;
	
	@FindBy(css = "button.btn.btn-primary.btn-sm")
    private FluentWebElement enviar;
	
	@FindBy(id = "nome")
    private FluentWebElement nome;

	@FindBy(id = "departamento")
	private FluentWebElement departamento;
	
    @FindBy(css = "button.btn.btn-primary.btn-sm")
    private FluentWebElement salvar;
    
	public FluentWebElement getEditar() {
		return editar;
	}

	public void setEditar(FluentWebElement editar) {
		this.editar = editar;
	}

	public FluentWebElement getEnviar() {
		return enviar;
	}

	public void setEnviar(FluentWebElement enviar) {
		this.enviar = enviar;
	}

	public FluentWebElement getNome() {
		return nome;
	}

	public void setNome(FluentWebElement nome) {
		this.nome = nome;
	}

	public FluentWebElement getDepartamento() {
		return departamento;
	}

	public void setDepartamento(FluentWebElement departamento) {
		this.departamento = departamento;
	}

	public FluentWebElement getSalvar() {
		return salvar;
	}

	public void setSalvar(FluentWebElement salvar) {
		this.salvar = salvar;
	}

	public void isAt() {
        assertThat(window().title()).isEqualTo("Spring-Boot Básico");
        
    }
}
