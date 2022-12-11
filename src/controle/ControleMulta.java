package controle;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.IMultaDAO;
import modelo.Multa;
import modelo.Cliente;
import controle.ControleCliente;

public class ControleMulta implements IMultaDAO{
	private static ArrayList<Multa> tabelaMultas;
	private static ControleMulta instancia;

	public static ControleMulta getInstancia() {

		if (instancia == null) {
			instancia = new ControleMulta();
			tabelaMultas = new ArrayList<>();
		}

		return instancia;
	}

	private ControleMulta() {
	}

	public boolean inserir(Multa p) {
		if (p != null) {
			tabelaMultas.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Multa p, Long cpf) {
		for (Multa multa : tabelaMultas) {
			if (multa.getCliente().getCpf() == cpf) {
//				multa.setCpfCliente(p.getCliente().getCpf());
				multa.setData(LocalDate.now());
				multa.setValorMulta(p.getValorMulta());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Multa p, String cpf) {
		for (Multa multa : tabelaMultas) {
			if (multa.getCpf() == cpf) {
				tabelaMultas.remove(multa);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Multa> listarMultas() {
		return tabelaMultas;
	}
}