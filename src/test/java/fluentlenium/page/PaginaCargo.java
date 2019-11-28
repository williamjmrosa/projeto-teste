package fluentlenium.page;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.fluentlenium.assertj.FluentLeniumAssertions;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Data;

@PageUrl("http://localhost:8080/cargos/cadastrar")
public class PaginaCargo extends FluentPage{
	
	@FindBy(id = "nome")
    private FluentWebElement nome;

	@FindBy(id = "departamento")
	private FluentWebElement departamento;
	
    @FindBy(css = "button.btn.btn-primary.btn-sm")
    private FluentWebElement salvar;

    
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
