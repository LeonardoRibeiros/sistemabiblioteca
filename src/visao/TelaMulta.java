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
	private JTextField txtAno;
	private JLabel lblNewLabel;
	private JTextField txtClienteID;
	private JButton SalvarBT;
	private JButton LimparBT;
	private JTable table;
	private JTextField txtValorMulta;

	/**
	 * Create the frame.
	 */
	public TelaMulta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 735, 506);
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
		VoltarBT.setBounds(613, 423, 96, 23);
		contentPane.add(VoltarBT);
		
		JLabel lblNewLabel_8 = new JLabel("Multa");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);
		
		table = new JTable();
		table.setBounds(302, 87, 407, 324);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 282, 325);
		contentPane.add(panel);
		panel.setLayout(null);
		
				lblNewLabel = new JLabel("ID Cliente");
				lblNewLabel.setBounds(7, 11, 83, 23);
				panel.add(lblNewLabel);
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel.setForeground(Color.DARK_GRAY);
				lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
				
						txtClienteID = new JTextField();
						txtClienteID.setForeground(Color.DARK_GRAY);
						txtClienteID.setBounds(7, 45, 244, 25);
						panel.add(txtClienteID);
						txtClienteID.setFont(new Font("Dialog", Font.PLAIN, 16));
						txtClienteID.setColumns(10);
						txtClienteID.setBackground(SystemColor.menu);
						
								lblNewLabel_1 = new JLabel("Data de Devolu\u00E7\u00E3o");
								lblNewLabel_1.setBounds(7, 81, 244, 25);
								panel.add(lblNewLabel_1);
								lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
								lblNewLabel_1.setForeground(Color.DARK_GRAY);
								lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
								
										comboBox = new JComboBox();
										comboBox.setForeground(Color.DARK_GRAY);
										comboBox.setBounds(7, 117, 71, 24);
										panel.add(comboBox);
										comboBox.setModel(new DefaultComboBoxModel(new String[] {"DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
										comboBox.setToolTipText("dia");
										comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
										comboBox.setBackground(SystemColor.menu);
										
												comboBox_1 = new JComboBox();
												comboBox_1.setForeground(Color.DARK_GRAY);
												comboBox_1.setBounds(88, 117, 71, 24);
												panel.add(comboBox_1);
												comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MÊS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
												comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 16));
												comboBox_1.setBackground(SystemColor.menu);
												
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
																SalvarBT.setBounds(7, 291, 96, 23);
																panel.add(SalvarBT);
																SalvarBT.setForeground(Color.DARK_GRAY);
																SalvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
																SalvarBT.setBackground(SystemColor.menu);
																
																		LimparBT = new JButton("Limpar");
																		LimparBT.setBounds(113, 291, 96, 23);
																		panel.add(LimparBT);
																		LimparBT.setForeground(Color.DARK_GRAY);
																		LimparBT.setFont(new Font("Dialog", Font.PLAIN, 16));
																		LimparBT.setBackground(SystemColor.menu);
																		
																		txtValorMulta = new JTextField();
																		txtValorMulta.setForeground(Color.DARK_GRAY);
																		txtValorMulta.setFont(new Font("Dialog", Font.PLAIN, 16));
																		txtValorMulta.setColumns(10);
																		txtValorMulta.setBackground(SystemColor.menu);
																		txtValorMulta.setBounds(37, 187, 214, 25);
																		panel.add(txtValorMulta);
																		
																		JLabel lblNewLabel_2 = new JLabel("R$");
																		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
																		lblNewLabel_2.setForeground(Color.DARK_GRAY);
																		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 16));
																		lblNewLabel_2.setBounds(10, 188, 45, 23);
																		panel.add(lblNewLabel_2);
	}
}