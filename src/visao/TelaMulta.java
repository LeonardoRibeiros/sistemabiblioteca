package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

import controle.ControleCliente;
import controle.ControleMulta;
import modelo.Acervo;
import modelo.Cliente;
import modelo.Multa;

public class TelaMulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JComboBox cBoxDia;
	private JComboBox cBoxMes;
	private JTextField txtAno;
	private JLabel lblNewLabel;
	private JTextField txtCpfCliente;
	private JButton SalvarBT;
	private JButton LimparBT;
	private JTable table;
	private JTextField txtMulta;
	private DefaultTableModel modelo;
	private Multa multaSelecionada;

	/**
	 * Create the frame.
	 */
	public TelaMulta() {
		ControleMulta instance = ControleMulta.getInstancia();
		ArrayList<Multa> arrayMulta = instance.listarMultas();
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 924, 506);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		VoltarBT.setBounds(802, 433, 96, 23);
		contentPane.add(VoltarBT);

		JLabel lblNewLabel_8 = new JLabel("Multa");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(302, 87, 596, 324);
		contentPane.add(scrollPane);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int posicaoMulta = table.getSelectedRow();
				multaSelecionada = arrayMulta.get(posicaoMulta);
				txtCpfCliente.setText(multaSelecionada.getCpfCliente());
				cBoxDia.setToolTipText(multaSelecionada.getDia());
				cBoxMes.setToolTipText(multaSelecionada.getMes());
				txtAno.setText(String.valueOf(multaSelecionada.getAnoDevolucao()));
				txtMulta.setText(String.valueOf(multaSelecionada.getValorMulta()));
				
			}
		});
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("CPF Cliente");
		modelo.addColumn("Dia Devolução");
		modelo.addColumn("Mes Devolução");
		modelo.addColumn("Ano Devolução");
		modelo.addColumn("Valor Multa");
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 282, 325);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("CPF Cliente");
		lblNewLabel.setBounds(7, 11, 244, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

		txtCpfCliente = new JTextField();
		txtCpfCliente.setForeground(Color.DARK_GRAY);
		txtCpfCliente.setBounds(7, 45, 244, 25);
		panel.add(txtCpfCliente);
		txtCpfCliente.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpfCliente.setColumns(10);
		txtCpfCliente.setBackground(SystemColor.menu);

		lblNewLabel_1 = new JLabel("Data de Devolu\u00E7\u00E3o");
		lblNewLabel_1.setBounds(7, 81, 244, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));

		cBoxDia = new JComboBox();
		cBoxDia.setForeground(Color.DARK_GRAY);
		cBoxDia.setBounds(7, 117, 71, 24);
		panel.add(cBoxDia);
		cBoxDia.setModel(new DefaultComboBoxModel(new String[] {"*", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cBoxDia.setToolTipText("dia");
		cBoxDia.setFont(new Font("Dialog", Font.PLAIN, 16));
		cBoxDia.setBackground(SystemColor.menu);

		cBoxMes = new JComboBox();
		cBoxMes.setForeground(Color.DARK_GRAY);
		cBoxMes.setBounds(88, 117, 71, 24);
		panel.add(cBoxMes);
		cBoxMes.setModel(new DefaultComboBoxModel(new String[] {"*", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cBoxMes.setFont(new Font("Dialog", Font.PLAIN, 16));
		cBoxMes.setBackground(SystemColor.menu);

		txtAno = new JTextField();
		txtAno.setForeground(Color.DARK_GRAY);
		txtAno.setBounds(169, 117, 82, 24);
		panel.add(txtAno);
		txtAno.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtAno.setColumns(10);
		txtAno.setBackground(SystemColor.menu);

		JLabel lblNewLabel_1_1 = new JLabel("Multa Vigente");
		lblNewLabel_1_1.setBounds(7, 152, 244, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));

		SalvarBT = new JButton("Salvar");
		SalvarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multa p = new Multa();

				if (txtCpfCliente.getText().isEmpty() || txtCpfCliente.getText() == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				}else if (cBoxDia.getSelectedItem().equals("*")) {
						JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				}else if (cBoxMes.getSelectedItem().equals("*")) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (txtAno.getText().isEmpty() || txtAno.getText() == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (txtMulta.getText().isEmpty() || txtMulta.getText() == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				}  else {

					p.setCpfCliente(txtCpfCliente.getText().toString());
					p.setDia(cBoxDia.getSelectedItem().toString());
					p.setMes(cBoxMes.getSelectedItem().toString());
					p.setAnoDevolucao(Integer.valueOf(txtAno.getText().toString()));
					p.setValorMulta(Integer.valueOf(txtMulta.getText().toString()));
					arrayMulta.add(p);
					limparCampos();
					atualizarJTable(arrayMulta);

				}
			}
		});
		SalvarBT.setBounds(7, 291, 96, 23);
		panel.add(SalvarBT);
		SalvarBT.setForeground(Color.DARK_GRAY);
		SalvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		SalvarBT.setBackground(SystemColor.menu);

		LimparBT = new JButton("Excluir");
		LimparBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (multaSelecionada != null) {
					arrayMulta.remove(multaSelecionada);
					atualizarJTable(arrayMulta);
					limparCampos();
				}
			}
		});
		LimparBT.setBounds(113, 291, 96, 23);
		panel.add(LimparBT);
		LimparBT.setForeground(Color.DARK_GRAY);
		LimparBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		LimparBT.setBackground(SystemColor.menu);

		txtMulta = new JTextField();
		txtMulta.setForeground(Color.DARK_GRAY);
		txtMulta.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtMulta.setColumns(10);
		txtMulta.setBackground(SystemColor.menu);
		txtMulta.setBounds(37, 187, 214, 25);
		panel.add(txtMulta);

		JLabel lblNewLabel_2 = new JLabel("R$");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 188, 45, 23);
		panel.add(lblNewLabel_2);
	}
	protected void limparCampos() {
		txtCpfCliente.setText("");
		txtAno.setText("");
		txtMulta.setText("");
	}

	protected void atualizarJTable(ArrayList<Multa> arrayMulta) {
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "CPF Multa", "Dia Devolução", "Mes Devolução", "Ano Devolução", "Valor Multa"});
		for (int i = 0; i < arrayMulta.size(); i++) {
			Multa p1 = arrayMulta.get(i);
			modelo.addRow(
					new Object[] { p1.getCpfCliente(), p1.getDia(), p1.getMes(), p1.getAnoDevolucao(), p1.getValorMulta()});
		}
		table.setModel(modelo);

	}
}