package Class3;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		
		p1.setNome("Maria de F�tima");
		
		p1.setIdade(60);
		
		p1.setTelefone("(11) 00000-0000");
		
		System.out.println("O nome �: " + p1.getNome());
		
		System.out.println("A idade �: " + p1.getIdade());
		
		System.out.println("O numero �: " + p1.getTelefone());

	}

}
