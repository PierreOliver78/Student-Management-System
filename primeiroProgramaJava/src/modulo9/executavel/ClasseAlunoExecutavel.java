package modulo9.executavel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.interfaces.PermitirAcesso;
import modulo10.classesauxiliares.FuncaoAutenticacao;
import modulo9.classes.Aluno;
import modulo9.classes.Diretor;
import modulo9.classes.Disciplina;
import modulo9.classes.Secretario;
import modulo9.constantes.StatusAluno;

public class ClasseAlunoExecutavel {
	
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		
			
		//Secretario secretario = new Secretario();//Diretamente com o objeto
		//PermitirAcesso secretario = new Secretario();
		
		/*
		secretario.setLogin(login);
		secretario.setSenha(senha);
		*/
		
		//if(secretario.autenticar()) {//Se true acessa se False não acessa
			
		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {//Vou travar o contrato para autorizar somente quem realmente tem o contrato legitimo
			
			JOptionPane.showMessageDialog(null, "Acesso Liberado");
			
		
		
		/*Objeto ainda não existe na memória
		Aluno aluno1;
		
		Agora temos um objetoo real na memoria
		Aluno aluno2 = new Aluno();
		*/
		/*new Aluno() é uma instancia (Criação de Obejto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		//Aluno aluno1 = null; Quando esquece de instanciar um dos motivos, mais podem ser vários. Aprendemos identificar.
		
		/*É uma lista que dentro dela temos uma chave que identifiva uma sequencia de valores também*/
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		/*
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		*/
		for (int qtd = 1; qtd <= 1; qtd++) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
	/*	String idade = JOptionPane.showInputDialog("Qual a idade do " + nome + "?");
		String dataNascimento = JOptionPane.showInputDialog("Data nascimento?");
		String rg= JOptionPane.showInputDialog("Numero RG");
		String cpf= JOptionPane.showInputDialog("Qual é o CPF?");
		String nomeMae= JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai= JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula= JOptionPane.showInputDialog("Data da matrícula?");
		String escola= JOptionPane.showInputDialog("Nome da escola?");
		String serie= JOptionPane.showInputDialog("Qual a série?");
	*/	
				
		
		Aluno aluno1 = new Aluno();//Aluno Bernardo
		
		aluno1.setNome(nome);
	/*	aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatricula(serie);
	*/
	
		for (int pos = 1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos +"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
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
		
		if (escolha == 0) {/*Opção SIM e Zero */
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
			}
			
		}
			
		
		//System.out.println("Resultado: " + (aluno1.getAlunoAprovado1() ? "Aprovado " : "Reprovado ") + "Aluno " + aluno1.getNome());
		
		
		
		
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
		
	alunos.add(aluno1);	
	}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
	for (Aluno aluno : alunos) {// Separei em listas
			
		if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
			maps.get(StatusAluno.APROVADO).add(aluno);//alunosAprovados.add(aluno);
		}else
		if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
			maps.get(StatusAluno.RECUPERACAO).add(aluno);//alunosRecuperacao.add(aluno);
		}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
			maps.get(StatusAluno.REPROVADO).add(aluno);//alunosReprovados.add(aluno);
		}
	
	}
		
		System.out.println("***************LISTA DOS ALUNOS APROVADOS***************");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)){//alunosAprovados) {
			System.out.println("Aluno: " + aluno.getNome() + " | Resultado: " + aluno.getAlunoAprovado2() + 
					" com média= " + aluno.getMediaNota());
			
		}
		System.out.println();
		
		System.out.println("***************LISTA DOS ALUNOS EM RECUPERAÇÃO***************");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)){
			System.out.println("Aluno: " + aluno.getNome() + " | Resultado= " + aluno.getAlunoAprovado2() + 
					" com média= " + aluno.getMediaNota());
			
		}
		System.out.println();
		
		System.out.println("***************LISTA DOS ALUNOS REPROVADOS***************");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " | Resultado= " + aluno.getAlunoAprovado2() + 
					" com média= " + aluno.getMediaNota());
			
		}
		System.out.println();
		
		
		//for (Aluno aluno : alunos) {
			/*
			for (int pos = 0; pos < alunos.size(); pos++) {
				
				Aluno aluno = alunos.get(pos);
				
				if (aluno.getNome().equalsIgnoreCase("Pierre")) {
					
					Aluno trocar = new Aluno();
					trocar.setNome("Aluno foi trocado");
					
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina("Matematica");
					disciplina.setNota(96);
					
					trocar.getDisciplinas().add(disciplina);
					
					alunos.set(pos, trocar);
					aluno = alunos.get(pos);
					
				}
				
				System.out.println("Aluno = " + aluno.getNome());
				System.out.println("Média do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado =  " + aluno.getAlunoAprovado2());
				System.out.println("-----------------------------------------");
				
				for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
					
					Disciplina disc = aluno.getDisciplinas().get(posd);
					System.out.println("Materia = " + disc.getDisciplina() + " Nota = "+ disc.getNota());
					
				}
				System.out.println("=========================================");
			}
			*/
			/*
			if (aluno.getNome().equalsIgnoreCase("Pierre")) {
				alunos.remove(aluno);
				break;
			}else {
				System.out.println(aluno.toString());//Descrição do objeto na memoria
				System.out.println("Média da nota final: " + aluno.getMediaNota());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
				System.out.println();
				System.out.println("=================================================");
				//System.out.println();
			}
			
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são:");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
				System.out.println("=================================================");
			}
			
			System.out.println("As notas por disciplinas são:");
			for (Disciplina notaDisciplina : aluno.getDisciplinas()) {
				System.out.println(notaDisciplina.getNota());
				System.out.println("=================================================");
			}
			*/
		}else{
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
		
	}
		
		
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
		
		/*
		Aluno aluno3 = new Aluno();//Aluno Luana
		
		Aluno aluno4 = new Aluno("Jonas");
		
		Aluno aluno5 = new Aluno("Pedro", 45);
		*/
	//}

}
