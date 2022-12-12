package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.IClienteDAO;


public class ControleCliente implements IClienteDAO {
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
			this.tabelaClientes.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Cliente p, String nome) {
		for (Cliente cliente : tabelaClientes) {
			if (cliente.getNome() == nome) {
				cliente.setNome(p.getNome());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Cliente p, String nome ) {

		for (Cliente cliente : tabelaClientes) {
			if (cliente.getNome() == nome) {
				this.tabelaClientes.remove(cliente);
				return true;
			}
		}

		return false;
	}
	
	public Cliente nomecliente(String nome) {
		for (Cliente cliente : tabelaClientes) {
			if (cliente.getNome() == nome) {
				return cliente;
			}
		}
		return null;
	}

	public ArrayList<Cliente> listarClientes() {
		return tabelaClientes;
	}

	
}