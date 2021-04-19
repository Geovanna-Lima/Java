package Class4;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setMarca("Fiat");

		c1.setModelo("Uno");
		
		c1.setPlaca("GEO-0708");
		
		System.out.println("A marca do carro é:" + c1.getMarca());
		
		System.out.println("O modelo do carro é:" + c1.getModelo());

		System.out.println("A placa do carro é:" + c1.getPlaca());

	}

}
