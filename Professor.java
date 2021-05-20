package atv5;

public class Professor extends Pessoa {
	private int numCursos;
	private String[] cursos = new String[4];
	int i = 0;
	
	@SuppressWarnings("unused")
	public Professor (String nome, String endereco) {
		Pessoa pessoa2 = new Professor (nome, endereco);
	}
	public boolean addcurso (String curso) {
		i=i+1;
			this.cursos[i-1] = curso;
		return (true);
	}
	public boolean removecurso (String curso) {
		for (int i = 0; i<cursos.length; i++){
			
			if (cursos[i].equals(curso)) {
				cursos[i] = null;
				for (int j=i; j<cursos.length;j++) {
					cursos[j] = cursos[j+1];
					cursos[j+1] = null;
				}
			}
			
		}
		return true;
	}
	public String toString () {
		return (this.numCursos + " " + this.cursos);
	}
}
