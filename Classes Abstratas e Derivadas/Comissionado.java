package Class12;

public class Comissionado extends Empregado {

	private Double salarioBase;
	private Integer comissao;
	
	public Comissionado() {
		super();
		this.salarioBase = 0.0;
		this.comissao = 0;
	}
	
	public Comissionado(String nome, Double salarioBase, Integer comissao) {
		super(nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Integer getComissao() {
		return comissao;
	}

	public void setComissao(Integer comissao) {
		this.comissao = comissao;
	}
	
	public Double calcularSalario() {
		return this.salarioBase + this.comissao;
	}
	
	public String toString() {
		return super.toString() +" Salário Base: " +this.salarioBase +", Comissão: " +this.comissao +"]";
	}
}
