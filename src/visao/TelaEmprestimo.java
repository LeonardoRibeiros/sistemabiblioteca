package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaEmprestimo extends JFrame {

	private JPanel contentPane;
	private JTextField txt_idcliente;
	private JTextField textField_1;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public TelaEmprestimo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID Cliente:");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(47, 99, 99, 23);
		contentPane.add(lblNewLabel);

		txt_idcliente = new JTextField();
		txt_idcliente.setBackground(SystemColor.menu);
		txt_idcliente.setBounds(122, 101, 291, 23);
		contentPane.add(txt_idcliente);
		txt_idcliente.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Data de Emprestimo:");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(47, 148, 160, 23);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(47, 347, 152, 32);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_1.setBounds(47, 390, 152, 32);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancelar");
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
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_2.setBounds(362, 430, 99, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Consultar Emprestimos");
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.setForeground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(47, 304, 173, 32);
		contentPane.add(btnNewButton_3);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.menu);
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox.setBounds(193, 176, 55, 23);
		contentPane.add(comboBox);

		JLabel lblNewLabel_3 = new JLabel("DIA");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setBackground(SystemColor.menu);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(193, 135, 55, 23);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("M\u00CAS");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(258, 135, 55, 23);
		contentPane.add(lblNewLabel_4);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(SystemColor.menu);
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_1.setBounds(258, 176, 55, 23);
		contentPane.add(comboBox_1);

		JLabel lblNewLabel_5 = new JLabel("ANO");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(323, 135, 90, 23);
		contentPane.add(lblNewLabel_5);

		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(323, 176, 90, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("EMPRÉSTIMO");
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(153, 30, 179, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de Devolução:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(SystemColor.menu);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(47, 210, 160, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("DIA");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(SystemColor.menu);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1.setBackground(SystemColor.menu);
		lblNewLabel_3_1.setBounds(193, 210, 55, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBox_2.setBackground(SystemColor.menu);
		comboBox_2.setBounds(193, 238, 55, 23);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("MÊS");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(SystemColor.menu);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(258, 210, 55, 23);
		contentPane.add(lblNewLabel_4_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBox_1_1.setBackground(SystemColor.menu);
		comboBox_1_1.setBounds(258, 238, 55, 23);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("ANO");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(SystemColor.menu);
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(323, 210, 90, 23);
		contentPane.add(lblNewLabel_5_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(323, 238, 90, 23);
		contentPane.add(textField);
	}
}
