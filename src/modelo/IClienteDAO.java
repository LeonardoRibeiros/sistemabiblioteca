package modelo;

import java.util.ArrayList;

public interface IClienteDAO {
	public boolean inserir (Cliente p);
	public boolean alterar (Cliente p, String nome);
	public boolean deletar (Cliente p, String nome);
	public Cliente nomecliente (String nome);
	public ArrayList<Cliente> listarClientes();
}
