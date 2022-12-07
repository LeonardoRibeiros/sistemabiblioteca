package visao;

import java.awt.Color;
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

import controle.ControleEmprestimo;
import modelo.Acervo;
import modelo.Emprestimo;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class TelaEmprestimo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JComboBox cBoxDiaempre;
	private JComboBox cBoxMesempre;
	private JTextField txtEmprAno;
	private JLabel lblNewLabel;
	private JTextField txtCpfcliente;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private Emprestimo emprestimoSelecionado;
	private JTable table;
	private JTextField txtDevAno;
	private JTextField txtNomeLivro;
	private DefaultTableModel modelo;

	/**
	 * Create the frame.
	 */
	public TelaEmprestimo() {
		ControleEmprestimo instance = ControleEmprestimo.getInstancia();
		ArrayList<Emprestimo> arrayEmprestimo = instance.listarEmprestimos();
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 736, 540);
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
		btnNewButton_2.setBounds(613, 467, 96, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_8 = new JLabel("Empr\u00E9stimo");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(302, 87, 407, 369);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int posicaoEmprestimo = table.getSelectedRow();
				emprestimoSelecionado = arrayEmprestimo.get(posicaoEmprestimo);
				txtCpfcliente.setText(emprestimoSelecionado.getCpfCliente());
				txtNomeLivro.setText(emprestimoSelecionado.getNomeLivro());
				cBoxDiaempre.setToolTipText(emprestimoSelecionado.getDiaempre());
				cBoxMesempre.setToolTipText(emprestimoSelecionado.getMesempre());
				// Diadevo.setToolTipText(emprestimoSelecionado.getDiadevo());
				// cBoxMesdevo.setToolTipText(emprestimoSelecionado.getMesdevo());
				txtEmprAno.setText(String.valueOf(emprestimoSelecionado.getAnoEmprestimo()));
				txtDevAno.setText(String.valueOf(emprestimoSelecionado.getAnoDevolucao()));
				;
			}
		});
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("CPF Cliente");
		modelo.addColumn("Nome Livro");
		modelo.addColumn("Dia Empréstimo");
		modelo.addColumn("Mês Empréstimo");
		modelo.addColumn("Ano Empréstimo");
		modelo.addColumn("Dia Devoluçâo");
		modelo.addColumn("Mês Devoluçâo");
		modelo.addColumn("Ano Devoluçâo");
		

		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 282, 370);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("CPF Cliente");
		lblNewLabel.setBounds(7, 11, 131, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

		txtCpfcliente = new JTextField();
		txtCpfcliente.setForeground(Color.DARK_GRAY);
		txtCpfcliente.setBounds(7, 45, 244, 25);
		panel.add(txtCpfcliente);
		txtCpfcliente.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpfcliente.setColumns(10);
		txtCpfcliente.setBackground(SystemColor.menu);

		lblNewLabel_1 = new JLabel("Data de Empr\u00E9stimo");
		lblNewLabel_1.setBounds(7, 149, 244, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));

		cBoxDiaempre = new JComboBox();
		cBoxDiaempre.setForeground(Color.DARK_GRAY);
		cBoxDiaempre.setBounds(7, 185, 71, 24);
		panel.add(cBoxDiaempre);
		cBoxDiaempre.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
				"26", "27", "28", "29", "30", "31" }));
		cBoxDiaempre.setToolTipText("dia");
		cBoxDiaempre.setFont(new Font("Dialog", Font.PLAIN, 16));
		cBoxDiaempre.setBackground(SystemColor.menu);

		cBoxMesempre = new JComboBox();
		cBoxMesempre.setForeground(Color.DARK_GRAY);
		cBoxMesempre.setBounds(88, 185, 71, 24);
		panel.add(cBoxMesempre);
		cBoxMesempre.setModel(new DefaultComboBoxModel(
				new String[] { "MÊS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		cBoxMesempre.setFont(new Font("Dialog", Font.PLAIN, 16));
		cBoxMesempre.setBackground(SystemColor.menu);

		txtEmprAno = new JTextField();
		txtEmprAno.setForeground(Color.DARK_GRAY);
		txtEmprAno.setBounds(169, 185, 82, 24);
		panel.add(txtEmprAno);
		txtEmprAno.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtEmprAno.setColumns(10);
		txtEmprAno.setBackground(SystemColor.menu);

		txtDevAno = new JTextField();
		txtDevAno.setForeground(Color.DARK_GRAY);
		txtDevAno.setBounds(169, 256, 82, 24);
		panel.add(txtDevAno);
		txtDevAno.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtDevAno.setColumns(10);
		txtDevAno.setBackground(SystemColor.menu);

		JLabel lblNewLabel_1_1 = new JLabel("Data de Devolu\u00E7\u00E3o");
		lblNewLabel_1_1.setBounds(7, 220, 244, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));

		JComboBox diaDevo = new JComboBox();
		diaDevo.setForeground(Color.DARK_GRAY);
		diaDevo.setBounds(7, 256, 71, 24);
		panel.add(diaDevo);
		diaDevo.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		diaDevo.setToolTipText("dia");
		diaDevo.setFont(new Font("Dialog", Font.PLAIN, 16));
		diaDevo.setBackground(SystemColor.menu);

		JComboBox mesDevo = new JComboBox();
		mesDevo.setForeground(Color.DARK_GRAY);
		mesDevo.setBounds(88, 256, 71, 24);
		panel.add(mesDevo);
		mesDevo.setModel(new DefaultComboBoxModel(
				new String[] { "M\u00CAS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		mesDevo.setFont(new Font("Dialog", Font.PLAIN, 16));
		mesDevo.setBackground(SystemColor.menu);

		btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emprestimo p = new Emprestimo();

				if (txtCpfcliente.getText().isEmpty() || txtCpfcliente.getText() == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				//} else if (txtAutor.getText().isEmpty() || txtAutor.getText() == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				//} else if (cBoxgenero.getSelectedItem().equals("*")) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				//} else if (txtNpaginas.getText().isEmpty() || txtNpaginas.getText() == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				//} else if (cBoxestante.getSelectedItem().equals("*")) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else {

					p.setNomeLivro(txtNomeLivro.getText().toString());
					//p.setAutor(txtAutor.getText().toString());
					//p.setGenero(cBoxgenero.getSelectedItem().toString());
					//p.setnPaginas(Integer.valueOf(txtNpaginas.getText().toString()));
					//p.setEstante(cBoxestante.getSelectedItem().toString());
					arrayEmprestimo.add(p);
					limparCampos();
					atualizarJTable(arrayEmprestimo);
				}
			}
		});
		btnNewButton.setBounds(7, 336, 96, 23);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton.setBackground(SystemColor.menu);

		btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(113, 336, 96, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBackground(SystemColor.menu);

		txtNomeLivro = new JTextField();
		txtNomeLivro.setForeground(Color.DARK_GRAY);
		txtNomeLivro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNomeLivro.setColumns(10);
		txtNomeLivro.setBackground(SystemColor.menu);
		txtNomeLivro.setBounds(7, 115, 244, 25);
		panel.add(txtNomeLivro);

		JLabel lblIdLivro = new JLabel("Nome Livro");
		lblIdLivro.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdLivro.setForeground(Color.DARK_GRAY);
		lblIdLivro.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblIdLivro.setBounds(7, 81, 131, 23);
		panel.add(lblIdLivro);
	}
	protected void limparCampos() {
		txtNomeLivro.setText("");
		txtEmprAno.setText("");
		txtDevAno.setText("");
	}

	protected void atualizarJTable(ArrayList<Emprestimo> arrayEmprestimo) {
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "CPF Cliente", "Nome Livro", "Dia Emprésimo", "Mês Empréstimo", "Ano Empréstimo", "Dia Devoluçã", "Mês Devolução", "Ano Devolução"});
		for (int i = 0; i < arrayEmprestimo.size(); i++) {
			Emprestimo p1 = arrayEmprestimo.get(i);
			modelo.addRow(
					new Object[] { p1.getNomeLivro(), p1.getCpfCliente(), p1.getNomeLivro(), p1.getDiaempre(), p1.getMesempre(), p1.getAnoEmprestimo(), p1.getDiadevo(), p1.getMesdevo(), p1.getAnoDevolucao()});
		}

		table.setModel(modelo);

	}
}