package modulo9.executavel;

import modulo9.classes.Aluno;
import modulo9.classes.Diretor;
import modulo9.classes.Secretario;

public class TesteSubclasses {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pierre - Futuro Dev. Junior");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Bernardo");
		diretor.setRegistroEducacao("Dir654-87");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Luana");
		secretario.setNivelCargo("Nível B");
		
		System.out.println("Diretor: " + diretor.getNome() + " | Registro do Diretor: " + diretor.getRegistroEducacao());
		System.out.println();
		System.out.println("Secretária: " + secretario.getNome() + " | Nível cargo: " + secretario.getNivelCargo());
		System.out.println();
		System.out.println("Nome aluno: " + aluno.getNome());
		
	}

}
