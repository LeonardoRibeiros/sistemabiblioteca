package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import controle.ControleMulta;
import modelo.Multa;

public class TelaMulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtCpfCliente;
	private JButton salvarBT;
	private JButton excluirBT;
	private JTable table;
	private JTextField txtMulta;
	private DefaultTableModel modelo;
	private Multa editarMulta;
	private JButton alterarBT;
	private JButton confirmarBT;
	private JButton cancelarBT;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TelaMulta() {
		ControleMulta instanciaMul = ControleMulta.getInstancia();
		ArrayList<Multa> Multas = instanciaMul.listarMultas();

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 980, 506);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Panel-------------------------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 328, 325);
		contentPane.add(panel);
		panel.setLayout(null);

		// Labels-------------------------------------------------------------------
		JLabel lblNewLabel_8 = new JLabel("Multa");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);

		lblNewLabel = new JLabel("CPF Cliente");
		lblNewLabel.setBounds(7, 11, 244, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

		JLabel lblNewLabel_1_1 = new JLabel("Multa Vigente");
		lblNewLabel_1_1.setBounds(7, 81, 244, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));

		JLabel lblNewLabel_2 = new JLabel("R$");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 117, 45, 23);
		panel.add(lblNewLabel_2);

		// TextFields-------------------------------------------------------------------------------------------
		txtCpfCliente = new JTextField();
		txtCpfCliente.setForeground(Color.DARK_GRAY);
		txtCpfCliente.setBounds(7, 45, 308, 25);
		panel.add(txtCpfCliente);
		txtCpfCliente.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpfCliente.setColumns(10);
		txtCpfCliente.setBackground(SystemColor.menu);

		txtMulta = new JTextField();
		txtMulta.setForeground(Color.DARK_GRAY);
		txtMulta.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtMulta.setColumns(10);
		txtMulta.setBackground(SystemColor.menu);
		txtMulta.setBounds(37, 116, 278, 25);
		panel.add(txtMulta);

		// ScrollPane +
		// TableModel------------------------------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(348, 87, 606, 324);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("CPF Cliente");
		modelo.addColumn("Data Devolução");
		modelo.addColumn("Valor Multa");

		for (Multa p : Multas) {
			Object[] mul = new Object[3];
			mul[0] = p.getCpf();
			mul[1] = p.getData();
			mul[2] = p.getValorMulta();
			modelo.addRow(mul);
		}
		// Buttons---------------------------------------------------------------------------------------------
		JButton VoltarBT = new JButton("Voltar");
		VoltarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				TelaPrincipal frame = new TelaPrincipal();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		VoltarBT.setBackground(SystemColor.menu);
		VoltarBT.setForeground(Color.DARK_GRAY);
		VoltarBT.setFont(new Font("Dialog", Font.PLAIN, 12));
		VoltarBT.setBounds(858, 433, 96, 23);
		contentPane.add(VoltarBT);

		// -------------------------------------------------------------------------------------------------
		salvarBT = new JButton("Salvar");
		salvarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multa p = new Multa();

				String Cpf = txtCpfCliente.getText();
				String Multa = txtMulta.getText();

				if (Cpf.isEmpty() || Cpf == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Multa.isEmpty() || Multa == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else {

					modelo.getDataVector().removeAllElements();
					p.setCpf(Cpf);
					p.setData(LocalDate.now());
					p.setValorMulta(Float.valueOf(Multa));
					boolean valida = instanciaMul.inserir(p);
					if (valida == true) {
						for (Multa p1 : Multas) {
							Object[] mul = new Object[3];
							mul[0] = p1.getCpf();
							mul[1] = p1.getData();
							mul[2] = p1.getValorMulta();
							modelo.addRow(mul);
						}
						JOptionPane.showInternalMessageDialog(null, "Multa CADASTRADA!");
						limparCampos();
					} else {
						JOptionPane.showInternalMessageDialog(null, "ERRO ao cadastrar multa!");
					}
				}
			}
		});
		salvarBT.setBounds(7, 291, 96, 23);
		panel.add(salvarBT);
		salvarBT.setForeground(Color.DARK_GRAY);
		salvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		salvarBT.setBackground(SystemColor.menu);

		// -------------------------------------------------------------------------------------------------
		excluirBT = new JButton("Excluir");
		excluirBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multa p = new Multa();
				if (table.getSelectedRow() >= 0) {
					instanciaMul.deletar(p,
							String.valueOf(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn())));
					modelo.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Multa EXCLUÍDA!");
				} else {
					JOptionPane.showMessageDialog(null, "Selecione uma multa para excluir.");
				}

			}

		});
		excluirBT.setBounds(113, 291, 96, 23);
		panel.add(excluirBT);
		excluirBT.setForeground(Color.DARK_GRAY);
		excluirBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		excluirBT.setBackground(SystemColor.menu);

		// -----------------------------------------------------------------------------------------------
		alterarBT = new JButton("Alterar");
		alterarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() >= 0) {
					salvarBT.setVisible(false);
					excluirBT.setVisible(false);
					alterarBT.setVisible(false);
					confirmarBT.setVisible(true);
					cancelarBT.setVisible(true);

					int linha = table.getSelectedRow();
					String cpfcliente = (String) table.getValueAt(linha, 0);
					editarMulta = instanciaMul.cpfcliente(cpfcliente);

					txtCpfCliente.setText(editarMulta.getCpf());
					txtMulta.setText(String.valueOf(editarMulta.getValorMulta()));

				} else {
					JOptionPane.showMessageDialog(null, "Selecione uma multa para alterar.");
				}
			}

		});
		alterarBT.setForeground(Color.DARK_GRAY);
		alterarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		alterarBT.setBackground(SystemColor.menu);
		alterarBT.setBounds(219, 291, 96, 23);
		panel.add(alterarBT);

		// -----------------------------------------------------------------------------------------
		confirmarBT = new JButton("Confirmar");
		confirmarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valida = instanciaMul.alterar(editarMulta, editarMulta.getCpf());
				if (valida) {
					String Cpf = txtCpfCliente.getText();
					String Multa = txtMulta.getText();

					if (Cpf.isEmpty() || Cpf == null) {
						JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
					} else if (Multa.isEmpty() || Multa == null) {
						JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
					} else {

						modelo.getDataVector().removeAllElements();
						editarMulta.setCpf(Cpf);
						editarMulta.setData(LocalDate.now());
						editarMulta.setValorMulta(Float.valueOf(Multa));
						for (Multa p1 : Multas) {
							Object[] mul = new Object[3];
							mul[0] = p1.getCpf();
							mul[1] = p1.getData();
							mul[2] = p1.getValorMulta();
							modelo.addRow(mul);
						}
						salvarBT.setVisible(true);
						excluirBT.setVisible(true);
						alterarBT.setVisible(true);
						confirmarBT.setVisible(false);
						cancelarBT.setVisible(false);
						limparCampos();
						JOptionPane.showMessageDialog(null, "Multa ALTERADA!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "ERRO ao alterar multa");
				}

			}
		});
		confirmarBT.setBackground(SystemColor.menu);
		confirmarBT.setForeground(Color.DARK_GRAY);
		confirmarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		confirmarBT.setBounds(7, 291, 108, 23);
		panel.add(confirmarBT);
		confirmarBT.setVisible(false);

		// ------------------------------------------------------------------------------------------
		cancelarBT = new JButton("Cancelar");
		cancelarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarBT.setVisible(true);
				excluirBT.setVisible(true);
				alterarBT.setVisible(true);
				confirmarBT.setVisible(false);
				cancelarBT.setVisible(false);	
				limparCampos();
				
			}
		});
		cancelarBT.setBackground(SystemColor.menu);
		cancelarBT.setForeground(Color.DARK_GRAY);
		cancelarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		cancelarBT.setBounds(207, 291, 108, 23);
		panel.add(cancelarBT);
		cancelarBT.setVisible(false);
	}

	// ------------------------------------------------------------------------------------------
	protected void limparCampos() {
		txtCpfCliente.setText("");
		txtMulta.setText("");

	}

}