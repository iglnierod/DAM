package ventanas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class PruebasImagenes {

	public static void main(String[] args) {
		VentanaImagen vi = new VentanaImagen();
		vi.setVisible(true);
		vi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaImagen extends JFrame {
	public VentanaImagen() {
		setTitle("Imágenes");
		setBounds(50, 50, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PanelImagen());
		this.setVisible(true);
	}
}

class PanelImagen extends JPanel {
	private Image imagen;

	public PanelImagen() {
		try {
			imagen = ImageIO.read(new File("recursos/paisaje.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.drawImage(imagen, 10, 10, null);

		Image iRedimensionada = imagen.getScaledInstance(800, 500, Image.SCALE_DEFAULT);
		g.drawImage(iRedimensionada, 0, 0, null);
		g.setFont(new Font("Courier New", Font.BOLD, 30));
		g.drawString("Paisaje", 300, 500);
		setForeground(Color.YELLOW);
	}
}