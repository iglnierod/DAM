package ejercicios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class Formulario {

	public static void main(String[] args) {
		new VentanaFormulario();
	}
}

class VentanaFormulario extends JFrame {
	public VentanaFormulario() {
		setTitle("Formulario");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1420, 250, 300, 150);

		add(new PanelFormulario(), BorderLayout.NORTH);
		add(new PanelRegistro(), BorderLayout.SOUTH);
		setVisible(true);
	}
}

class PanelFormulario extends JPanel {
	JLabel lblUsuario = new JLabel("Usuario");
	JLabel lblPassword = new JLabel("Contraseña");
	static JTextField txtUsuario = new JTextField(10);
	static JPasswordField txtPassword = new JPasswordField(10);

	public PanelFormulario() {
		lblUsuario.setFont(new Font("Calibri", 0, 20));
		lblPassword.setFont(new Font("Calibri", 0, 20));
		txtUsuario.setFont(new Font("Calibri", 0, 16));
		txtPassword.setFont(new Font("Calibri", 0, 16));

		txtPassword.setToolTipText("La contraseña debe tener entre " + PanelRegistro.MIN_VALUE_PSW + " y " + PanelRegistro.MAX_VALUE_PSW);
		lblPassword.setToolTipText("La contraseña debe tener entre " + PanelRegistro.MIN_VALUE_PSW + " y " + PanelRegistro.MAX_VALUE_PSW);
		
		setLayout(new GridLayout(2, 2));
		add(lblUsuario);
		add(txtUsuario);
		add(lblPassword);
		add(txtPassword);

	}
}

class PanelRegistro extends JPanel {
	JButton btnRegistro = new JButton("Registrar");
	Document documento = PanelFormulario.txtPassword.getDocument();
	static final int MIN_VALUE_PSW = 8;
	static final int MAX_VALUE_PSW = 12;

	public PanelRegistro() {
		documento.addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				char[] longitud = PanelFormulario.txtPassword.getPassword();
				if (longitud.length < 8 || longitud.length > 12)
					PanelFormulario.txtPassword.setBackground(Color.RED);
				else
					PanelFormulario.txtPassword.setBackground(Color.WHITE);
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				char[] longitud = PanelFormulario.txtPassword.getPassword();
				if (longitud.length < 8 || longitud.length > 12)
					PanelFormulario.txtPassword.setBackground(Color.RED);
				else
					PanelFormulario.txtPassword.setBackground(Color.WHITE);
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			}
		});

		btnRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (PanelFormulario.txtUsuario.getText().length() <= 0) {
					JOptionPane.showMessageDialog(PanelRegistro.this, "No se puede dejar el usuario vacío");
					PanelFormulario.txtUsuario.requestFocusInWindow();
				} else {
					PanelFormulario.txtUsuario.requestFocusInWindow();					
					PanelFormulario.txtPassword.setText("");
					PanelFormulario.txtUsuario.setText("");
					PanelFormulario.txtPassword.setBackground(Color.WHITE);
				}

			}
		});

		add(btnRegistro);
	}
}
