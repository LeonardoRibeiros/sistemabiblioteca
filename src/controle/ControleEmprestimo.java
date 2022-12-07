package controle;

import java.util.ArrayList;

import modelo.Emprestimo;


public class ControleEmprestimo {
	private static ArrayList<Emprestimo> tabelaEmprestimos;
	private static ControleEmprestimo instancia;

	public static ControleEmprestimo getInstancia() {

		if (instancia == null) {
			instancia = new ControleEmprestimo();
			tabelaEmprestimos = new ArrayList<>();
		}

		return instancia;
	}

	private ControleEmprestimo() {
	}

	public boolean inserir(Emprestimo p) {
		if (p != null) {
			this.tabelaEmprestimos.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Emprestimo p, String cpfCliente) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCpfCliente() == cpfCliente) {
				emprestimo.setNomeLivro(p.getNomeLivro());
				emprestimo.setAnoDevolucao(p.getAnoDevolucao());
				emprestimo.setAnoDevolucao(p.getAnoEmprestimo());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Emprestimo p, String cpfCliente) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCpfCliente() == cpfCliente) {
				tabelaEmprestimos.remove(emprestimo);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Emprestimo> listarEmprestimos() {
		return tabelaEmprestimos;
	}
}