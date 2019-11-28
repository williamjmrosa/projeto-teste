package fluentlenium.page;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("http://localhost:8080/funcionarios/cadastrar")
public class PaginaCadastraFuncionario extends FluentPage{

	@FindBy(css = "button.btn.btn-primary.btn-sm")
	private FluentWebElement funcionarioEnviar;
	
	@FindBy(id = "dataSaida")
	private FluentWebElement dataSaidaFuncionario;
	
	@FindBy(id = "nome")
	private FluentWebElement nomeFuncionario;
	
	@FindBy(id = "salario")
	private FluentWebElement salarioFuncionario;
	
	@FindBy(id = "dataEntrada")
	private FluentWebElement dataFuncionario;
	
	@FindBy(id = "cargo")
	private FluentWebElement funcionarioCargo;
	
	@FindBy(id = "logradouro")
	private FluentWebElement funcionarioLogradouro;
	
	@FindBy(id = "cidade")
	private FluentWebElement funcionarioCidade;
	
	@FindBy(id = "numero")
	private FluentWebElement funcionarioNumero;
	
	@FindBy(id = "complemento")
	private FluentWebElement funcionarioComplemento;
	
	@FindBy(id = "bairro")
	private FluentWebElement funcionarioBairro;
	
	@FindBy(id = "uf")
	private  FluentWebElement funcionarioUf;
	
	@FindBy(id = "cep")
	private FluentWebElement funcionarioCep;

	
	public FluentWebElement getDataSaidaFuncionario() {
		return dataSaidaFuncionario;
	}

	public void setDataSaidaFuncionario(FluentWebElement dataSaidaFuncionario) {
		this.dataSaidaFuncionario = dataSaidaFuncionario;
	}
	
	public FluentWebElement getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(FluentWebElement nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public FluentWebElement getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(FluentWebElement salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public FluentWebElement getDataFuncionario() {
		return dataFuncionario;
	}

	public void setDataFuncionario(FluentWebElement dataFuncionario) {
		this.dataFuncionario = dataFuncionario;
	}

	public FluentWebElement getFuncionarioCargo() {
		return funcionarioCargo;
	}

	public void setFuncionarioCargo(FluentWebElement funcionarioCargo) {
		this.funcionarioCargo = funcionarioCargo;
	}

	public FluentWebElement getFuncionarioLogradouro() {
		return funcionarioLogradouro;
	}

	public void setFuncionarioLogradouro(FluentWebElement funcionarioLogradouro) {
		this.funcionarioLogradouro = funcionarioLogradouro;
	}

	public FluentWebElement getFuncionarioCidade() {
		return funcionarioCidade;
	}

	public void setFuncionarioCidade(FluentWebElement funcionarioCidade) {
		this.funcionarioCidade = funcionarioCidade;
	}

	public FluentWebElement getFuncionarioNumero() {
		return funcionarioNumero;
	}

	public void setFuncionarioNumero(FluentWebElement funcionarioNumero) {
		this.funcionarioNumero = funcionarioNumero;
	}

	public FluentWebElement getFuncionarioComplemento() {
		return funcionarioComplemento;
	}

	public void setFuncionarioComplemento(FluentWebElement funcionarioComplemento) {
		this.funcionarioComplemento = funcionarioComplemento;
	}

	public FluentWebElement getFuncionarioBairro() {
		return funcionarioBairro;
	}

	public void setFuncionarioBairro(FluentWebElement funcionarioBairro) {
		this.funcionarioBairro = funcionarioBairro;
	}

	public FluentWebElement getFuncionarioUf() {
		return funcionarioUf;
	}

	public void setFuncionarioUf(FluentWebElement funcionarioUf) {
		this.funcionarioUf = funcionarioUf;
	}

	public FluentWebElement getFuncionarioCep() {
		return funcionarioCep;
	}

	public FluentWebElement getFuncionarioEnviar() {
		return funcionarioEnviar;
	}

	public void setFuncionarioEnviar(FluentWebElement funcionarioEnviar) {
		this.funcionarioEnviar = funcionarioEnviar;
	}

	public void setFuncionarioCep(FluentWebElement funcionarioCep) {
		this.funcionarioCep = funcionarioCep;
	}
	public void isAt() {
        assertThat(window().title()).isEqualTo("Spring-Boot Básico");
    }
}
