package Class4;

public class TesteRG {
	
	public static void main(String[] args) {
		
		RG rg1 = new RG();
		
		rg1.setNome("Geovanna Lima");

		rg1.setDataEmissao("15/09/2013");
		
		rg1.setNumero("125.558.785/85");
		
		System.out.println("O nome do emissor é:" + rg1.getNome());
		
		System.out.println("A data de emissão é:" + rg1.getDataEmissao());

		System.out.println("O número do RG é:" + rg1.getNumero());

	}


}
