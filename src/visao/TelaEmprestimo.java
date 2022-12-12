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
import controle.ControleEmprestimo;
import modelo.Emprestimo;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TelaEmprestimo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtCpfcliente;
	private JButton salvarBT;
	private JButton excluirBT;
	private JTable table;
	private JTextField txtNomeLivro;
	private DefaultTableModel modelo;
	private JButton alterarBT;
	private JTextField txtCpfFuncionario;
	private Emprestimo editarEmprestimo;
	private JButton confirmarBT;
	private JButton cancelarBT;

	/**
	 * Create the frame.
	 */
	public TelaEmprestimo() {
		ControleEmprestimo instanciaEmp = ControleEmprestimo.getInstancia();
		ArrayList<Emprestimo> Emprestimos = instanciaEmp.listarEmprestimos();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1222, 594);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Panel-----------------------------------------------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 327, 419);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Labels----------------------------------------------------------------------------------------
		JLabel lblNewLabel_8 = new JLabel("Empr\u00E9stimo");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel = new JLabel("CPF Cliente");
		lblNewLabel.setBounds(7, 11, 131, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JLabel lblIdLivro = new JLabel("Nome Livro");
		lblIdLivro.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdLivro.setForeground(Color.DARK_GRAY);
		lblIdLivro.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblIdLivro.setBounds(7, 151, 131, 23);
		panel.add(lblIdLivro);
		
		JLabel lblCpfFuncionrio = new JLabel("CPF Funcionário");
		lblCpfFuncionrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpfFuncionrio.setForeground(Color.DARK_GRAY);
		lblCpfFuncionrio.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCpfFuncionrio.setBounds(7, 81, 308, 23);
		panel.add(lblCpfFuncionrio);
		
		//TextFields------------------------------------------------------------------------------
		txtCpfcliente = new JTextField();
		txtCpfcliente.setForeground(Color.DARK_GRAY);
		txtCpfcliente.setBounds(7, 45, 308, 25);
		panel.add(txtCpfcliente);
		txtCpfcliente.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpfcliente.setColumns(10);
		txtCpfcliente.setBackground(SystemColor.menu);
		
		txtNomeLivro = new JTextField();
		txtNomeLivro.setForeground(Color.DARK_GRAY);
		txtNomeLivro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNomeLivro.setColumns(10);
		txtNomeLivro.setBackground(SystemColor.menu);
		txtNomeLivro.setBounds(7, 185, 308, 25);
		panel.add(txtNomeLivro);
		
		txtCpfFuncionario = new JTextField();
		txtCpfFuncionario.setForeground(Color.DARK_GRAY);
		txtCpfFuncionario.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpfFuncionario.setColumns(10);
		txtCpfFuncionario.setBackground(SystemColor.menu);
		txtCpfFuncionario.setBounds(7, 115, 308, 25);
		panel.add(txtCpfFuncionario);
		
		//ScrollPane + TableModel-------------------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(347, 87, 849, 419);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("CPF Cliente");
		modelo.addColumn("CPF Funcionário");
		modelo.addColumn("Nome Livro");
		modelo.addColumn("Data Emprestimo");
		modelo.addColumn("Data Devolução");
		
		for (Emprestimo p : Emprestimos) {
			Object[] emp = new Object[5];
			emp[0] = p.getCpfcliente();
			emp[1] = p.getCpffuncionario();
			emp[2] = p.getNomeLivro();
			emp[3] = p.getDataemp();
			emp[4] = p.getDatadev();
			modelo.addRow(emp);
		}
		
		//Buttons-----------------------------------------------------------------------------------
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				TelaPrincipal frame = new TelaPrincipal();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(SystemColor.menu);
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_2.setBounds(1100, 521, 96, 23);
		contentPane.add(btnNewButton_2);

		//-----------------------------------------------------------------------------------------------
		salvarBT = new JButton("Salvar");
		salvarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emprestimo p = new Emprestimo();
				
				String CPFc = txtCpfcliente.getText();
				String CPFf = txtCpfFuncionario.getText();
				String NomeLivro = txtNomeLivro.getText();
				
				if (CPFc.isEmpty() || CPFc == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (CPFf.isEmpty() || CPFf == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (NomeLivro.isEmpty() || NomeLivro == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else {
					
					modelo.getDataVector().removeAllElements();
					p.setCpfcliente(CPFc);
					p.setCpffuncionario(CPFf);
					p.setNomeLivro(NomeLivro);
					p.setDataemp(LocalDate.now());
					p.setDatadev(LocalDate.now().plusDays(30));
			
					boolean valida = instanciaEmp.inserir(p);
					if (valida == true) {
						for (Emprestimo p1 : Emprestimos) {
							Object[] emp = new Object[5];
							emp[0] = p1.getCpfcliente();
							emp[1] = p1.getCpffuncionario();
							emp[2] = p1.getNomeLivro();
							emp[3] = p1.getDataemp();
							emp[4] = p1.getDatadev();
							modelo.addRow(emp);
						}
						JOptionPane.showInternalMessageDialog(null, "Empréstimo CADASTRADO!");
						limparCampos();
					} else {
						JOptionPane.showInternalMessageDialog(null, "ERRO ao cadastrar empréstimo!");
					}
				}
			}
		});
		salvarBT.setBounds(7, 385, 96, 23);
		panel.add(salvarBT);
		salvarBT.setForeground(Color.DARK_GRAY);
		salvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		salvarBT.setBackground(SystemColor.menu);

		//--------------------------------------------------------------------------------------------
		excluirBT = new JButton("Excluir");
		excluirBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emprestimo p = new Emprestimo();
				if (table.getSelectedRow() >= 0) {
					instanciaEmp.deletar(p, String.valueOf(table
							.getValueAt(table.getSelectedRow(), table.getSelectedColumn())));
					modelo.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Empréstimo EXCLUÍDO!");
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um emprestimo para excluir.");
			}
				
			}
		});
		excluirBT.setBounds(113, 385, 96, 23);
		panel.add(excluirBT);
		excluirBT.setForeground(Color.DARK_GRAY);
		excluirBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		excluirBT.setBackground(SystemColor.menu);

		//----------------------------------------------------------------------------------------------
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
					editarEmprestimo = instanciaEmp.cpfcliente(cpfcliente);

					txtCpfcliente.setText(editarEmprestimo.getCpfcliente());
					txtCpfFuncionario.setText(editarEmprestimo.getCpffuncionario());
					txtNomeLivro.setText(editarEmprestimo.getNomeLivro());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um emprestimo para alterar.");
				}
				
			}
		});
		alterarBT.setForeground(Color.DARK_GRAY);
		alterarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		alterarBT.setBackground(SystemColor.menu);
		alterarBT.setBounds(219, 385, 96, 23);
		panel.add(alterarBT);
		
		
	
	//--------------------------------------------------------------------------------------------
		confirmarBT = new JButton("Confirmar");
		confirmarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valida = instanciaEmp.alterar(editarEmprestimo, editarEmprestimo.getCpfcliente());
				if (valida) {
					String CPFc = txtCpfcliente.getText();
					String CPFf = txtCpfFuncionario.getText();
					String NomeLivro = txtNomeLivro.getText();
					
					if (CPFc.isEmpty() || CPFc == null) {
						JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
					} else if (CPFf.isEmpty() || CPFf == null) {
						JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
					} else if (NomeLivro.isEmpty() || NomeLivro == null) {
						JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
					} else {
						
						modelo.getDataVector().removeAllElements();
						editarEmprestimo.setCpfcliente(CPFc);
						editarEmprestimo.setCpffuncionario(CPFf);
						editarEmprestimo.setNomeLivro(NomeLivro);
						editarEmprestimo.setDataemp(LocalDate.now());
						editarEmprestimo.setDatadev(LocalDate.now().plusDays(30));
						for (Emprestimo p1 : Emprestimos) {
							Object[] emp = new Object[5];
							emp[0] = p1.getCpfcliente();
							emp[1] = p1.getCpffuncionario();
							emp[2] = p1.getNomeLivro();
							emp[3] = p1.getDataemp();
							emp[4] = p1.getDatadev();
							modelo.addRow(emp);
						}
						salvarBT.setVisible(true);
						excluirBT.setVisible(true);
						alterarBT.setVisible(true);
						confirmarBT.setVisible(false);
						cancelarBT.setVisible(false);
						limparCampos();
						JOptionPane.showMessageDialog(null, "Emprestimo ALTERADO!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "ERRO ao alterar emprestimo");
					}
				}
		});
		confirmarBT.setBackground(SystemColor.menu);
		confirmarBT.setForeground(Color.DARK_GRAY);
		confirmarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		confirmarBT.setBounds(7, 385, 110, 23);
		panel.add(confirmarBT);
		confirmarBT.setVisible(false);
		
	
	//---------------------------------------------------------------------------------------------
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
		cancelarBT.setForeground(Color.DARK_GRAY);
		cancelarBT.setBackground(SystemColor.menu);
		cancelarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		cancelarBT.setBounds(207, 385, 110, 23);
		panel.add(cancelarBT);
		cancelarBT.setVisible(false);
	}
	
	//---------------------------------------------------------------------------------------------
	protected void limparCampos() {
		txtCpfcliente.setText("");
		txtCpfFuncionario.setText("");
		txtNomeLivro.setText("");
	}
}