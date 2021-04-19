package Class6;

public class Livro {
	
	private String titulo;
	private String isbn;
	private String tema;
	
	public Livro() {
		this.titulo = "";
		this.isbn = "";
		this.tema = "";
	}

	public Livro(String titulo, String isbn, String tema) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.tema = tema;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public String toString() {
		return "Livro[Título:" +titulo +"," +" ISBN:" +isbn +"," +" Tema:" +tema +"]";
	}
}
