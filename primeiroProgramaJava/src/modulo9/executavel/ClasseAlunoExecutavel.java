package modulo9.executavel;

import modulo9.classes.Aluno;

public class ClasseAlunoExecutavel {
	
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memória
		Aluno aluno1;
		
		Agora temos um objetoo real na memoria
		Aluno aluno2 = new Aluno();
		*/
		/*new Aluno() é uma instancia (Criação de Obejto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		Aluno aluno1 = new Aluno();//Aluno Bernardo
		
		aluno1.setNome("Bernardo");
		aluno1.setIdade(8);
		aluno1.setDataNascimento("15/01/2018");
		aluno1.setRegistroGeral("678.568-4");
		aluno1.setNumeroCpf("35.789.857-8");
		aluno1.setNomeMae("Luana");
		aluno1.setNomePai("Pierre");
		aluno1.setDataMatricula("24/11/2025");
		aluno1.setNomeEscola("Sesc");
		aluno1.setSerieMatricula("3ª B");
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade do aluno: " + aluno1.getIdade());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println();
		System.out.println();
		
		/*=======================================================================*/
		/*
		aluno1.nome = "Bernardo";
		aluno1.idade = 8;
		
		System.out.println("Nome do 1º Aluno: " + aluno1.nome);
		System.out.println("Idade do " + aluno1.nome + ": " + aluno1.idade + " anos");
		*/
		
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
		
		System.out.println("Nome do aluno: " + aluno2.getNome());
		System.out.println("Idade do aluno: " + aluno2.getIdade());
		System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
		
		/*=======================================================================*/
		
		Aluno aluno3 = new Aluno();//Aluno Luana
		
		Aluno aluno4 = new Aluno("Jonas");
		
		Aluno aluno5 = new Aluno("Pedro", 45);
	}

}
