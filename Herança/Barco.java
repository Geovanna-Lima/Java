package Class7;

public class Barco extends Veiculo {

	private Integer potenciaMotor ;
	
	public Barco() {
		super();
		this.potenciaMotor = 0;
	}
	
	public Barco(String modelo, String marca, Integer potenciaMotor) {
		super(modelo, marca);
		this.potenciaMotor = potenciaMotor;
	}

	public Integer getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(Integer potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public String toString() {
		return super.toString() +" Pontencia do Motor:" +potenciaMotor +"]";
	}
}
