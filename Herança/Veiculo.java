package Class7;

public class Veiculo {

	private String modelo;
	private String marca;
	
	public Veiculo() {
		this.modelo = "";
		this.marca = "";
	}
	
	public Veiculo(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String toString() {
		return "Veiculo [Modelo:" +modelo +", Marca:" +marca +",";
	}
}
