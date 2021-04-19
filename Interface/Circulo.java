package Class8;

public class Circulo implements FormaGeometrica {

	private Double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public String apresentar() {
		return "Circulo [Raio:" +this.raio +"]";
	}
 }
