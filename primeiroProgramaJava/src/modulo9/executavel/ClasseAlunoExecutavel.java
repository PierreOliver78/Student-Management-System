package modulo9.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modulo9.classes.Aluno;
import modulo9.classes.Disciplina;

public class ClasseAlunoExecutavel {
	
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memória
		Aluno aluno1;
		
		Agora temos um objetoo real na memoria
		Aluno aluno2 = new Aluno();
		*/
		/*new Aluno() é uma instancia (Criação de Obejto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		//Aluno aluno1 = null; Quando esquece de instanciar um dos motivos, mais podem ser vários. Aprendemos identificar.
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do " + nome + "?");
		String dataNascimento = JOptionPane.showInputDialog("Data nascimento?");
		String rg= JOptionPane.showInputDialog("Numero RG");
		String cpf= JOptionPane.showInputDialog("Qual é o CPF?");
		String nomeMae= JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai= JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula= JOptionPane.showInputDialog("Data da matrícula?");
		String escola= JOptionPane.showInputDialog("Nome da escola?");
		String serie= JOptionPane.showInputDialog("Qual a série?");
		
				
		
		Aluno aluno1 = new Aluno();//Aluno Bernardo
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatricula(serie);
		
		for (int pos = 1; pos <= 5; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos +"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina)-1);
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/*
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Português");
		disciplina1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(95);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("História");
		disciplina3.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Geografia");
		disciplina4.setNota(84);
		
		aluno1.getDisciplinas().add(disciplina4);
		
		Disciplina disciplina5 = new Disciplina();
		disciplina5.setDisciplina("Artes");
		disciplina5.setNota(100);
		
		aluno1.getDisciplinas().add(disciplina5);
		*/
		
		/*
		System.out.println("Nome do aluno: " + aluno1.getNome());		
		System.out.println("Idade do aluno: " + aluno1.getIdade());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Numero do RG " + aluno1.getRegistroGeral());
		System.out.println("Numero CPF: " + aluno1.getNumeroCpf());
		System.out.println("Média da nota: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado1() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		*/
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ou 5?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
			
		System.out.println(aluno1.toString());//Descrição do objeto na memoria
		System.out.println("Média da nota final: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado1() ? "Aprovado " : "Reprovado ") + "Aluno " + aluno1.getNome());
		
		
		
		
		//Equals e hashcode(Diferenciar e comparar objetos)
		/*
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Pierre");
		aluno1.setNumeroCpf("253");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pierre");
		aluno2.setNumeroCpf("123");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais.");
		}
		*/
		
		/*
		aluno = new Aluno();
		System.out.println(aluno);
		
		aluno = new Aluno();
		System.out.println(aluno.toString());
		*/
		
		System.out.println();
		System.out.println("=================================================");
		System.out.println();
		/*=======================================================================*/
		/*
		aluno1.nome = "Bernardo";
		aluno1.idade = 8;
		
		System.out.println("Nome do 1º Aluno: " + aluno1.nome);
		System.out.println("Idade do " + aluno1.nome + ": " + aluno1.idade + " anos");
		*/
		/*
		Aluno aluno2 = new Aluno();//Aluno Pierre
		
		aluno2.setNome("Pierre");
		aluno2.setIdade(48);
		aluno2.setDataNascimento("02/01/1978");
		aluno2.setRegistroGeral("35.632.105-8");
		aluno2.setNumeroCpf("005.966.859-80");
		aluno2.setNomeMae("Sandra");
		aluno2.setNomePai("Pierre");
		aluno2.setDataMatricula("06/06/2023");
		aluno2.setNomeEscola("Faculdade Facint");
		aluno2.setSerieMatricula("Curso ADS");
		aluno2.setNota01(55);
		aluno2.setNota02(98.9);
		aluno2.setNota03(73.5);
		aluno2.setNota03(87.7);
		
		System.out.println("Nome do aluno: " + aluno2.getNome());
		System.out.println("Idade do aluno: " + aluno2.getIdade());
		System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Média da nota: " + aluno2.getMediaNota());
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado1() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado: " + aluno2.getAlunoAprovado2());
		*/
				
		/*=======================================================================*/
		
		Aluno aluno3 = new Aluno();//Aluno Luana
		
		Aluno aluno4 = new Aluno("Jonas");
		
		Aluno aluno5 = new Aluno("Pedro", 45);
		
	}

}
