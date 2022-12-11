package modelo;

import java.util.ArrayList;

public interface IMultaDAO {
	public boolean inserir (Multa p);
	public boolean alterar (Multa p, Long cpf );
	public boolean deletar (Multa p, String cpf );
	public ArrayList<Multa> listarMultas();
}
