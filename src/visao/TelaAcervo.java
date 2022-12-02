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

public class TelaAcervo extends JFrame {

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
	private JComboBox comboBox;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox_1;

	/**
	 * Create the frame.
	 */
	public TelaAcervo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 792, 513);
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
		btnNewButton_2.setBounds(669, 440, 96, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("Acervo");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);
		
		table = new JTable();
		table.setBounds(339, 87, 426, 342);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 319, 341);
		contentPane.add(panel);
		panel.setLayout(null);
		
				lblNewLabel = new JLabel("Nome do Livro");
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
																btnNewButton.setBounds(7, 307, 96, 23);
																panel.add(btnNewButton);
																btnNewButton.setForeground(Color.DARK_GRAY);
																btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
																btnNewButton.setBackground(SystemColor.menu);
																
																		btnNewButton_1 = new JButton("Limpar");
																		btnNewButton_1.setBounds(113, 307, 96, 23);
																		panel.add(btnNewButton_1);
																		btnNewButton_1.setForeground(Color.DARK_GRAY);
																		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
																		btnNewButton_1.setBackground(SystemColor.menu);
																		
																		lblNewLabel_1 = new JLabel("Autor");
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
																		
																		lblNewLabel_2 = new JLabel("G\u00EAnero");
																		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
																		lblNewLabel_2.setForeground(Color.DARK_GRAY);
																		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 18));
																		lblNewLabel_2.setBounds(7, 148, 244, 23);
																		panel.add(lblNewLabel_2);
																		
																		lblNewLabel_3 = new JLabel("Número de Páginas");
																		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
																		lblNewLabel_3.setForeground(Color.DARK_GRAY);
																		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
																		lblNewLabel_3.setBounds(7, 218, 169, 23);
																		panel.add(lblNewLabel_3);
																		
																		textField_3 = new JTextField();
																		textField_3.setForeground(Color.DARK_GRAY);
																		textField_3.setFont(new Font("Dialog", Font.PLAIN, 16));
																		textField_3.setColumns(10);
																		textField_3.setBackground(SystemColor.menu);
																		textField_3.setBounds(7, 252, 169, 25);
																		panel.add(textField_3);
																		
																		comboBox = new JComboBox();
																		comboBox.setForeground(Color.DARK_GRAY);
																		comboBox.setFont(new Font("Dialog", Font.PLAIN, 18));
																		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Romance", "Fic\u00E7\u00E3o Cient\u00EDfica", "A\u00E7\u00E3o e Aventura", "Biografia", "Infantil", "Suspense", "Fantasia", "Religi\u00E3o", "Drama", "Distopia"}));
																		comboBox.setBounds(7, 182, 302, 23);
																		panel.add(comboBox);
																		
																		lblNewLabel_4 = new JLabel("Estante");
																		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
																		lblNewLabel_4.setForeground(Color.DARK_GRAY);
																		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
																		lblNewLabel_4.setBounds(196, 218, 113, 23);
																		panel.add(lblNewLabel_4);
																		
																		comboBox_1 = new JComboBox();
																		comboBox_1.setForeground(Color.DARK_GRAY);
																		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 18));
																		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
																		comboBox_1.setBounds(196, 252, 113, 23);
																		panel.add(comboBox_1);
	}
}