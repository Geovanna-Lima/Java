package Class12;

public class Chefe extends Empregado {

	private Double salario;
	
	public Chefe() {
		super();
		this.salario = 0.0;
	}
	
	public Chefe(String nome, Double salario) {
		super(nome);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double calcularSalario() {
		return this.salario;
	}
	
	public String toString() {
		return super.toString() +" Salário: " +this.salario +"]";
	}
}