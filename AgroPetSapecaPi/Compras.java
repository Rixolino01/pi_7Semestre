package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compras extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodProdido;
	private JTextField txtProduto;
	private JTextField txtQtdd;
	private JTextField txtPreco;
	private JTextField txtCodForn;
	private JTextField txtDtCompra;
	private JTextField txtNomeForn;

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
					Compras frame = new Compras();
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
	public Compras() {
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\carrinho-de-compras.png"));
		setTitle("Compras");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompras = new JLabel("Compras");
		lblCompras.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblCompras.setBounds(311, 11, 100, 41);
		contentPane.add(lblCompras);
		
		JLabel lblCdigoPedido = new JLabel("Código pedido:");
		lblCdigoPedido.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigoPedido.setBounds(146, 74, 91, 22);
		contentPane.add(lblCdigoPedido);
		
		txtCodProdido = new JTextField();
		txtCodProdido.setColumns(10);
		txtCodProdido.setBounds(241, 75, 50, 28);
		contentPane.add(txtCodProdido);
		
		JLabel lblProdutos = new JLabel("Produtos:");
		lblProdutos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblProdutos.setBounds(316, 74, 59, 22);
		contentPane.add(lblProdutos);
		
		txtProduto = new JTextField();
		txtProduto.setColumns(10);
		txtProduto.setBounds(379, 76, 235, 28);
		contentPane.add(txtProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblQuantidade.setBounds(148, 123, 74, 22);
		contentPane.add(lblQuantidade);
		
		txtQtdd = new JTextField();
		txtQtdd.setColumns(10);
		txtQtdd.setBounds(232, 124, 50, 28);
		contentPane.add(txtQtdd);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPreo.setBounds(295, 123, 43, 22);
		contentPane.add(lblPreo);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(342, 124, 59, 28);
		contentPane.add(txtPreco);
		
		JLabel lblCdigoFornecedor = new JLabel("Código Fornecedor:");
		lblCdigoFornecedor.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigoFornecedor.setBounds(149, 166, 117, 22);
		contentPane.add(lblCdigoFornecedor);
		
		txtCodForn = new JTextField();
		txtCodForn.setColumns(10);
		txtCodForn.setBounds(267, 167, 50, 28);
		contentPane.add(txtCodForn);
		
		JLabel lblDataDaCompra = new JLabel("Data da compra:");
		lblDataDaCompra.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblDataDaCompra.setBounds(418, 123, 108, 22);
		contentPane.add(lblDataDaCompra);
		
		txtDtCompra = new JTextField();
		txtDtCompra.setColumns(10);
		txtDtCompra.setBounds(535, 124, 79, 28);
		contentPane.add(txtDtCompra);
		
		JLabel lblNomeDoDornecedor = new JLabel("Nome do Fornecedor:");
		lblNomeDoDornecedor.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNomeDoDornecedor.setBounds(336, 167, 131, 22);
		contentPane.add(lblNomeDoDornecedor);
		
		txtNomeForn = new JTextField();
		txtNomeForn.setColumns(10);
		txtNomeForn.setBounds(472, 168, 142, 28);
		contentPane.add(txtNomeForn);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(144, 262, 111, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparCampos();
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(265, 262, 111, 35);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo (1).png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(387, 262, 111, 35);
		contentPane.add(btnExcluir);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 138, 391);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\PetShop\\D_NQ_NP_821295-MLB32659461315_102019-O.jpg"));
		lblNewLabel_1.setBounds(0, 0, 138, 391);
		panel.add(lblNewLabel_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal p = new Principal();
				this.dispose();
				p.setVisible(true);
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\deletar-usuario.png"));
		btnSair.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnSair.setBounds(509, 262, 111, 35);
		contentPane.add(btnSair);
	}
	
	public void limparCampos() {
		
		
		txtCodProdido.setText(" ");
		txtProduto.setText(" ");
		txtQtdd.setText(" ");
		txtPreco.setText(" ");
		txtCodForn.setText(" ");
		txtDtCompra.setText(" ");
		txtNomeForn.setText(" ");
	}

}
