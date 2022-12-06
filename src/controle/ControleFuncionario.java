package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class ControleFuncionario {
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

	public boolean alterar(Funcionario p, long cpf) {
		for (Funcionario funcionario : tabelaFuncionarios) {
			if (funcionario.getCpf() == cpf) {
				funcionario.setNome(p.getNome());
				funcionario.setCpf(p.getCpf());
				funcionario.setTel(p.getTel());
				funcionario.setCep(p.getCep());
				funcionario.setnCasa(p.getnCasa());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Funcionario p, long cpf ) {

		for (Funcionario funcionario : tabelaFuncionarios) {
			if (funcionario.getCpf() == cpf) {
				tabelaFuncionarios.remove(funcionario);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		return tabelaFuncionarios;
	}
}