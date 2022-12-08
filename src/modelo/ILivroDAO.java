package modelo;
import java.util.ArrayList;

public interface ILivroDAO {
	public boolean inserir (Livro p);
	public boolean alterar (Livro p, String nomeLivro);
	public boolean deletar (Livro p, String nomeLivro);
	public ArrayList<Livro> listarLivros();
}
