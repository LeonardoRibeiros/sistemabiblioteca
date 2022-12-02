package visao;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Dimension;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaPrincipal() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 400);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(176, 196, 222));
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Cadastrar");
		mnNewMenu.setBounds(new Rectangle(0, 0, 0, 11));
		mnNewMenu.setBackground(Color.BLACK);
		mnNewMenu.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.setFont(new Font("Dialog", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Funcion\u00E1rio");
		mntmNewMenuItem_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(0, 60));
		contentPane.setMaximumSize(new Dimension(32800, 32767));
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton EmprestimoBT = new JButton("Empr\u00E9stimo");
		EmprestimoBT.setBounds(133, 89, 217, 34);
		EmprestimoBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela atual
				dispose();

				TelaEmprestimo telaEmprestimo = new TelaEmprestimo();
				telaEmprestimo.setLocationRelativeTo(null);
				telaEmprestimo.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		EmprestimoBT.setForeground(Color.DARK_GRAY);
		EmprestimoBT.setBackground(new Color(176, 196, 222));
		EmprestimoBT.setFont(new Font("Dialog", Font.PLAIN, 18));
		contentPane.add(EmprestimoBT);

		JButton MultaBT = new JButton("Multas");
		MultaBT.setBounds(133, 156, 217, 34);
		MultaBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela atual
				dispose();

				TelaMulta telaMulta = new TelaMulta();
				telaMulta.setLocationRelativeTo(null);
				telaMulta.setVisible(true);
			}
		});
		MultaBT.setForeground(Color.DARK_GRAY);
		MultaBT.setBackground(new Color(176, 196, 222));
		MultaBT.setFont(new Font("Dialog", Font.PLAIN, 18));
		contentPane.add(MultaBT);

		JButton AcervoBT = new JButton("Acervo");
		AcervoBT.setBounds(133, 224, 217, 34);
		AcervoBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela atual
				dispose();

				TelaAcervo telaAcervo = new TelaAcervo();
				telaAcervo.setLocationRelativeTo(null);
				telaAcervo.setVisible(true);
			}
		});
		AcervoBT.setForeground(Color.DARK_GRAY);
		AcervoBT.setBackground(new Color(176, 196, 222));
		AcervoBT.setFont(new Font("Dialog", Font.PLAIN, 18));
		contentPane.add(AcervoBT);

		Button SairBT = new Button("Sair");
		SairBT.setBounds(411, 302, 74, 24);
		SairBT.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 13));
		SairBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		SairBT.setForeground(Color.DARK_GRAY);
		SairBT.setBackground(SystemColor.menu);
		contentPane.add(SairBT);

		JLabel lblNewLabel = new JLabel("BIBLIOTECA");
		lblNewLabel.setBounds(84, 21, 322, 34);
		lblNewLabel.setBackground(SystemColor.menu);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}