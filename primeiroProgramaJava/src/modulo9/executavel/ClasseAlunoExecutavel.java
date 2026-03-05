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
		aluno1.nome = "Bernardo";
		aluno1.idade = 8;
		
		System.out.println("Nome do 1º Aluno: " + aluno1.nome);
		System.out.println("Idade do " + aluno1.nome + ": " + aluno1.idade + " anos");
		
		
		Aluno aluno2 = new Aluno();//Aluno Pierre
		
		Aluno aluno3 = new Aluno();//Aluno Luana
		
		Aluno aluno4 = new Aluno("Jonas");
		
		Aluno aluno5 = new Aluno("Pedro", 45);
	}

}
