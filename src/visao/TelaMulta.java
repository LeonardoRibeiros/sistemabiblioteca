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

public class TelaMulta extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public TelaMulta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 736, 474);
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
		btnNewButton_2.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		btnNewButton_2.setBounds(589, 394, 96, 23);
		contentPane.add(btnNewButton_2);

		lblNewLabel_1 = new JLabel("Data de Devolu\u00E7\u00E3o:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(23, 142, 151, 25);
		contentPane.add(lblNewLabel_1);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setToolTipText("dia");
		comboBox.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		comboBox.setBackground(SystemColor.menu);
		comboBox.setBounds(23, 178, 71, 24);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MÊS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		comboBox_1.setBackground(SystemColor.menu);
		comboBox_1.setBounds(104, 178, 71, 24);
		contentPane.add(comboBox_1);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(185, 178, 82, 24);
		contentPane.add(textField_1);

		lblNewLabel = new JLabel("ID Cliente:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 18));
		lblNewLabel.setBounds(23, 72, 83, 23);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(23, 106, 244, 25);
		contentPane.add(textField);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(58, 249, 209, 25);
		contentPane.add(textField_2);

		lblNewLabel_2 = new JLabel("Valor de Multa Vigente:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 213, 186, 25);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_6 = new JLabel("R$");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 18));
		lblNewLabel_6.setBackground(SystemColor.menu);
		lblNewLabel_6.setBounds(23, 249, 25, 25);
		contentPane.add(lblNewLabel_6);

		btnNewButton = new JButton("Salvar");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setBounds(23, 394, 96, 23);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(130, 394, 96, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("MULTA");
		lblNewLabel_8.setForeground(SystemColor.menu);
		lblNewLabel_8.setBackground(SystemColor.menu);
		lblNewLabel_8.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(23, 11, 121, 43);
		contentPane.add(lblNewLabel_8);
		
		table = new JTable();
		table.setBounds(302, 106, 383, 268);
		contentPane.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("Consulta");
		lblNewLabel_3.setBounds(302, 73, 82, 23);
		contentPane.add(lblNewLabel_3);
	}
}