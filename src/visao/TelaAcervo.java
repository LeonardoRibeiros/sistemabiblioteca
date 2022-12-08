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
import controle.ControleAcervo;
import modelo.Livro;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class TelaAcervo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JComboBox cBoxgenero;
	private JComboBox cBoxestante;
	private DefaultTableModel modelo;
	private Livro livroSelecionado;
	private JTable table;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public TelaAcervo() {
		ControleAcervo instance = ControleAcervo.getInstancia();
		ArrayList<Livro> arrayAcervo = instance.listarAcervo();

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 955, 513);
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
		voltarBT.setBounds(833, 440, 96, 23);
		contentPane.add(voltarBT);

		JLabel lblNewLabel_8 = new JLabel("Acervo");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 87, 576, 342);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int posicaoLivro = table.getSelectedRow();
				livroSelecionado = arrayAcervo.get(posicaoLivro);
				txtNomelivro.setText(livroSelecionado.getNomeLivro());
				txtAutor.setText(livroSelecionado.getAutor());
				cBoxgenero.setToolTipText(livroSelecionado.getGenero());
				txtNpaginas.setText(String.valueOf(livroSelecionado.getnPaginas()));
				cBoxestante.setToolTipText(livroSelecionado.getEstante());
			}
		});
		scrollPane.setViewportView(table);
		
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("Nome Livro");
		modelo.addColumn("Autor");
		modelo.addColumn("Gênero");
		modelo.addColumn("N Páginas");
		modelo.addColumn("Estante");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 333, 341);
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
		txtNomelivro.setBounds(7, 45, 308, 25);
		panel.add(txtNomelivro);
		txtNomelivro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNomelivro.setColumns(10);
		txtNomelivro.setBackground(SystemColor.menu);

		salvarBT = new JButton("Salvar");
		salvarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro p = new Livro();

				String Nomelivro = txtNomelivro.getText();
				String Autor = txtAutor.getText();
				String Npaginas = txtNpaginas.getText();
				if (Nomelivro.isEmpty() || Nomelivro == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Autor.isEmpty() || Autor == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (cBoxgenero.getSelectedItem().equals("*")) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (Npaginas.isEmpty() || Npaginas == null) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				} else if (cBoxestante.getSelectedItem().equals("*")) {
					JOptionPane.showMessageDialog(null, "Erro: Todos os Campos devem ser Preenchidos!");
				}  else {

					p.setNomeLivro(Nomelivro);
					p.setAutor(Autor);
					p.setGenero(cBoxgenero.getSelectedItem().toString());
					p.setnPaginas(Integer.valueOf(txtNpaginas.getText().toString()));
					p.setEstante(cBoxestante.getSelectedItem().toString());
					arrayAcervo.add(p);
					limparCampos();
					atualizarJTable(arrayAcervo);

				}
			}
		});
		salvarBT.setBounds(7, 307, 96, 23);
		panel.add(salvarBT);
		salvarBT.setForeground(Color.DARK_GRAY);
		salvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		salvarBT.setBackground(SystemColor.menu);

		LimparBT = new JButton("Excluir");
		LimparBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (livroSelecionado != null) {
					arrayAcervo.remove(livroSelecionado);
					atualizarJTable(arrayAcervo);
					limparCampos();
				}
			}
		});
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
		txtAutor.setBounds(7, 112, 308, 25);
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

		cBoxgenero = new JComboBox();
		cBoxgenero.setForeground(Color.DARK_GRAY);
		cBoxgenero.setFont(new Font("Dialog", Font.PLAIN, 18));
		cBoxgenero.setModel(new DefaultComboBoxModel(new String[] {"*", "Romance", "Ficção Científica", "Ação e Aventura", "Biografia", "Infantil", "Suspense", "Fantasia", "Religião", "Drama", "Distopia"}));
		cBoxgenero.setBounds(7, 182, 308, 23);
		panel.add(cBoxgenero);

		lblNewLabel_4 = new JLabel("Estante");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(196, 218, 119, 23);
		panel.add(lblNewLabel_4);

		cBoxestante = new JComboBox();
		cBoxestante.setForeground(Color.DARK_GRAY);
		cBoxestante.setFont(new Font("Dialog", Font.PLAIN, 18));
		cBoxestante.setModel(new DefaultComboBoxModel(new String[] {"*", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cBoxestante.setBounds(196, 252, 119, 23);
		panel.add(cBoxestante);
		
		JButton alterarBT = new JButton("Alterar");
		alterarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		alterarBT.setForeground(Color.DARK_GRAY);
		alterarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		alterarBT.setBackground(SystemColor.menu);
		alterarBT.setBounds(219, 307, 96, 23);
		panel.add(alterarBT);
	}
	protected void limparCampos() {
		txtNomelivro.setText("");
		txtAutor.setText("");
		txtNpaginas.setText("");
		cBoxestante.setSelectedItem("*");
	}

	protected void atualizarJTable(ArrayList<Livro> arrayAcervo) {
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Nome Livro", "Autor", "Gênero", "N páginas", "Estante"});
		for (int i = 0; i < arrayAcervo.size(); i++) {
			Livro p1 = arrayAcervo.get(i);
			modelo.addRow(
					new Object[] { p1.getNomeLivro(), p1.getAutor(), p1.getGenero(), p1.getnPaginas(), p1.getEstante()});
		}

		table.setModel(modelo);

	}
}