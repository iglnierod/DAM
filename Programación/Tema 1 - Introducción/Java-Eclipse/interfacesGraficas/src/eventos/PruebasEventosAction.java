package eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebasEventosAction {

	public static void main(String[] args) {
		new VentanaBoton();
	}
}

class VentanaBoton extends JFrame {
	public VentanaBoton() {
		setTitle("Probando eventos Action");
		setBounds(10, 10, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PanelBoton());
		
		setVisible(true);
	}
}

class PanelBoton extends JPanel implements ActionListener{
	JButton botonRojo = new JButton("rojo");
	private boolean activado = false;
	
	public PanelBoton() {
		botonRojo.addActionListener(this);
		add(botonRojo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!activado) {
			setBackground(Color.white);
			activado = true;
		} else {			
			setBackground(Color.red);
			activado = false;
		}
	}
}