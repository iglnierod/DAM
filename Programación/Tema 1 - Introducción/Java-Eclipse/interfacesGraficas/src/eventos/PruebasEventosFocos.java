package eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PruebasEventosFocos {

	public static void main(String[] args) {
		new VentanaFoco();
	}
}

class VentanaFoco extends JFrame {
	public VentanaFoco() {
		setTitle("Eventos Foco Ventana");
		setBounds(10, 10, 400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PanelFoco());
		
		setVisible(true);
	}
}

class PanelFoco extends JPanel {
	JTextField campoTexto1;
	JTextField campoTexto2;
	JTextField campoTexto3;
	
	public PanelFoco() {
		campoTexto1 = new JTextField("primer campo de texto");
		campoTexto2 = new JTextField("segundo campo de texto");
		campoTexto3 = new JTextField("tercer campo de texto");
		
		add(campoTexto1);
		add(campoTexto2);
		add(campoTexto3);
		
		campoTexto1.addFocusListener(new OyenteFoco1());
		campoTexto2.addFocusListener(new OyenteFoco2());
	}
	
	class OyenteFoco2 extends FocusAdapter {
		
		@Override
		public void focusLost(FocusEvent e) {
			campoTexto2.setText(campoTexto2.getText().toUpperCase());
		}
	}
}

class OyenteFoco1 implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Foco adquirido");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("Foco perdido");
	}
	
}



























