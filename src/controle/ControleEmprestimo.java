package controle;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Emprestimo;
import modelo.Funcionario;
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

	public boolean alterar(Emprestimo p, String cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCpfcliente() == cpf) {
				emprestimo.setNomeLivro(p.getNomeLivro());
				
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Emprestimo p, String cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos){
			if (emprestimo.getCpfcliente() == cpf) {
				this.tabelaEmprestimos.remove(emprestimo);
				return true;
			}
		}

		return false;
	}
	
	public Emprestimo cpfcliente(String cpf) {
		for (Emprestimo emprestimo : tabelaEmprestimos) {
			if (emprestimo.getCpfcliente() == cpf) {
				return emprestimo;
			}
		}
		return null;
	}

	public ArrayList<Emprestimo> listarEmprestimos() {
		return tabelaEmprestimos;
	}

}