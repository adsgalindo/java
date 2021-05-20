package atv5;



public class Teste {
	

	public static void main(String[] args) {
		Pessoa[] estudantes = new Estudante [4];
		Pessoa[] professores = new Estudante[4];
		
		estudantes[0] = new Estudante ("adalberto", "janga");
		estudantes[1] = new Estudante ("natalia","paulista");
		professores[2] = new Professor ("fred","cabo");
		professores[3] = new Professor ("diogo","torre");
		
		Estudante cursonota0 = new Estudante ("adalberto", "janha");
		cursonota0.addCursoNota("eletrica", 10);
		cursonota0.addCursoNota("eletronica", 10);
		
		Estudante cursonota1 = new Estudante ("natalia","paulista");
		cursonota1.addCursoNota("TI", 10);
		cursonota1.addCursoNota("eletronica", 8);
		
		
		Professor curso0 = new Professor("fred", "cabo");
		curso0.addcurso("eletrica");
		curso0.addcurso("automação");
		
		Professor curso1 = new Professor("diogo", "torre");
		curso1.addcurso("TI");
		curso1.addcurso("informatica");
	}

}
