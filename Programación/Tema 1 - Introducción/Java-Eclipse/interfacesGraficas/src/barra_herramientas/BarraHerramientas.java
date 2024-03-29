package barra_herramientas;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class BarraHerramientas {
	public static void main(String[] args) {
		new VentanaBarraHerramientas();
	}
}

class VentanaBarraHerramientas extends JFrame {
	public VentanaBarraHerramientas() {
		setTitle("Barra de herramientas");
		setBounds(1400, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		AccionColor accionRojo = new AccionColor("rojo", Color.RED, new ImageIcon("recursos/rojo.png"));
		AccionColor accionVerde = new AccionColor("verde", Color.GREEN, new ImageIcon("recursos/verde.png"));
		AccionColor accionAzul = new AccionColor("azul", Color.BLUE, new ImageIcon("recursos/azul.png"));
		JToolBar tlb = new JToolBar("Colores");
		tlb.add(accionRojo);
		tlb.add(accionVerde);
		tlb.add(accionAzul);

		AbstractAction accionCerrar = new AbstractAction("cerrar",new ImageIcon("recursos/cancel.png")) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		tlb.addSeparator();
		tlb.add(accionCerrar);
		getContentPane().add(tlb, BorderLayout.NORTH);

		setVisible(true);
	}

	private class AccionColor extends AbstractAction {

		public AccionColor(String texto, Color color, Icon icono) {
			putValue(Action.NAME, texto);
			putValue("color", color);
			putValue(Action.LARGE_ICON_KEY, icono);
			putValue(Action.SHORT_DESCRIPTION, "Cambia el color del fondo a " + texto);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color");
			getContentPane().setBackground(c);
		}

	}
}
