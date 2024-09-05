package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodFunc;
	private JTextField txtNomeFunc;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtCidade;
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
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\brilhos (3).png"));
		setTitle("Cadastro de Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroFuncionario = new JLabel("Cadastro de Funcionários");
		lblCadastroFuncionario.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblCadastroFuncionario.setBounds(219, 28, 261, 23);
		contentPane.add(lblCadastroFuncionario);
		
		txtCodFunc = new JTextField();
		txtCodFunc.setColumns(10);
		txtCodFunc.setBounds(193, 78, 55, 28);
		contentPane.add(txtCodFunc);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCdigo.setBounds(145, 77, 48, 22);
		contentPane.add(lblCdigo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNome.setBounds(290, 77, 48, 22);
		contentPane.add(lblNome);
		
		txtNomeFunc = new JTextField();
		txtNomeFunc.setColumns(10);
		txtNomeFunc.setBounds(339, 78, 274, 28);
		contentPane.add(txtNomeFunc);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(376, 122, 237, 28);
		contentPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEmail.setBounds(327, 121, 48, 22);
		contentPane.add(lblEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(208, 123, 101, 28);
		contentPane.add(txtTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblTelefone.setBounds(145, 122, 59, 22);
		contentPane.add(lblTelefone);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCpf.setBounds(144, 168, 39, 22);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(183, 169, 101, 28);
		contentPane.add(txtCpf);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblLogradouro.setBounds(295, 169, 74, 22);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(376, 170, 237, 28);
		contentPane.add(txtLogradouro);
		
		JComboBox cmbUf = new JComboBox();
		cmbUf.setModel(new DefaultComboBoxModel(new String[] {" AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cmbUf.setBounds(558, 211, 55, 28);
		contentPane.add(cmbUf);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUf.setBounds(518, 210, 30, 22);
		contentPane.add(lblUf);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(460, 210, 48, 28);
		contentPane.add(txtNumero);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNmero.setBounds(395, 209, 59, 22);
		contentPane.add(lblNmero);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(199, 209, 159, 28);
		contentPane.add(txtCidade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCidade.setBounds(144, 208, 59, 22);
		contentPane.add(lblCidade);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblComplemento.setBounds(142, 254, 96, 22);
		contentPane.add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(236, 255, 377, 28);
		contentPane.add(txtComplemento);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(143, 323, 111, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparCampos();
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(263, 323, 111, 35);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo (1).png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(384, 323, 111, 35);
		contentPane.add(btnExcluir);
		
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
		btnSair.setBounds(505, 323, 111, 35);
		contentPane.add(btnSair);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 138, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 138, 391);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\PetShop\\D_NQ_NP_821295-MLB32659461315_102019-O.jpg"));
		lblNewLabel.setBounds(0, 0, 138, 391);
		panel.add(lblNewLabel);
	}
	
	public void limparCampos() {
		
		txtCodFunc.setText(" ");
		txtNomeFunc.setText(" ");
		txtEmail.setText(" ");
		txtTelefone.setText(" ");
		txtCpf.setText(" ");
		txtLogradouro.setText(" ");
		txtNumero.setText(" ");
		txtCidade.setText(" ");
		txtComplemento.setText(" ");
	}

}
