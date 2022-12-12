package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Funcionario;
import modelo.IFuncionarioDAO;

public class ControleFuncionario implements IFuncionarioDAO {
	private static ArrayList<Funcionario> tabelaFuncionarios;
	private static ControleFuncionario instancia;

	public static ControleFuncionario getInstancia() {

		if (instancia == null) {
			instancia = new ControleFuncionario();
			tabelaFuncionarios = new ArrayList<>();
		}

		return instancia;
	}

	private ControleFuncionario() {
	}

	public boolean inserir(Funcionario p) {
		if (p != null) {
			this.tabelaFuncionarios.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Funcionario p, String nome) {
		for (Funcionario funcionario : tabelaFuncionarios) {
			if (funcionario.getNome() == nome) {
				funcionario.setNome(p.getNome());
				funcionario.setCpf(p.getCpf());
				funcionario.setTel(p.getTel());
				funcionario.setEmail(p.getEmail());
				funcionario.setCep(p.getCep());
				funcionario.setnCasa(p.getnCasa());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Funcionario p, String nome) {

		for (Funcionario funcionario : tabelaFuncionarios) {
			if (funcionario.getNome() == nome) {
				this.tabelaFuncionarios.remove(funcionario);
				return true;
			}
		}

		return false;
	}

	public Funcionario nomefuncionario(String nome) {
		for (Funcionario funcionario : tabelaFuncionarios) {
			if (funcionario.getNome() == nome) {
				return funcionario;
			}
		}
		return null;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		return tabelaFuncionarios;
	}

	

}