package Class3;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Geovanna");

		a1.setIdade(17);
		
		a1.setProntuario("SP3029034");
		
		System.out.println("O nome do aluno é:" + a1.getNome());
		
		System.out.println("A idade do aluno é:" + a1.getIdade());

		System.out.println("O prontuario do aluno é:" + a1.getProntuario());

	}

}
