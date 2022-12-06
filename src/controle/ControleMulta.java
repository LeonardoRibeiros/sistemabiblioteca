package controle;

import java.util.ArrayList;

import modelo.Multa;

public class ControleMulta {
	private static ArrayList<Multa> tabelaMultas;
	private static ControleMulta instancia;

	public static ControleMulta getInstancia() {

		if (instancia == null) {
			instancia = new ControleMulta();
			tabelaMultas = new ArrayList<>();
		}

		return instancia;
	}

	private ControleMulta() {
	}

	public boolean inserir(Multa p) {
		if (p != null) {
			this.tabelaMultas.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Multa p, long cpf) {
		for (Multa multa : tabelaMultas){
			if (multa.getCpf() == cpf) {
				multa.setAnoDevolucao(p.getAnoDevolucao());
				multa.setValorMulta(p.getValorMulta());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Multa p, long cpf) {
		for (Multa multa : tabelaMultas){
			if (multa.getCpf() == cpf) {
				tabelaMultas.remove(multa);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Multa> listarFuncionarios() {
		return tabelaMultas;
	}
}