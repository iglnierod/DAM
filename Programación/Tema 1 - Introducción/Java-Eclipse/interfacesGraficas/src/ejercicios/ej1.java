package ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;

import javax.swing.*;

public class ej1 {
	public static void main(String[] args) {
		new VentanaEj1();
	}
}

class VentanaEj1 extends JFrame {

	private JLabel lblSaludo;
	private JTextField txfNombre;
	private JButton btnSaludar;

	public VentanaEj1() {
		setTitle("Ejercicio 1");
		setBounds(0, 0, 300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnlMain = new JPanel();
		lblSaludo = new JLabel("Escribe un nobre para saludar");
		txfNombre = new JTextField(10);
		btnSaludar = new JButton("Saludar");
		
		btnSaludar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaEj1.this, "¡Hola " + txfNombre.getText().trim() + "!");
			}
		});
		
		pnlMain.add(lblSaludo);
		pnlMain.add(txfNombre);
		pnlMain.add(btnSaludar);
		
		getContentPane().add(pnlMain);
		
		setVisible(true);
	}
}