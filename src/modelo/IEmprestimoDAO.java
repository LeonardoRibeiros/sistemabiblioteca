package modelo;

import java.util.ArrayList;

public interface IEmprestimoDAO {
	public boolean inserir (Emprestimo p);
	public boolean alterar (Emprestimo p, String cpf);
	public boolean deletar (Emprestimo p, String cpf);
	public Emprestimo cpfcliente(String cpf);
	public ArrayList<Emprestimo> listarEmprestimos();
}
