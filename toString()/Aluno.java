package Class6;

public class Aluno {

	private String nome;
	private String prontuario;
	
	public Aluno () {
		this.nome = "";
		this.prontuario = "";
	}
	
	public Aluno (String nome, String prontuario) {
		this.nome = nome;
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	public String toString() {
		return "Aluno [Nome:" +nome +"," +" Prontuário:" +prontuario +"]";
	}
}
