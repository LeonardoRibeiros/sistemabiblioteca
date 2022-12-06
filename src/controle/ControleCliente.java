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

	private ControleCliente() {
	}

	public boolean inserir(Cliente c) {
		if (c != null) {
			this.tabelaClientes.add(c);
			return true;
		}
		return false;
	}

	public boolean alterar(Cliente c, Long cpf) {
		for (Cliente cliente : tabelaClientes) {
			if (cliente.getCpf() == cpf) {
				cliente.setNome(c.getNome());
				cliente.setCpf(c.getCpf());
				cliente.setTel(c.getTel());
				cliente.setCep(c.getCep());
				cliente.setnCasa(c.getnCasa());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Cliente p, Long cpf ) {

		for (Cliente cliente : tabelaClientes) {
			if (cliente.getCpf() == cpf) {
				tabelaClientes.remove(cliente);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Cliente> listarClientes() {
		return tabelaClientes;
	}
}