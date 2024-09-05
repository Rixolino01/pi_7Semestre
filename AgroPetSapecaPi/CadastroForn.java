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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroForn extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodForn;
	private JTextField txtNomeForn;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCnpj;
	private JTextField txtLogradouro;
	private JTextField txtCidade;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	
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
					CadastroForn frame = new CadastroForn();
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
	public CadastroForn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\PetShop\\72109.png"));
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setTitle("Cadastro de Fornecedores");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(248, 248, 255));
		contentPane_1.setBounds(0, 0, 626, 383);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Fornecedor");
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblNewLabel.setBounds(256, 11, 256, 23);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigo.setBounds(146, 61, 59, 22);
		contentPane_1.add(lblCdigo);
		
		txtCodForn = new JTextField();
		txtCodForn.setColumns(10);
		txtCodForn.setBounds(201, 62, 59, 28);
		contentPane_1.add(txtCodForn);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNome.setBounds(282, 61, 45, 22);
		contentPane_1.add(lblNome);
		
		txtNomeForn = new JTextField();
		txtNomeForn.setColumns(10);
		txtNomeForn.setBounds(337, 61, 277, 28);
		contentPane_1.add(txtNomeForn);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblTelefone.setBounds(146, 107, 59, 22);
		contentPane_1.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(208, 108, 86, 28);
		contentPane_1.add(txtTelefone);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEmail.setBounds(304, 107, 45, 22);
		contentPane_1.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(347, 109, 267, 28);
		contentPane_1.add(txtEmail);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCnpj.setBounds(146, 149, 40, 22);
		contentPane_1.add(lblCnpj);
		
		txtCnpj = new JTextField();
		txtCnpj.setColumns(10);
		txtCnpj.setBounds(187, 150, 107, 28);
		contentPane_1.add(txtCnpj);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblLogradouro.setBounds(314, 149, 74, 22);
		contentPane_1.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(398, 150, 216, 28);
		contentPane_1.add(txtLogradouro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCidade.setBounds(145, 192, 59, 22);
		contentPane_1.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(200, 193, 188, 28);
		contentPane_1.add(txtCidade);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNmero.setBounds(408, 192, 59, 22);
		contentPane_1.add(lblNmero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(473, 193, 45, 28);
		contentPane_1.add(txtNumero);
		
		JLabel lblCdigo_1 = new JLabel("UF:");
		lblCdigo_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigo_1.setBounds(532, 192, 27, 22);
		contentPane_1.add(lblCdigo_1);
		
		JComboBox cmbUf = new JComboBox();
		cmbUf.setModel(new DefaultComboBoxModel(new String[] {" AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cmbUf.setBounds(555, 194, 59, 28);
		contentPane_1.add(cmbUf);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblComplemento.setBounds(146, 237, 96, 22);
		contentPane_1.add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(252, 238, 362, 28);
		contentPane_1.add(txtComplemento);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(146, 304, 111, 35);
		contentPane_1.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparCampos();
				
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(267, 304, 111, 35);
		contentPane_1.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo (1).png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(388, 304, 111, 35);
		contentPane_1.add(btnExcluir);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 138, 391);
		contentPane_1.add(panel);
		
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
		btnSair.setBounds(507, 304, 111, 35);
		contentPane_1.add(btnSair);
	}
	
public void limparCampos() {
		
		txtNomeForn.setText("");
		txtCodForn.setText("");
		txtCnpj.setText("");
		txtCidade.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
		txtNumero.setText(" ");
		txtComplemento.setText(" ");
		txtLogradouro.setText(" ");
		
	}
}
