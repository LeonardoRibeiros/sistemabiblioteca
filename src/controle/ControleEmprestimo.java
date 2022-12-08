package controle;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Emprestimo;
import modelo.IEmprestimoDAO;


public class ControleEmprestimo implements IEmprestimoDAO {
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

	public boolean alterar(Emprestimo p, Long cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCliente().getCpf() == cpf) {
				emprestimo.setNomeLivro(p.getNomeLivro());
				emprestimo.setData(LocalDate.now());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Emprestimo p, Long cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCliente().getCpf() == cpf) {
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