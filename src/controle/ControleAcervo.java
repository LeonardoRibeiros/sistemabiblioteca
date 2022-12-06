package controle;

import java.util.ArrayList;

import modelo.Acervo;

public class ControleAcervo{
	private static ArrayList<Acervo> tabelaAcervo;
	private static ControleAcervo instancia;

	public static ControleAcervo getInstancia() {

		if (instancia == null) {
			instancia = new ControleAcervo();
			tabelaAcervo = new ArrayList<>();
		}

		return instancia;
	}

	private ControleAcervo() {
	}

	public boolean inserir(Acervo p) {
		if (p != null) {
			this.tabelaAcervo.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Acervo p, long cpf) {
		for (Acervo acervo : tabelaAcervo){
			if (acervo.getCpf() == cpf) {
				acervo.setNomeLivro(p.getNomeLivro());
				acervo.setAutor(p.getAutor());
				acervo.setnPaginas(p.getnPaginas());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Acervo p, long cpf) {
		for (Acervo acervo : tabelaAcervo){
			if (acervo.getCpf() == cpf) {
				tabelaAcervo.remove(acervo);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Acervo> listarFuncionarios() {
		return tabelaAcervo;
	}
}