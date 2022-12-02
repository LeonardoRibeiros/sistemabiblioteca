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
import javax.swing.JInternalFrame;

public class TelaFuncionario extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_2;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the frame.
	 */
	public TelaFuncionario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 791, 583);
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
		btnNewButton_2.setBounds(669, 510, 96, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("Funcion\u00E1rio");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);
		
		table = new JTable();
		table.setBounds(339, 87, 426, 412);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 319, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
				lblNewLabel = new JLabel("Nome ");
				lblNewLabel.setBounds(7, 11, 244, 23);
				panel.add(lblNewLabel);
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel.setForeground(Color.DARK_GRAY);
				lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
				
						textField = new JTextField();
						textField.setForeground(Color.DARK_GRAY);
						textField.setBounds(7, 45, 302, 25);
						panel.add(textField);
						textField.setFont(new Font("Dialog", Font.PLAIN, 16));
						textField.setColumns(10);
						textField.setBackground(SystemColor.menu);
														
																btnNewButton = new JButton("Salvar");
																btnNewButton.setBounds(7, 378, 96, 23);
																panel.add(btnNewButton);
																btnNewButton.setForeground(Color.DARK_GRAY);
																btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
																btnNewButton.setBackground(Color.WHITE);
																
																		btnNewButton_1 = new JButton("Limpar");
																		btnNewButton_1.setBounds(113, 378, 96, 23);
																		panel.add(btnNewButton_1);
																		btnNewButton_1.setForeground(Color.DARK_GRAY);
																		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
																		btnNewButton_1.setBackground(Color.WHITE);
																		
																		lblNewLabel_1 = new JLabel("CPF");
																		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
																		lblNewLabel_1.setForeground(Color.DARK_GRAY);
																		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
																		lblNewLabel_1.setBounds(7, 78, 244, 23);
																		panel.add(lblNewLabel_1);
																		
																		textField_1 = new JTextField();
																		textField_1.setForeground(Color.DARK_GRAY);
																		textField_1.setFont(new Font("Dialog", Font.PLAIN, 16));
																		textField_1.setColumns(10);
																		textField_1.setBackground(SystemColor.menu);
																		textField_1.setBounds(7, 112, 302, 25);
																		panel.add(textField_1);
																		
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
																		
																		textField_3 = new JTextField();
																		textField_3.setForeground(Color.DARK_GRAY);
																		textField_3.setFont(new Font("Dialog", Font.PLAIN, 16));
																		textField_3.setColumns(10);
																		textField_3.setBackground(SystemColor.menu);
																		textField_3.setBounds(10, 322, 169, 25);
																		panel.add(textField_3);
																		
																		lblNewLabel_4 = new JLabel("N\u00BA Casa");
																		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
																		lblNewLabel_4.setForeground(Color.DARK_GRAY);
																		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
																		lblNewLabel_4.setBounds(189, 289, 113, 23);
																		panel.add(lblNewLabel_4);
																		
																		textField_2 = new JTextField();
																		textField_2.setForeground(Color.DARK_GRAY);
																		textField_2.setFont(new Font("Dialog", Font.PLAIN, 16));
																		textField_2.setColumns(10);
																		textField_2.setBackground(SystemColor.menu);
																		textField_2.setBounds(7, 182, 302, 25);
																		panel.add(textField_2);
																		
																		lblNewLabel_5 = new JLabel("Email");
																		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
																		lblNewLabel_5.setForeground(Color.DARK_GRAY);
																		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 18));
																		lblNewLabel_5.setBounds(7, 218, 244, 23);
																		panel.add(lblNewLabel_5);
																		
																		textField_4 = new JTextField();
																		textField_4.setForeground(Color.DARK_GRAY);
																		textField_4.setFont(new Font("Dialog", Font.PLAIN, 16));
																		textField_4.setColumns(10);
																		textField_4.setBackground(SystemColor.menu);
																		textField_4.setBounds(7, 252, 302, 25);
																		panel.add(textField_4);
																		
																		textField_5 = new JTextField();
																		textField_5.setForeground(Color.DARK_GRAY);
																		textField_5.setFont(new Font("Dialog", Font.PLAIN, 16));
																		textField_5.setColumns(10);
																		textField_5.setBackground(SystemColor.menu);
																		textField_5.setBounds(189, 322, 120, 25);
																		panel.add(textField_5);
	}
}