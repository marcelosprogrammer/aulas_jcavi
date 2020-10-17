package aulas_jcavi;

import java.util.Arrays;

public class Turma {

	private int codigo;
	private String nome;
	
	private Disciplina disciplina[] = new Disciplina[2];
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", nome=" + nome + ", disciplina=" + Arrays.toString(disciplina) + "]";
	}
		



	
	

}
