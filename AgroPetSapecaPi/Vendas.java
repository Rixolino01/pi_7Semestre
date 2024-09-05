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

public class Vendas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodVenda;
	private JTextField txtProduto;
	private JTextField txtQtdd;
	private JTextField txtPreco;
	private JTextField txtImposto;
	private JTextField txtMargem;
	private JTextField txtDtVenda;

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
					Vendas frame = new Vendas();
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
	public Vendas() {
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\dolar.png"));
		setTitle("Vendas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblVendas.setBounds(318, 21, 96, 23);
		contentPane.add(lblVendas);
		
		JLabel lblCdigoDaVenda = new JLabel("Código da venda:");
		lblCdigoDaVenda.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigoDaVenda.setBounds(150, 70, 107, 22);
		contentPane.add(lblCdigoDaVenda);
		
		txtCodVenda = new JTextField();
		txtCodVenda.setColumns(10);
		txtCodVenda.setBounds(256, 71, 61, 28);
		contentPane.add(txtCodVenda);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblProduto.setBounds(340, 71, 59, 22);
		contentPane.add(lblProduto);
		
		txtProduto = new JTextField();
		txtProduto.setColumns(10);
		txtProduto.setBounds(396, 71, 218, 28);
		contentPane.add(txtProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblQuantidade.setBounds(149, 117, 80, 22);
		contentPane.add(lblQuantidade);
		
		txtQtdd = new JTextField();
		txtQtdd.setColumns(10);
		txtQtdd.setBounds(239, 118, 46, 28);
		contentPane.add(txtQtdd);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPreo.setBounds(328, 117, 46, 22);
		contentPane.add(lblPreo);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(378, 118, 69, 28);
		contentPane.add(txtPreco);
		
		JLabel lblImposto = new JLabel("Imposto:");
		lblImposto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblImposto.setBounds(471, 117, 59, 22);
		contentPane.add(lblImposto);
		
		txtImposto = new JTextField();
		txtImposto.setColumns(10);
		txtImposto.setBounds(540, 118, 74, 28);
		contentPane.add(txtImposto);
		
		JLabel lblMargem = new JLabel("Margem:");
		lblMargem.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblMargem.setBounds(155, 164, 74, 22);
		contentPane.add(lblMargem);
		
		txtMargem = new JTextField();
		txtMargem.setColumns(10);
		txtMargem.setBounds(221, 165, 96, 28);
		contentPane.add(txtMargem);
		
		JLabel lblDataDaVenda = new JLabel("Data da venda:");
		lblDataDaVenda.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblDataDaVenda.setBounds(365, 164, 96, 22);
		contentPane.add(lblDataDaVenda);
		
		txtDtVenda = new JTextField();
		txtDtVenda.setColumns(10);
		txtDtVenda.setBounds(471, 165, 143, 28);
		contentPane.add(txtDtVenda);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(142, 245, 111, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparCampos();
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(265, 245, 111, 35);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo (1).png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(388, 245, 111, 35);
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
		btnSair.setBounds(511, 245, 111, 35);
		contentPane.add(btnSair);
	}
	
	public void limparCampos() {
		
		txtCodVenda.setText(" ");
		txtProduto.setText(" ");
		txtQtdd.setText(" ");
		txtPreco.setText(" ");
		txtImposto.setText(" ");
		txtMargem.setText(" ");
		txtDtVenda.setText(" ");
		
		
	}

}
