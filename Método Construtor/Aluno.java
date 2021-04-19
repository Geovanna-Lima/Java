package Class4;

public class Aluno {

	private String nome;
	private RG identidade;
	private String prontuario;
	
	public Aluno() {
		this. nome = "";
		this. identidade = new RG();
		this. prontuario = "";
	}
	public Aluno(String nome, RG identidade, String prontuario) {
		this. nome = nome;
		this. identidade = identidade;
		this. prontuario = prontuario;
	}
	 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
	
		this.nome = nome;
	}
	
	public String getIdentidade() {
		return "\n" +identidade.getNome() +"\n" +identidade.getDataEmissao() +"\n" +identidade.getNumero();
	}
	
	public void setIdentidade(String nome, String dataEmissao, String numero) {
		
		this.identidade = new RG(nome, dataEmissao, numero);
	}
	
	public String getProntuario() {
		return prontuario;
	}
	
	public void setProntuario(String prontuario) {
		
		this.prontuario = prontuario;

	}
	 
}
