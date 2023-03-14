package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBounds(30, 32, 341, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author Ronaldo Amorim");
		lblNewLabel_1.setBounds(30, 70, 261, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setBounds(30, 122, 82, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("republicavirtual.com.br");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setBounds(121, 122, 206, 13);
		getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("LinkedIn");
		btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setBounds(43, 193, 69, 48);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("GitHub");
		btnNewButton_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setBounds(219, 193, 58, 48);
		getContentPane().add(btnNewButton_1);

	}

}
