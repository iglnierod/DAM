package eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebasEventosRaton {
	public static void main(String[] args) {
		new VentanaRaton();
	}
}

class VentanaRaton extends JFrame {
	public VentanaRaton() {
		setTitle("Eventos Ratón");
		setBounds(10,10,400,300);
		setLocationRelativeTo(null);
		addMouseListener(new EventosRaton());
		addMouseMotionListener(new EventosRaton());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}

class EventosRaton implements MouseListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click de ratón en (" + e.getX() + ", " + e.getY() + ") Absolutas: (" + 
				e.getXOnScreen() + ", " + e.getYOnScreen() + ")");
		System.out.println("Nº clicks: " + e.getClickCount());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.print("Presionando botón ratón: ");
		
		switch(e.getModifiersEx()){
		case MouseEvent.BUTTON1_DOWN_MASK:
			System.out.println("izquierdo");
			break;
		case MouseEvent.BUTTON2_DOWN_MASK:
			System.out.println("central");
			break;
		case MouseEvent.BUTTON3_DOWN_MASK:
			System.out.println("derecho");
			break;
		default:
			System.out.println("otro");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	/*	MouseMotionListener	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Arrastrando el ratón.");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		System.out.println("Moviendo el ratón");
	}
	
}

