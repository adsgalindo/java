package atv5;

public class Estudante extends Pessoa{
	private int numCursos;
	private String[] cursos = new String[4];
	private int[] notas = new int[4];
	int i = 0;
	int somaNota;
	int j;
	
	Estudante (String nome, String endereco) {
	@SuppressWarnings("unused")
	Pessoa pessoa1 = new Estudante(nome, endereco);
		
		
	}
	public boolean addCursoNota (String curso, int nota) {
		
		this.cursos[i] = curso;
		this.notas[i] = nota;
		i = i + 1;
		return (true);
	}
	public void imprimiNota () {
		
		for (int j = 0; j<notas.length; j++){
			System.out.println (notas[j]);
		}
	}
	public double getnotamedia() {
		
		for (int j = 0; j<notas.length; j++){
			somaNota = notas[j];
		}
		double media = somaNota/j;
		return (media);
	}
	public String toString () {
		return (this.numCursos + " " + this.cursos + " " + this.notas);
	}
}
