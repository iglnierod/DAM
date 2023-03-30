package eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebasEventosTeclado {

	public static void main(String[] args) {
		new VentanaTeclas();
	}
}

class VentanaTeclas extends JFrame {
	public VentanaTeclas() {
		setTitle("Eventos de Teclado");
		setBounds(10,10,400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new TeclasPulsados());
		
		setVisible(true);
	}
}	

class TeclasPulsados implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		char caracter = e.getKeyChar();
		System.out.println("Caracter introducido: " + caracter);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigoTecla = e.getKeyCode();
		System.out.println("Código de tecla: " + codigoTecla);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int codigoTecla = e.getKeyCode();
		System.out.println("Código de tecla: " + codigoTecla);

	}
	
}