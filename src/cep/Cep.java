package cep;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Cep extends JFrame {

	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
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
	public Cep() {
		setTitle("Buscar CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 25, 58, 24);
		contentPane.add(lblNewLabel);

		txtCep = new JTextField();
		txtCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCep.setBounds(98, 29, 116, 19);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(24, 72, 80, 18);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(24, 132, 80, 13);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(24, 193, 48, 13);
		contentPane.add(lblNewLabel_3);

		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEndereco.setBounds(98, 74, 270, 19);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBairro.setBounds(98, 129, 270, 19);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCidade.setBounds(98, 190, 187, 19);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(295, 193, 24, 13);
		contentPane.add(lblNewLabel_4);

		JComboBox cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
						"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		cboUf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cboUf.setBounds(329, 191, 80, 21);
		contentPane.add(cboUf);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.setBounds(36, 232, 85, 21);
		contentPane.add(btnLimpar);

		JButton btnCep = new JButton("Buscar");
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o CEP");
					txtCep.requestFocus();
				} else {
					// buscar CEP
					
				}
			}
		});
		btnCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCep.setBounds(239, 28, 85, 21);
		contentPane.add(btnCep);

		JButton btnSobre = new JButton("");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setToolTipText("Sobre");
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setBackground(SystemColor.control);
		btnSobre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSobre.setBounds(341, 10, 48, 48);
		contentPane.add(btnSobre);

		/* Uso da biblioteca Atxy2k para a validação do campo txt Cep */
		RestrictedTextField validar = new RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);
	}// end constructor
}
