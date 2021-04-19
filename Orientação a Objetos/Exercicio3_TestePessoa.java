package Class3;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		
		p1.setNome("Maria de Fátima");
		
		p1.setIdade(60);
		
		p1.setTelefone("(11) 00000-0000");
		
		System.out.println("O nome é: " + p1.getNome());
		
		System.out.println("A idade é: " + p1.getIdade());
		
		System.out.println("O numero é: " + p1.getTelefone());

	}

}
