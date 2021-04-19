package Class8;

public class Quadrado implements FormaGeometrica {

	private Double base;
	private Double altura;
	
	public Quadrado(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Double area() {
		return base * altura;
	}
	
	public String apresentar() {
		return "Quadrado [Base:" +this.base +", Altura:" +this.altura +"]";
	}
}
