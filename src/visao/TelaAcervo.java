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

import controle.ControleLivro;
import modelo.Livro;
import java.awt.event.ActionListener;
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
	private JButton excluirBT;
	private JComboBox cBoxgenero;
	private JComboBox cBoxestante;
	private DefaultTableModel modelo;
	private Livro editarLivro;
	private JTable table;
	private JButton confirmarBT;
	private JButton cancelarBT;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TelaAcervo() {
		ControleLivro instanciaLiv = ControleLivro.getInstancia();
		ArrayList<Livro> Livros = instanciaLiv.listarLivros();

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 955, 513);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Panel----------------------------------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 87, 333, 341);
		contentPane.add(panel);
		panel.setLayout(null);

		// Labels---------------------------------------------------------------------------
		JLabel lblNewLabel_8 = new JLabel("Acervo");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(10, 21, 244, 43);
		contentPane.add(lblNewLabel_8);

		lblNewLabel = new JLabel("Nome do Livro");
		lblNewLabel.setBounds(7, 11, 244, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

		lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(7, 78, 244, 23);
		panel.add(lblNewLabel_1);

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

		lblNewLabel_4 = new JLabel("Estante");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(196, 218, 119, 23);
		panel.add(lblNewLabel_4);

		// TextFields------------------------------------------------------------------
		txtNomelivro = new JTextField();
		txtNomelivro.setForeground(Color.DARK_GRAY);
		txtNomelivro.setBounds(7, 45, 308, 25);
		panel.add(txtNomelivro);
		txtNomelivro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNomelivro.setColumns(10);
		txtNomelivro.setBackground(SystemColor.menu);

		txtAutor = new JTextField();
		txtAutor.setForeground(Color.DARK_GRAY);
		txtAutor.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtAutor.setColumns(10);
		txtAutor.setBackground(SystemColor.menu);
		txtAutor.setBounds(7, 112, 308, 25);
		panel.add(txtAutor);

		txtNpaginas = new JTextField();
		txtNpaginas.setForeground(Color.DARK_GRAY);
		txtNpaginas.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNpaginas.setColumns(10);
		txtNpaginas.setBackground(SystemColor.menu);
		txtNpaginas.setBounds(7, 252, 169, 25);
		panel.add(txtNpaginas);

		// ComboBoxes--------------------------------------------------------------------------
		cBoxgenero = new JComboBox();
		cBoxgenero.setForeground(Color.DARK_GRAY);
		cBoxgenero.setFont(new Font("Dialog", Font.PLAIN, 18));
		cBoxgenero.setModel(new DefaultComboBoxModel(new String[] { "*", "Romance", "Ficção Científica",
				"Ação e Aventura", "Biografia", "Infantil", "Suspense", "Fantasia", "Religião", "Drama", "Distopia" }));
		cBoxgenero.setBounds(7, 182, 308, 23);
		panel.add(cBoxgenero);

		cBoxestante = new JComboBox();
		cBoxestante.setForeground(Color.DARK_GRAY);
		cBoxestante.setFont(new Font("Dialog", Font.PLAIN, 18));
		cBoxestante.setModel(new DefaultComboBoxModel(new String[] { "*", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
		cBoxestante.setBounds(196, 252, 119, 23);
		panel.add(cBoxestante);

		// ScrollPane +
		// TableModel--------------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 87, 576, 342);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("Nome Livro");
		modelo.addColumn("Autor");
		modelo.addColumn("Gênero");
		modelo.addColumn("N Páginas");
		modelo.addColumn("Estante");

		for (Livro p : Livros) {
			Object[] liv = new Object[5];
			liv[0] = p.getNomeLivro();
			liv[1] = p.getAutor();
			liv[2] = p.getGenero();
			liv[3] = p.getnPaginas();
			liv[4] = p.getEstante();
			modelo.addRow(liv);
		}

		// Buttons------------------------------------------------------------------------------
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

		// --------------------------------------------------------------------------------------
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
				} else {

					modelo.getDataVector().removeAllElements();
					p.setNomeLivro(Nomelivro);
					p.setAutor(Autor);
					p.setGenero(cBoxgenero.getSelectedItem().toString());
					p.setnPaginas(Integer.valueOf(txtNpaginas.getText().toString()));
					p.setEstante(cBoxestante.getSelectedItem().toString());
					boolean valida = instanciaLiv.inserir(p);
					if (valida == true) {
						for (Livro p1 : Livros) {
							Object[] liv = new Object[5];
							liv[0] = p1.getNomeLivro();
							liv[1] = p1.getAutor();
							liv[2] = p1.getGenero();
							liv[3] = p1.getnPaginas();
							liv[4] = p1.getEstante();
							modelo.addRow(liv);
						}
						JOptionPane.showInternalMessageDialog(null, "Livro CADASTRADO!");
						limparCampos();
					} else {
						JOptionPane.showInternalMessageDialog(null, "ERRO ao cadastrar livro!");
					}

				}
			}
		});
		salvarBT.setBounds(7, 307, 96, 23);
		panel.add(salvarBT);
		salvarBT.setForeground(Color.DARK_GRAY);
		salvarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		salvarBT.setBackground(SystemColor.menu);

		// ---------------------------------------------------------------------------------------------
		excluirBT = new JButton("Excluir");
		excluirBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro p = new Livro();
				if (table.getSelectedRow() >= 0) {
					instanciaLiv.deletar(p,
							String.valueOf(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn())));
					modelo.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Livro EXCLUÍDO!");
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um livro para excluir.");
				}

			}
		});
		excluirBT.setBounds(113, 307, 96, 23);
		panel.add(excluirBT);
		excluirBT.setForeground(Color.DARK_GRAY);
		excluirBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		excluirBT.setBackground(SystemColor.menu);

		// --------------------------------------------------------------------------------------------
		JButton alterarBT = new JButton("Alterar");
		alterarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() >= 0) {
					salvarBT.setVisible(false);
					excluirBT.setVisible(false);
					alterarBT.setVisible(false);
					confirmarBT.setVisible(true);
					cancelarBT.setVisible(true);

					int linha = table.getSelectedRow();
					String nomeLivro = (String) table.getValueAt(linha, 0);
					editarLivro = instanciaLiv.nomelivro(nomeLivro);

					txtNomelivro.setText(editarLivro.getNomeLivro());
					txtAutor.setText(editarLivro.getAutor());
					txtNpaginas.setText(String.valueOf(editarLivro.getnPaginas()));
					cBoxgenero.setSelectedItem(editarLivro.getGenero());
					cBoxestante.setSelectedItem(editarLivro.getEstante());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um cadastro para alterar.");
				}
			}
		});
		alterarBT.setForeground(Color.DARK_GRAY);
		alterarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		alterarBT.setBackground(SystemColor.menu);
		alterarBT.setBounds(219, 307, 96, 23);
		panel.add(alterarBT);

		// ------------------------------------------------------------------------------------------------
		confirmarBT = new JButton("Confirmar");
		confirmarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valida = instanciaLiv.alterar(editarLivro, editarLivro.getNomeLivro());
				if (valida) {
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
					} else {

						modelo.getDataVector().removeAllElements();
						editarLivro.setNomeLivro(Nomelivro);
						editarLivro.setAutor(Autor);
						editarLivro.setGenero(cBoxgenero.getSelectedItem().toString());
						editarLivro.setnPaginas(Integer.valueOf(txtNpaginas.getText().toString()));
						editarLivro.setEstante(cBoxestante.getSelectedItem().toString());
						for (Livro p1 : Livros) {
							Object[] liv = new Object[5];
							liv[0] = p1.getNomeLivro();
							liv[1] = p1.getAutor();
							liv[2] = p1.getGenero();
							liv[3] = p1.getnPaginas();
							liv[4] = p1.getEstante();
							modelo.addRow(liv);
						}
						salvarBT.setVisible(true);
						excluirBT.setVisible(true);
						alterarBT.setVisible(true);
						confirmarBT.setVisible(false);
						cancelarBT.setVisible(false);
						limparCampos();
						JOptionPane.showMessageDialog(null, "Cadastro ALTERADO!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "ERRO ao alterar cadastro");
				}
			}
		});
		confirmarBT.setBackground(SystemColor.menu);
		confirmarBT.setForeground(Color.DARK_GRAY);
		confirmarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		confirmarBT.setBounds(7, 307, 107, 23);
		panel.add(confirmarBT);
		confirmarBT.setVisible(false);

		// ------------------------------------------------------------------------------------------------
		cancelarBT = new JButton("Cancelar");
		cancelarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarBT.setVisible(true);
				excluirBT.setVisible(true);
				alterarBT.setVisible(true);
				confirmarBT.setVisible(false);
				cancelarBT.setVisible(false);
				limparCampos();
			}
		});
		cancelarBT.setBackground(SystemColor.menu);
		cancelarBT.setForeground(Color.DARK_GRAY);
		cancelarBT.setFont(new Font("Dialog", Font.PLAIN, 16));
		cancelarBT.setBounds(208, 307, 107, 23);
		panel.add(cancelarBT);
		cancelarBT.setVisible(false);
		}

		// ------------------------------------------------------------------------------------------------
		protected void limparCampos() {
		txtNomelivro.setText("");
		txtAutor.setText("");
		txtNpaginas.setText("");
		cBoxgenero.setSelectedItem("*");
		cBoxestante.setSelectedItem("*");
			}
		}