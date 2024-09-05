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

public class CadastroProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodProduto;
	private JTextField txtNomeProduto;
	private JTextField txtFabricante;
	private JTextField txtLote;
	private JTextField txtCusto;
	private JTextField txtCategoria;
	private JTextField txtPublico;
	private JTextField txtQtddTotal;
	private JTextField txtQtddMin;
	private JTextField txtEstoqueSeg;

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
					CadastroProdutos frame = new CadastroProdutos();
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
	public CadastroProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\bolsa-de-compras.png"));
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setTitle("Cadastro de Produtos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeproduto = new JLabel("Cadastro de Produtos");
		lblCadastroDeproduto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblCadastroDeproduto.setBounds(267, 27, 223, 23);
		contentPane.add(lblCadastroDeproduto);
		
		JLabel lblCdigoDoProduto = new JLabel("Código:");
		lblCdigoDoProduto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigoDoProduto.setBounds(148, 78, 48, 22);
		contentPane.add(lblCdigoDoProduto);
		
		txtCodProduto = new JTextField();
		txtCodProduto.setColumns(10);
		txtCodProduto.setBounds(197, 79, 86, 28);
		contentPane.add(txtCodProduto);
		
		JLabel lblNomeDoProduto = new JLabel("Nome:");
		lblNomeDoProduto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNomeDoProduto.setBounds(311, 78, 48, 22);
		contentPane.add(lblNomeDoProduto);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setColumns(10);
		txtNomeProduto.setBounds(358, 78, 258, 28);
		contentPane.add(txtNomeProduto);
		
		JLabel lblFornecedor = new JLabel("Fabricante:");
		lblFornecedor.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblFornecedor.setBounds(148, 124, 80, 22);
		contentPane.add(lblFornecedor);
		
		txtFabricante = new JTextField();
		txtFabricante.setColumns(10);
		txtFabricante.setBounds(225, 125, 159, 28);
		contentPane.add(txtFabricante);
		
		JLabel lblLote = new JLabel("Lote:");
		lblLote.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblLote.setBounds(402, 125, 29, 22);
		contentPane.add(lblLote);
		
		txtLote = new JTextField();
		txtLote.setColumns(10);
		txtLote.setBounds(436, 126, 66, 28);
		contentPane.add(txtLote);
		
		JLabel lblCusto = new JLabel("Custo:");
		lblCusto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCusto.setBounds(512, 125, 41, 22);
		contentPane.add(lblCusto);
		
		txtCusto = new JTextField();
		txtCusto.setColumns(10);
		txtCusto.setBounds(552, 126, 64, 28);
		contentPane.add(txtCusto);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCategoria.setBounds(148, 168, 74, 22);
		contentPane.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(225, 169, 167, 28);
		contentPane.add(txtCategoria);
		
		JLabel lblPblico = new JLabel("Público:");
		lblPblico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPblico.setBounds(443, 169, 48, 22);
		contentPane.add(lblPblico);
		
		txtPublico = new JTextField();
		txtPublico.setColumns(10);
		txtPublico.setBounds(501, 170, 115, 28);
		contentPane.add(txtPublico);
		
		JLabel lblQtddTotal = new JLabel("Qtdd. total:");
		lblQtddTotal.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblQtddTotal.setBounds(148, 210, 74, 22);
		contentPane.add(lblQtddTotal);
		
		txtQtddTotal = new JTextField();
		txtQtddTotal.setColumns(10);
		txtQtddTotal.setBounds(225, 211, 48, 28);
		contentPane.add(txtQtddTotal);
		
		JLabel lblEstoqueDeSegurana = new JLabel("Qtdd. mínima:");
		lblEstoqueDeSegurana.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEstoqueDeSegurana.setBounds(283, 210, 92, 22);
		contentPane.add(lblEstoqueDeSegurana);
		
		JLabel lblEstoqueDeSegurana_1 = new JLabel("Estoque de Segurança:");
		lblEstoqueDeSegurana_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEstoqueDeSegurana_1.setBounds(427, 210, 139, 22);
		contentPane.add(lblEstoqueDeSegurana_1);
		
		txtQtddMin = new JTextField();
		txtQtddMin.setColumns(10);
		txtQtddMin.setBounds(376, 211, 41, 28);
		contentPane.add(txtQtddMin);
		
		txtEstoqueSeg = new JTextField();
		txtEstoqueSeg.setColumns(10);
		txtEstoqueSeg.setBounds(568, 211, 48, 28);
		contentPane.add(txtEstoqueSeg);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(149, 299, 111, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(267, 299, 111, 35);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo.png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(387, 299, 111, 35);
		contentPane.add(btnExcluir);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 138, 391);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\PetShop\\D_NQ_NP_821295-MLB32659461315_102019-O.jpg"));
		lblNewLabel.setBounds(0, 0, 138, 391);
		panel.add(lblNewLabel);
		
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
		btnSair.setBounds(507, 299, 111, 35);
		contentPane.add(btnSair);
	}
	
	public void limparCampos() {
	
		txtCodProduto.setText(" ");
		txtNomeProduto.setText(" ");
		txtFabricante.setText(" ");
		txtLote.setText(" ");
		txtCusto.setText(" ");
		txtCategoria.setText(" ");
		txtPublico.setText(" ");
		txtQtddTotal.setText(" ");
		txtQtddMin.setText(" ");
		txtEstoqueSeg.setText(" ");
	}

}
