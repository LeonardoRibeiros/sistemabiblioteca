package modelo;

import java.util.ArrayList;

public interface IFuncionarioDAO {
	public boolean inserir (Funcionario p);
	public boolean alterar (Funcionario p, Long cpf);
	public boolean deletar (Funcionario p, Long cpf);
	public ArrayList<Funcionario> listarFuncionarios();
}
