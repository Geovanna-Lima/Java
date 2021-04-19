package Class7;

public class Moto extends Veiculo {

	private Integer qntCilindradas;
	
	public Moto() {
		super();
		this.qntCilindradas = 0;
	}
	
	public Moto(String modelo, String marca, Integer qntCilindradas) {
		super(modelo, marca);
		this.qntCilindradas = qntCilindradas;
	}

	public Integer getQntCilindradas() {
		return qntCilindradas;
	}

	public void setQntCilindradas(Integer qntCilindradas) {
		this.qntCilindradas = qntCilindradas;
	}
	
	public String toString() {
		return super.toString() +" Quantidade de Cilindradas:" +qntCilindradas +"]";
	}
}
