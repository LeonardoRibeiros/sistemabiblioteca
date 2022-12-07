package controle;

import java.util.ArrayList;

import modelo.Cliente;

public class ControleCliente {
	private static ArrayList<Cliente> tabelaClientes;
	private static ControleCliente instancia;

	public static ControleCliente getInstancia() {

		if (instancia == null) {
			instancia = new ControleCliente();
			tabelaClientes = new ArrayList<>();
		}

		return instancia;
	}

	public ControleCliente() {
	}

	public boolean inserir(Cliente p) {
		if (p != null) {
			tabelaClientes.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Cliente p, String cpf) {
		for (Cliente cliente : tabelaClientes) {
			if (cliente.getCpf() == cpf) {
				cliente.setNome(p.getNome());
				cliente.setCpf(p.getCpf());
				cliente.setTel(p.getTel());
				cliente.setCep(p.getCep());
				cliente.setEmail(p.getEmail());
				cliente.setnCasa(p.getnCasa());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Cliente p, String cpf ) {

		for (Cliente cliente : tabelaClientes) {
			if (cliente.getCpf() == cpf) {
				tabelaClientes.remove(p);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Cliente> listarClientes() {
		return tabelaClientes;
	}
}