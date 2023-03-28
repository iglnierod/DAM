package ventanas;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

public class PruebasFrames {

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		mostrarTiposLetra();
	}
	
	// Recorrer fuentes del sistema
	public static void mostrarTiposLetra() {
		for (String fuente : GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()) {
			System.out.println(fuente);
		}
	}
}

class Ventana extends JFrame {
	public Ventana() {
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		add(new PanelPrincipal());
		add(new BanderaJapon());
		setTitle("Primera ventana");
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image icono = pantalla.getImage("rengar.jpg");
		setIconImage(icono);
		this.centrarVentana();
		setVisible(true);
	}

	public void centrarVentana() {
		this.setLocationRelativeTo(null);
	}
	
	
}

class PanelPrincipal extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawString("Texto en panel", 10, 20); // TEXTO
		g.setColor(Color.BLUE);
		g.drawRect(0, 5, 100, 20);
		g.setColor(Color.red);
		g.fillOval(25, 25, 30, 30);

		Graphics2D g2d = (Graphics2D) g;
		RoundRectangle2D rectanguloRedondeado = new RoundRectangle2D.Double(10, 70, 15, 60, 9, 3);
		g2d.setColor(Color.GREEN);
		g2d.draw(rectanguloRedondeado);
		Ellipse2D elipse = new Ellipse2D.Double(50, 80, 50, 25);
		Rectangle2D rectangulo = new Rectangle2D.Double(115, 60, 100, 70);
		elipse.setFrame(rectangulo);
		g.setColor(Color.BLACK);
		g2d.draw(elipse);
		g.setColor(Color.CYAN);
		g2d.draw(rectangulo);
	}

}

class BanderaJapon extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawRect(9, 9, 351, 201);
		g.setColor(Color.WHITE);
		g.fillRect(10, 10, 350, 200);
		g.setColor(Color.RED);
		g.fillOval((10 + 350 - 100) / 2, (10 + 200 - 100) / 2, 100, 100);
		
		Graphics2D g2d = (Graphics2D)g;
		Font fuente = new Font("Arial", Font.ITALIC, 19);
		g2d.setFont(fuente);
		g2d.drawString("Bandera de Japón", 10, 230);
		g2d.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		g2d.setColor(Color.BLACK);
		g2d.drawString("Bandera de Japón 2", 10, 245);
	}

}