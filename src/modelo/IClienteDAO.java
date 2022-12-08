package modelo;

import java.util.ArrayList;

public interface IClienteDAO {
	public boolean inserir (Cliente p);
	public boolean alterar (Cliente p, Long cpf);
	public boolean deletar (Cliente p, Long cpf);
	public ArrayList<Cliente> listarClientes();
}
