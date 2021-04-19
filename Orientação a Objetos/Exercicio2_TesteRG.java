package Class3;

public class TesteRG {

	public static void main(String[] args) {
		
		RG rg1 = new RG();
		
		rg1.setNome("Geovanna");
		
		rg1.setDataEmissao("05/12/2013");

		rg1.setNumero("00.000.000-0");

		System.out.println("O nome é: " + rg1.getNome());

		System.out.println("A data de emissão é: " + rg1.getDataEmissao());

		System.out.println("O número é: " + rg1.getNumero());

	}

}
