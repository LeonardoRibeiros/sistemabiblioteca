package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class TelaEmprestimo extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextField txtEmprAno;
	private JLabel lblNewLabel;
	private JTextField txtIdCliente;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTable table;
	private JTextField txtDevAno;
	private JTextField txtIdLivro;

	/**
	 * Create the frame.
	 */
	public TelaEmprestimo() {
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

		table = new JTable();
		table.setBounds(302, 87, 407, 369);
		contentPane.add(table);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 282, 370);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("ID Cliente");
		lblNewLabel.setBounds(7, 11, 83, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

		txtIdCliente = new JTextField();
		txtIdCliente.setForeground(Color.DARK_GRAY);
		txtIdCliente.setBounds(7, 45, 244, 25);
		panel.add(txtIdCliente);
		txtIdCliente.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtIdCliente.setColumns(10);
		txtIdCliente.setBackground(SystemColor.menu);

		lblNewLabel_1 = new JLabel("Data de Empr\u00E9stimo");
		lblNewLabel_1.setBounds(7, 149, 244, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));

		comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setBounds(7, 185, 71, 24);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		comboBox.setToolTipText("dia");
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox.setBackground(SystemColor.menu);

		comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.DARK_GRAY);
		comboBox_1.setBounds(88, 185, 71, 24);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "MÊS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_1.setBackground(SystemColor.menu);

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

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.DARK_GRAY);
		comboBox_2.setBounds(7, 256, 71, 24);
		panel.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		comboBox_2.setToolTipText("dia");
		comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_2.setBackground(SystemColor.menu);

		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(Color.DARK_GRAY);
		comboBox_1_1.setBounds(88, 256, 71, 24);
		panel.add(comboBox_1_1);
		comboBox_1_1.setModel(new DefaultComboBoxModel(
				new String[] { "M\u00CAS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_1_1.setBackground(SystemColor.menu);

		btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(7, 336, 96, 23);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton.setBackground(SystemColor.menu);

		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(113, 336, 96, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBackground(SystemColor.menu);

		txtIdLivro = new JTextField();
		txtIdLivro.setForeground(Color.DARK_GRAY);
		txtIdLivro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtIdLivro.setColumns(10);
		txtIdLivro.setBackground(SystemColor.menu);
		txtIdLivro.setBounds(7, 115, 244, 25);
		panel.add(txtIdLivro);

		JLabel lblIdLivro = new JLabel("ID Livro");
		lblIdLivro.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdLivro.setForeground(Color.DARK_GRAY);
		lblIdLivro.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblIdLivro.setBounds(7, 81, 83, 23);
		panel.add(lblIdLivro);
	}
}