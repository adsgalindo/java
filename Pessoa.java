package atv5;

public class Pessoa {
	private String nome;
	private String endereco;
	
	public Pessoa () {
		nome = " ";
		endereco = " ";
	}
	public Pessoa (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getnome () {
		return this.nome;
	}
	public void setnome (String nome) {
		this.nome = nome;
	}
	public String getendereco () {
		return this.endereco;
	}
	public void setendereco (String endereco) {
		this.endereco = endereco;
	}
	public String toString () {
		return (this.nome + " " + this.endereco);
	}
}
