package aulas_jcavi;

import javax.swing.JOptionPane;

public class UsaAluno {

	public static void main(String[] args) {

		Aluno2 alunos[] = new Aluno2[1];

		for (int i = 0; i < alunos.length; i++) {

			Aluno2 objAluno = new Aluno2();

			objAluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
			objAluno.setCnpjCpf(JOptionPane.showInputDialog("Digite o cpf do Aluno: "));
			objAluno.setMatricula(JOptionPane.showInputDialog("Digite a matrícula"));
			
			
			Endereco endereco = new Endereco();
			endereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro: "));
			endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
			endereco.setMunicipio(JOptionPane.showInputDialog("Digite o Municipio: "));
			endereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
			endereco.setCep(JOptionPane.showInputDialog("Digite o Cep: "));
			endereco.setEstado(JOptionPane.showInputDialog("Digite o Estado: "));
			
			objAluno.setEndereco(endereco);
			
						
			Turma turma = new Turma();
			turma.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da turma: ")));
			turma.setNome(JOptionPane.showInputDialog("Digite o nome da Turma: "));
			
			
			
			// preenchendo o array de disciplinas
			Disciplina disciplinas[] = new Disciplina[2];
			
			for(int h=0;h < disciplinas.length;h++) {
				
				Disciplina disciplina = new Disciplina();
				disciplina.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Disciplina: ")));
				disciplina.setNome(JOptionPane.showInputDialog("Digite o nome da Disciplina: "));
				disciplina.setTurno(JOptionPane.showInputDialog("Digite o turno da Disciplina: "));
				
				disciplinas[h] = disciplina;
			}
			
			turma.setDisciplina(disciplinas);
			
			objAluno.setTurma(turma);

			alunos[i] = objAluno;

		}

		for (int f = 0; f < alunos.length; f++) {

			System.out.println(alunos[f]);

		}

	}

}
