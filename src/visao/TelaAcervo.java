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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtNomelivro;
	private JTextField txtAutor;
	private JTextField txtNpaginas;
	private JButton salvarBT;
	private JButton LimparBT;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTable table;

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

		JButton voltarBT = new JButton("Voltar");
		voltarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				TelaPrincipal frame = new TelaPrincipal();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		voltarBT.setBackground(SystemColor.menu);
		voltarBT.setForeground(Color.DARK_GRAY);
		voltarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		voltarBT.setBounds(669, 440, 96, 23);
		contentPane.add(voltarBT);

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

		txtNomelivro = new JTextField();
		txtNomelivro.setForeground(Color.DARK_GRAY);
		txtNomelivro.setBounds(7, 45, 302, 25);
		panel.add(txtNomelivro);
		txtNomelivro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNomelivro.setColumns(10);
		txtNomelivro.setBackground(SystemColor.menu);

		salvarBT = new JButton("Salvar");
		salvarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		salvarBT.setBounds(7, 307, 96, 23);
		panel.add(salvarBT);
		salvarBT.setForeground(Color.DARK_GRAY);
		salvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		salvarBT.setBackground(SystemColor.menu);

		LimparBT = new JButton("Excluir");
		LimparBT.setBounds(113, 307, 96, 23);
		panel.add(LimparBT);
		LimparBT.setForeground(Color.DARK_GRAY);
		LimparBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		LimparBT.setBackground(SystemColor.menu);

		lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(7, 78, 244, 23);
		panel.add(lblNewLabel_1);

		txtAutor = new JTextField();
		txtAutor.setForeground(Color.DARK_GRAY);
		txtAutor.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtAutor.setColumns(10);
		txtAutor.setBackground(SystemColor.menu);
		txtAutor.setBounds(7, 112, 302, 25);
		panel.add(txtAutor);

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

		txtNpaginas = new JTextField();
		txtNpaginas.setForeground(Color.DARK_GRAY);
		txtNpaginas.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNpaginas.setColumns(10);
		txtNpaginas.setBackground(SystemColor.menu);
		txtNpaginas.setBounds(7, 252, 169, 25);
		panel.add(txtNpaginas);

		comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Romance", "Fic\u00E7\u00E3o Cient\u00EDfica", "A\u00E7\u00E3o e Aventura", "Biografia",
						"Infantil", "Suspense", "Fantasia", "Religi\u00E3o", "Drama", "Distopia" }));
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
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
		comboBox_1.setBounds(196, 252, 113, 23);
		panel.add(comboBox_1);
	}
}