package modulo10.classe.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Deu ruim! Erro no processamento do arquivo ao processar notas do Aluno " + erro);
	}

}
