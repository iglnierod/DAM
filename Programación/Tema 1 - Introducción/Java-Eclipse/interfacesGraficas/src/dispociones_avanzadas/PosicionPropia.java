package dispociones_avanzadas;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class PosicionPropia {
	public static void main(String[] args) {
		new VentanaPosicionPropia();
	}
}

class VentanaPosicionPropia extends JFrame {
	public VentanaPosicionPropia() {
		setTitle("Disposición propia");
		setBounds(1000, 100, 600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btnRojo = new JButton("Rojo");
		JButton btnVerde = new JButton("Verde");
		JButton btnAzul = new JButton("Azul");

		getContentPane().setLayout(new DiagonalLayout());

		getContentPane().add(btnRojo);
		getContentPane().add(btnVerde);
		getContentPane().add(btnAzul);

		setVisible(true);
	}
}

class DiagonalLayout implements LayoutManager {

	@Override
	public void addLayoutComponent(String name, Component comp) {

	}

	@Override
	public void removeLayoutComponent(Component comp) {

	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		final int SIZE = 80;
		int numComponentes = parent.getComponentCount();
		int espaciadoX = 10;
		int espaciadoY = 20;

		int x = (parent.getWidth() - numComponentes * SIZE) / 2;
		int y = (parent.getHeight() - numComponentes * SIZE) / 2;

		for (int i = 0; i < numComponentes; i++) {
			Component c = parent.getComponent(i);
			c.setBounds(x, y, SIZE, SIZE);

			x += SIZE + espaciadoX;
			y += SIZE + espaciadoY;
		}
	}
}
