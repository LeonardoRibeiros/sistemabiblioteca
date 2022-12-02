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
	private JTextField txtNomeFunc;
	private JButton SalvarBT;
	private JButton LimparBT;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JTextField txtCpf;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtCep;
	private JLabel lblNewLabel_4;
	private JTextField txtTelefone;
	private JLabel lblNewLabel_5;
	private JTextField txtEmail;
	private JTextField txtCasa;

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
		VoltarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		VoltarBT.setBounds(669, 510, 96, 23);
		contentPane.add(VoltarBT);
		
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
				
						txtNomeFunc = new JTextField();
						txtNomeFunc.setForeground(Color.DARK_GRAY);
						txtNomeFunc.setBounds(7, 45, 302, 25);
						panel.add(txtNomeFunc);
						txtNomeFunc.setFont(new Font("Dialog", Font.PLAIN, 16));
						txtNomeFunc.setColumns(10);
						txtNomeFunc.setBackground(SystemColor.menu);
														
																SalvarBT = new JButton("Salvar");
																SalvarBT.setBounds(7, 378, 96, 23);
																panel.add(SalvarBT);
																SalvarBT.setForeground(Color.DARK_GRAY);
																SalvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
																SalvarBT.setBackground(Color.WHITE);
																
																		LimparBT = new JButton("Limpar");
																		LimparBT.setBounds(113, 378, 96, 23);
																		panel.add(LimparBT);
																		LimparBT.setForeground(Color.DARK_GRAY);
																		LimparBT.setFont(new Font("Dialog", Font.PLAIN, 16));
																		LimparBT.setBackground(Color.WHITE);
																		
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
																		txtCpf.setBounds(7, 112, 302, 25);
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
																		txtTelefone.setBounds(7, 182, 302, 25);
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
																		txtEmail.setBounds(7, 252, 302, 25);
																		panel.add(txtEmail);
																		
																		txtCasa = new JTextField();
																		txtCasa.setForeground(Color.DARK_GRAY);
																		txtCasa.setFont(new Font("Dialog", Font.PLAIN, 16));
																		txtCasa.setColumns(10);
																		txtCasa.setBackground(SystemColor.menu);
																		txtCasa.setBounds(189, 322, 120, 25);
																		panel.add(txtCasa);
	}
}