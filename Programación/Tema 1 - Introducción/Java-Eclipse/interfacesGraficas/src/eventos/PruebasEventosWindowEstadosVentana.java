package eventos;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.swing.*;

public class PruebasEventosWindowEstadosVentana {

	public static void main(String[] args) {
		new VentanaEstados();
	}

}

class VentanaEstados extends JFrame {
	public VentanaEstados() {
		setTitle("Probando Estados Ventana");
		setBounds(10,10,400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowStateListener(new CambioDeEstado());
		setVisible(true);
	}
}

class CambioDeEstado implements WindowStateListener {
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		Map<Integer,String> estados = new HashMap<>();
		estados.put(JFrame.NORMAL, "NORMAL");
		estados.put(JFrame.ICONIFIED, "MINIMIZADA");
		estados.put(JFrame.MAXIMIZED_HORIZ, "MAXIMIZADA HORIZONTALMENTE");
		estados.put(JFrame.MAXIMIZED_VERT, "MAXIMIZADA VERTICALMENTE");
		estados.put(JFrame.MAXIMIZED_BOTH, "MAXIMIZADAS AMBAS");
		estados.put(7, "MINIMIZADA");
		
		
		System.out.println("Ha cambiado el estado de " + estados.get(e.getOldState()) + " a " + estados.get(e.getNewState()));
	}
}