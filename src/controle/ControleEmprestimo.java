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

	public boolean alterar(Emprestimo p, long cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCpf() == cpf) {
				emprestimo.setIdLivro(p.getIdLivro());
				emprestimo.setAnoDevolucao(p.getAnoDevolucao());
				emprestimo.setAnoDevolucao(p.getAnoDevolucao());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Emprestimo p, long cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCpf() == cpf) {
				tabelaEmprestimos.remove(emprestimo);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Emprestimo> listarFuncionarios() {
		return tabelaEmprestimos;
	}
}