package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Pets extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodPet;
	private JTextField txtNomePet;
	private JTextField txtCodDono;
	private JTextField txtNomeDono;
	private JTextField txtRaca;
	private JTextField txtDescricao;

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
					Pets frame = new Pets();
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
	public Pets() {
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mvlln\\Downloads\\pata.png"));
		setTitle("Cadastro de Pets");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDePets = new JLabel("Cadastro de Pets");
		lblCadastroDePets.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblCadastroDePets.setBounds(268, 11, 191, 23);
		contentPane.add(lblCadastroDePets);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCdigo.setBounds(150, 64, 59, 22);
		contentPane.add(lblCdigo);
		
		txtCodPet = new JTextField();
		txtCodPet.setColumns(10);
		txtCodPet.setBounds(205, 63, 86, 28);
		contentPane.add(txtCodPet);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNome.setBounds(323, 64, 59, 22);
		contentPane.add(lblNome);
		
		txtNomePet = new JTextField();
		txtNomePet.setColumns(10);
		txtNomePet.setBounds(392, 63, 222, 28);
		contentPane.add(txtNomePet);
		
		JLabel lblCdDono = new JLabel("Código dono:");
		lblCdDono.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCdDono.setBounds(150, 114, 86, 22);
		contentPane.add(lblCdDono);
		
		txtCodDono = new JTextField();
		txtCodDono.setColumns(10);
		txtCodDono.setBounds(247, 110, 86, 28);
		contentPane.add(txtCodDono);
		
		JLabel lblNomeDono = new JLabel("Dono:");
		lblNomeDono.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeDono.setBounds(343, 114, 47, 22);
		contentPane.add(lblNomeDono);
		
		txtNomeDono = new JTextField();
		txtNomeDono.setColumns(10);
		txtNomeDono.setBounds(392, 109, 222, 28);
		contentPane.add(txtNomeDono);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTipo.setBounds(150, 159, 47, 22);
		contentPane.add(lblTipo);
		
		JLabel lblRaa = new JLabel("Raça:");
		lblRaa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblRaa.setBounds(306, 159, 47, 22);
		contentPane.add(lblRaa);
		
		txtRaca = new JTextField();
		txtRaca.setColumns(10);
		txtRaca.setBounds(351, 154, 263, 28);
		contentPane.add(txtRaca);
		
		JLabel lblDescrio = new JLabel("Descrição:");
		lblDescrio.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDescrio.setBounds(150, 259, 75, 22);
		contentPane.add(lblDescrio);
		
		JComboBox cmbTipo = new JComboBox();
		cmbTipo.setBackground(UIManager.getColor("Button.background"));
		cmbTipo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"Ave", "Cachorro", "Gato", "Réptil"}));
		cmbTipo.setBounds(198, 154, 75, 28);
		contentPane.add(cmbTipo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\adicionar-usuario.png"));
		btnCadastrar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCadastrar.setBounds(146, 337, 111, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\cruz.png"));
		btnCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCancelar.setBounds(267, 337, 111, 35);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\lixo (1).png"));
		btnExcluir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnExcluir.setBounds(388, 337, 111, 35);
		contentPane.add(btnExcluir);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSexo.setBounds(150, 205, 47, 22);
		contentPane.add(lblSexo);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Fêmea", "Macho"}));
		cmbSexo.setBounds(198, 200, 75, 28);
		contentPane.add(cmbSexo);
		
		JLabel lblPorte = new JLabel("Porte:");
		lblPorte.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblPorte.setBounds(304, 205, 47, 22);
		contentPane.add(lblPorte);
		
		JComboBox cmbPorte = new JComboBox();
		cmbPorte.setBackground(UIManager.getColor("Button.background"));
		cmbPorte.setModel(new DefaultComboBoxModel(new String[] {"Grande", "Médio", "Pequeno"}));
		cmbPorte.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		cmbPorte.setBounds(351, 199, 86, 28);
		contentPane.add(cmbPorte);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 138, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 138, 380);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mvlln\\Downloads\\PetShop\\D_NQ_NP_821295-MLB32659461315_102019-O.jpg"));
		
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
		btnSair.setBounds(509, 337, 111, 35);
		contentPane.add(btnSair);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(235, 262, 379, 35);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
	}
	public void limparCampos() {
		
		txtCodDono.setText("");
		txtCodPet.setText("");
		txtNomeDono.setText("");
		txtNomePet.setText("");
		txtRaca.setText("");
		txtDescricao.setText("");
		
	}
}
