package empresa;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	void info() {
		System.out.println("Nome Aluno: " + nome);
		System.out.println("Matricula Aluno: " + matricula);
		System.out.println("Desconto Aluno: " + desconto);
		curso.info();
		System.out.println("Pagamento: " + pagamento());
	}
	
	double pagamento() {
		return curso.mensalidade * (1 - desconto);
	}
	

}
