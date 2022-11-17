package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class TelaMulta extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Multa");
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_5;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMulta frame = new TelaMulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaMulta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 543, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setBounds(154, 10, 187, 25);
		lblNewJgoodiesTitle.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewJgoodiesTitle.setForeground(SystemColor.menu);
		contentPane.add(lblNewJgoodiesTitle);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setBackground(SystemColor.menu);
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_2.setBounds(428, 327, 89, 23);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_1 = new JLabel("Data de Devolu\u00E7\u00E3o:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 109, 179, 43);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("DIA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3.setBackground(SystemColor.menu);
		lblNewLabel_3.setBounds(173, 109, 76, 43);
		contentPane.add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBox.setBackground(SystemColor.menu);
		comboBox.setBounds(211, 114, 66, 32);
		contentPane.add(comboBox);
		
		lblNewLabel_4 = new JLabel("M\u00CAS");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(287, 109, 66, 43);
		contentPane.add(lblNewLabel_4);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBox_1.setBackground(SystemColor.menu);
		comboBox_1.setBounds(327, 116, 66, 32);
		contentPane.add(comboBox_1);
		
		lblNewLabel_5 = new JLabel("ANO");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(404, 109, 66, 43);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(438, 116, 66, 32);
		contentPane.add(textField_1);
		
		lblNewLabel = new JLabel("ID Cliente:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 55, 107, 43);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(108, 62, 170, 32);
		contentPane.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(211, 168, 121, 32);
		contentPane.add(textField_2);
		
		lblNewLabel_2 = new JLabel("Valor de Multa Vigente:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 161, 179, 43);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_6 = new JLabel("R$");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_6.setBackground(SystemColor.menu);
		lblNewLabel_6.setBounds(183, 163, 76, 43);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("/DIA");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setForeground(SystemColor.menu);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(337, 163, 66, 43);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setBounds(23, 239, 116, 33);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(23, 291, 116, 33);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("Consultar");
		btnNewButton_3.setForeground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.setBounds(149, 239, 117, 33);
		contentPane.add(btnNewButton_3);
	}
}