package Class7;

public class Carro extends Veiculo {

	private Integer qntPortas;
	
	public Carro() {
		super();
		this.qntPortas = 0;
	}
	
	public Carro(String modelo, String marca, Integer qntPortas) {
		super(modelo, marca);
		this.qntPortas = qntPortas;
	}

	public Integer getQntPortas() {
		return qntPortas;
	}

	public void setQntPortas(Integer qntPortas) {
		this.qntPortas = qntPortas;
	}
	
	public String toString() {
		return super.toString() +" Quantidade de Portas:" +qntPortas +"]";
	}
}
