package Class12;

public abstract class Empregado {

	private String nome;
	
	public Empregado() {
		this.nome = "";
	}
	
	public Empregado(String nome ) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract Double calcularSalario();
	
	public String toString() {
		return "[Nome:" +this.nome +",";
	}
}
