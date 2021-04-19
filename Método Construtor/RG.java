package Class4;

public class RG {
	
	private String nome;
	private String dataEmissao;
	private String numero;
	
	public RG() {
		this. nome = "";
		this. dataEmissao = "";
		this. numero = "";
	}
	public RG(String nome, String dataEmissao, String numero) {
		this. nome = nome;
		this. dataEmissao = dataEmissao;
		this. numero = numero;
	}
	 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
	
		this.nome = nome;
	}
	
	public String getDataEmissao() {
		return dataEmissao;
	}
	
	public void setDataEmissao(String dataEmissao) {
		
		this.dataEmissao = dataEmissao;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		
		this.numero = numero;

	}
	
}
