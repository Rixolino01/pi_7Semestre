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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodCliente;
	private JTextField txtNomeCliente;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCpf;
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
					Clientes frame = new Clientes();
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
	public Clientes() {
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\usuarios-alt.png"));
		setTitle("Cadastro de Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblNewLabel.setBounds(278, 22, 203, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigo.setBounds(146, 71, 48, 22);
		contentPane.add(lblCdigo);
		
		txtCodCliente = new JTextField();
		txtCodCliente.setBounds(194, 72, 55, 28);
		contentPane.add(txtCodCliente);
		txtCodCliente.setColumns(10);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(340, 72, 274, 28);
		contentPane.add(txtNomeCliente);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblTelefone.setBounds(146, 116, 59, 22);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(209, 117, 101, 28);
		contentPane.add(txtTelefone);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEmail.setBounds(328, 115, 48, 22);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(377, 116, 237, 28);
		contentPane.add(txtEmail);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCpf.setBounds(145, 162, 39, 22);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(184, 163, 101, 28);
		contentPane.add(txtCpf);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblLogradouro.setBounds(296, 163, 74, 22);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(377, 164, 237, 28);
		contentPane.add(txtLogradouro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCidade.setBounds(145, 202, 59, 22);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(200, 203, 159, 28);
		contentPane.add(txtCidade);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNmero.setBounds(396, 203, 59, 22);
		contentPane.add(lblNmero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(461, 204, 48, 28);
		contentPane.add(txtNumero);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUf.setBounds(519, 204, 30, 22);
		contentPane.add(lblUf);
		
		JComboBox cmbUf = new JComboBox();
		cmbUf.setModel(new DefaultComboBoxModel(new String[] {" AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cmbUf.setBounds(559, 205, 55, 28);
		contentPane.add(cmbUf);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblComplemento.setBounds(143, 248, 96, 22);
		contentPane.add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(237, 249, 377, 28);
		contentPane.add(txtComplemento);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(142, 317, 111, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparCampos();
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(266, 317, 111, 35);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo (1).png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(388, 317, 111, 35);
		contentPane.add(btnExcluir);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNome.setBounds(291, 71, 48, 22);
		contentPane.add(lblNome);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(-1, 0, 138, 391);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\PetShop\\D_NQ_NP_821295-MLB32659461315_102019-O.jpg"));
		lblNewLabel_2.setBounds(2, 0, 136, 391);
		panel.add(lblNewLabel_2);
		
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
		btnSair.setBounds(511, 317, 111, 35);
		contentPane.add(btnSair);
	}
	
	public void limparCampos() {
		
		
		txtCodCliente.setText(" ");
		txtNomeCliente.setText(" ");
		txtTelefone.setText(" ");
		txtEmail.setText(" ");
		txtCpf.setText(" ");
		txtLogradouro.setText(" ");
		txtCidade.setText(" ");
		txtNumero.setText(" ");
		txtComplemento.setText(" ");
		
		
	}
}
