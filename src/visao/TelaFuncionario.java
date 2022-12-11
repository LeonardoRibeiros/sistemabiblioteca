package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

import controle.ControleFuncionario;
import modelo.Funcionario;


import javax.swing.JTable;

public class TelaFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtNome;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTable table;
	private JLabel lblNewLabel_1;
	String text = "";
	private JTextField Cpf;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtCep;
	private JLabel lblNewLabel_4;
	private JTextField txtTelefone;
	private JLabel lblNewLabel_5;
	private JTextField txtEmail;
	private JTextField txtNcasa;
	private DefaultTableModel modelo;
	private JButton alterarBT;
	private JTextField txtCpf;
	private Funcionario editarFuncionario;

	/**
	 * Create the frame.
	 */
	public TelaFuncionario() {
		ControleFuncionario instanciaFun = ControleFuncionario.getInstancia();
		ArrayList<Funcionario> Funcionarios = instanciaFun.listarFuncionarios();

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 982, 583);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		btnNewButton_2.setBounds(860, 510, 96, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_8 = new JLabel("Funcionario");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(351, 87, 605, 412);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("Nome");
		modelo.addColumn("Cpf");
		modelo.addColumn("Telefone");
		modelo.addColumn("Email");
		modelo.addColumn("Cep");
		modelo.addColumn("N casa");
		
		for (Funcionario p : Funcionarios) {
			Object[] fun = new Object[6];
			fun[0] = p.getNome();
			fun[1] = p.getCpf();
			fun[2] = p.getTel();
			fun[3] = p.getEmail();
			fun[4] = p.getCep();
			fun[5] = p.getnCasa();
			modelo.addRow(fun);
		}


		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 331, 412);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(7, 11, 244, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

		txtNome = new JTextField();
		txtNome.setForeground(Color.DARK_GRAY);
		txtNome.setBounds(7, 45, 308, 25);
		panel.add(txtNome);
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNome.setColumns(10);
		txtNome.setBackground(SystemColor.menu);

		btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario p = new Funcionario();

				String Nome = txtNome.getText();
				String Cpf = txtCpf.getText();
				String Telefone = txtTelefone.getText();
				String Email = txtEmail.getText();
				String Cep = txtCep.getText();
				String Ncasa = txtNcasa.getText();
				
				if (Nome.isEmpty() || Nome == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Cpf.isEmpty() || Cpf == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Telefone.isEmpty() || Telefone == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Email.isEmpty() || Email == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Cep.isEmpty() || Cep == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Ncasa.isEmpty() || Ncasa == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else {
					
					modelo.getDataVector().removeAllElements();
					p.setNome(Nome);
					p.setCpf(Long.valueOf(Cpf));
					p.setTel(Telefone);
					p.setEmail(Email);
					p.setCep(Cep);
					p.setnCasa(Integer.valueOf(txtNcasa.getText()));
					boolean valida = instanciaFun.inserir(p);
					if (valida == true) {
						for (Funcionario p1 : Funcionarios) {
							Object[] fun = new Object[6];
							fun[0] = p1.getNome();
							fun[1] = p1.getCpf();
							fun[2] = p1.getTel();
							fun[3] = p1.getEmail();
							fun[4] = p1.getCep();
							fun[5] = p1.getnCasa();
							modelo.addRow(fun);
						}
						JOptionPane.showInternalMessageDialog(null,"Funcionário CADASTRADO!");
						limparCampos();
					}else {
						JOptionPane.showInternalMessageDialog(null,"ERRO ao cadastrar funcionário!");
					}
				}
			}
			
		});
		btnNewButton.setBounds(7, 378, 96, 23);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton.setBackground(SystemColor.menu);

		btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario p = new Funcionario();
				if (table.getSelectedRow() >= 0) {
					instanciaFun.deletar(p, String.valueOf(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn())));
					table.setModel(modelo);
			} else {
				JOptionPane.showMessageDialog(null, "Você precisa selecionar um cadastro.");
			}

			}
		});
		btnNewButton_1.setBounds(113, 378, 96, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBackground(SystemColor.menu);

		lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(7, 78, 244, 23);
		panel.add(lblNewLabel_1);

		txtCpf = new JTextField();
		txtCpf.setForeground(Color.DARK_GRAY);
		txtCpf.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpf.setColumns(10);
		txtCpf.setBackground(SystemColor.menu);
		txtCpf.setBounds(7, 112, 308, 25);
		panel.add(txtCpf);

		lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(7, 148, 244, 23);
		panel.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("CEP");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 288, 169, 23);
		panel.add(lblNewLabel_3);

		txtCep = new JTextField();
		txtCep.setForeground(Color.DARK_GRAY);
		txtCep.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCep.setColumns(10);
		txtCep.setBackground(SystemColor.menu);
		txtCep.setBounds(10, 322, 169, 25);
		panel.add(txtCep);

		lblNewLabel_4 = new JLabel("N\u00BA Casa");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(189, 289, 113, 23);
		panel.add(lblNewLabel_4);

		txtTelefone = new JTextField();
		txtTelefone.setForeground(Color.DARK_GRAY);
		txtTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBackground(SystemColor.menu);
		txtTelefone.setBounds(7, 182, 308, 25);
		panel.add(txtTelefone);

		lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(7, 218, 244, 23);
		panel.add(lblNewLabel_5);

		txtEmail = new JTextField();
		txtEmail.setForeground(Color.DARK_GRAY);
		txtEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setBounds(7, 252, 308, 25);
		panel.add(txtEmail);

		txtNcasa = new JTextField();
		txtNcasa.setForeground(Color.DARK_GRAY);
		txtNcasa.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNcasa.setColumns(10);
		txtNcasa.setBackground(SystemColor.menu);
		txtNcasa.setBounds(189, 322, 126, 25);
		panel.add(txtNcasa);

		alterarBT = new JButton("Alterar");
		alterarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	if (table.getSelectedRow() >= 0) {
				int linha = table.getSelectedRow();
				String Nome = (String) table.getValueAt(linha, 0);
				//editarFuncionario = instanciaFun.alterar(p, Cpf);

				//txtNome.setText(editarFuncinoario.getNome());
				//txtPeso.setText(String.valueOf(treinadorAEditar.getPeso()));
				//txtAltura.setText(String.valueOf(treinadorAEditar.getAltura()));
				//txtData.setText(treinadorAEditar.getDateNasc());
				//txtCpf.setText(treinadorAEditar.getCpf());
				//comboBoxPok.setSelectedItem(treinadorAEditar.getPokFav());

			//} else {
				JOptionPane.showMessageDialog(null, "Selecione uma linha para alterar.");
			}
			//}

		});
		alterarBT.setForeground(Color.DARK_GRAY);
		alterarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		alterarBT.setBackground(SystemColor.menu);
		alterarBT.setBounds(219, 378, 96, 23);
		panel.add(alterarBT);

		txtCpf = new JTextField();
		txtCpf.setForeground(Color.DARK_GRAY);
		txtCpf.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpf.setColumns(10);
		txtCpf.setBackground(SystemColor.menu);
		txtCpf.setBounds(7, 112, 308, 25);
		panel.add(txtCpf);
	}

	protected void limparCampos() {
		txtNome.setText("");
		txtCpf.setText("");
		txtTelefone.setText("");
		txtCep.setText("");
		txtNcasa.setText("");
		txtEmail.setText("");
	}

	
}