package modelo;

import java.util.ArrayList;

public interface IEmprestimoDAO {
	public boolean inserir (Emprestimo p);
	public boolean alterar (Emprestimo p, Long cpf);
	public boolean deletar (Emprestimo p, Long cpf);
	public ArrayList<Emprestimo> listarEmprestimos();
}
