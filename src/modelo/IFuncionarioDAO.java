package modelo;

import java.util.ArrayList;

public interface IFuncionarioDAO {
	public boolean inserir (Funcionario p);
	public boolean alterar (Funcionario p, String nome);
	public boolean deletar (Funcionario p, String nome);
	public Funcionario nomefuncionario(String nome);
	public ArrayList<Funcionario> listarFuncionarios();
}
