package modulo9.executavel;

import modulo9.classes.Aluno;
import modulo9.classes.Diretor;
import modulo9.classes.Secretario;

public class TesteSubclasses {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pierre - Futuro Dev. Junior");
		aluno.setIdade(48);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Bernardo");
		diretor.setRegistroEducacao("Dir654-87");
		diretor.setIdade(48);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Luana");
		secretario.setNivelCargo("Nível B");
		secretario.setIdade(33);
		
		System.out.println("Diretor: " + diretor.getNome() + " | Registro do Diretor: " + diretor.getRegistroEducacao()
				+ " | Idade: " + diretor.getIdade() + " | Diretor é maior de idade: " + diretor.pessoaMaiorIdade());
		System.out.println();
		System.out.println("Secretária: " + secretario.getNome() + " | Nível cargo: " + secretario.getNivelCargo()
				+ " | Idade: " + secretario.getIdade());
		System.out.println();
		System.out.println("Nome aluno: " + aluno.getNome() + " | Aluno é maior de idade? " + " | Idade: " + aluno.getIdade());
		System.out.println(aluno.pessoaMaiorIdade() + " | " + aluno.msgMaiorIdade());
	}

}
