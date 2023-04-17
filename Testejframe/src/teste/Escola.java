package teste;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Escola extends JFrame implements ActionListener {

	public void rotuloSenha() {
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(100, 300, 100, 60);
		labelSenha.setVisible(true);

		setLayout(new FlowLayout());
		add(labelSenha);
	}

	public void rotuloLogin() {
		JLabel labelLogin = new JLabel("Login ");
		labelLogin.setBounds(100, 300, 100, 60);
		labelLogin.setVisible(true);

		setLayout(new FlowLayout());
		add(labelLogin);
	}

	public void bt1() {

		JButton Login = new JButton("Login");

		Login.setBounds(100, 300, 100, 60);
		Login.setVisible(true);

		setLayout(new FlowLayout());
		add(Login);
	}

	public void bt2() {

		JButton Exit = new JButton("Exit");

		Exit.setBounds(100, 300, 100, 60);
		Exit.setVisible(true);

		setLayout(new FlowLayout());
		add(Exit);
	}

	public void Login() {
		this.setTitle("Nome");
		this.setSize(200, 180);

		JTextField txtNome = new JTextField(10);

		txtNome.setBounds(100, 300, 100, 60);
		txtNome.setVisible(true);

		setLayout(new BorderLayout());

		add(BorderLayout.NORTH, txtNome);

	}

	public void Senha() {
		this.setTitle("Senha");
		this.setSize(200, 180);

		JTextField txtSenha = new JTextField(10);

		txtSenha.setBounds(100, 300, 100, 60);
		txtSenha.setVisible(true);

		setLayout(new BorderLayout());

		add(BorderLayout.NORTH, txtSenha);

	}

	public Escola() {

		rotuloLogin();
		Senha();
		rotuloSenha();
		Login();
		bt1();
		bt2();

		setTitle("Escola");
		setSize(190, 130);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Escola();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
