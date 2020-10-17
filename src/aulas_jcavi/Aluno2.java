package aulas_jcavi;

public class Aluno2 extends Pessoa {

	private String matricula;
	private Turma turma;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
	
	@Override
	public String toString() {
		return "Aluno2 [matricula=" + matricula + ", turma=" + turma + ", getNome()=" + getNome() + ", getCnpjCpf()="
				+ getCnpjCpf() + ", getEndereco()=" + getEndereco() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
}
