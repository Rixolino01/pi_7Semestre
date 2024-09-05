package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JButton btnProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\PetShop\\886802.png"));
		setBackground(Color.GREEN);
		setForeground(Color.PINK);
		setTitle("Início");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 432);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 138, 391);
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		contentPane.add(panel);
		
		btnProdutos = new JButton("Produtos");
		btnProdutos.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\bolsa-de-compras.png"));
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				CadastroProdutos p = new CadastroProdutos();
				this.dispose();
				p.setVisible(true);
				
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Vendas v = new Vendas();
				this.dispose();
				v.setVisible(true);
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnVendas.setBounds(0, 110, 137, 57);
		panel.add(btnVendas);
		btnVendas.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\saco-de-dolar.png"));
		btnVendas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnVendas.setBackground(UIManager.getColor("Button.background"));
		btnProdutos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnProdutos.setBackground(UIManager.getColor("Button.background"));
		btnProdutos.setBounds(0, 0, 137, 57);
		panel.add(btnProdutos);
		
		JButton btnCompras = new JButton("Compras");
		btnCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Compras co = new Compras();
				this.dispose();
				co.setVisible(true);
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnCompras.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\carrinho-de-compras.png"));
		btnCompras.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCompras.setBackground(UIManager.getColor("Button.background"));
		btnCompras.setBounds(0, 165, 137, 57);
		panel.add(btnCompras);
		
		JButton btnFornecedores = new JButton("Fornecedores");
		btnFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroForn cf = new CadastroForn();
				this.dispose();
				cf.setVisible(true);
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnFornecedores.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lado-do-caminhao.png"));
		btnFornecedores.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnFornecedores.setBackground(UIManager.getColor("Button.background"));
		btnFornecedores.setBounds(0, 220, 137, 57);
		panel.add(btnFornecedores);
		
		JButton btnPets = new JButton("Pets");
		btnPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pets pe = new Pets();
				this.dispose();
				pe.setVisible(true);
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnPets.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\pata.png"));
		btnPets.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnPets.setBackground(UIManager.getColor("Button.background"));
		btnPets.setBounds(0, 274, 137, 57);
		panel.add(btnPets);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes cl = new Clientes();
				this.dispose();
				cl.setVisible(true);
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnClientes.setBounds(0, 55, 137, 57);
		panel.add(btnClientes);
		btnClientes.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\usuarios-alt.png"));
		btnClientes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnClientes.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
				
			}

		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\deletar-usuario.png"));
		btnSair.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setBounds(0, 329, 137, 57);
		panel.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\English Presentation\\c42d98f6c7dd63ba9ca673d20a0492ce-edificio-de-loja-de-animais-de-estimacao (1).png"));
		lblNewLabel.setBounds(135, 123, 491, 270);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Agro Pet ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(314, 27, 120, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Sapeca");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 38));
		lblNewLabel_4.setBounds(314, 63, 129, 49);
		contentPane.add(lblNewLabel_4);
	}
}
