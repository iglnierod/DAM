package ventanasEmergentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogoSeleccionColor {
	public static void main(String[] args) {
		new VentanaSeleccionColor();
	}
}

class VentanaSeleccionColor extends JFrame {
	public VentanaSeleccionColor() {
		setTitle("Selección color");
		setBounds(0, 0, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel pnlColor = new JPanel();
		pnlColor.setBackground(Color.RED);

		pnlColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == 3) {
					Color color = JColorChooser.showDialog(pnlColor, "Cambiar color fondo", pnlColor.getBackground());
					if (color != null)
						pnlColor.setBackground(color);
				}
			}
		});

		getContentPane().add(pnlColor);
		setVisible(true);
	}
}