package Class4;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno al1 = new Aluno();
		
		al1.setNome("Geovanna Lima");

		al1.setIdentidade("Geovanna", "15/09/2013", "125.558.785/86");
		
		al1.setProntuario("SP0257896");
		
		System.out.println("O nome do aluno é:" + al1.getNome());
		
		System.out.println("A os dados da identidade são:" + al1.getIdentidade());

		System.out.println("O número do prontuário é:" + al1.getProntuario());


	}

}
