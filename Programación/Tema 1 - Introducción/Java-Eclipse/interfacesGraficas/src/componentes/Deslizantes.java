package componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Deslizantes {
	public static void main(String[] args) {
		new VentanaDeslizantes();
	}
}

class VentanaDeslizantes extends JFrame {
	public VentanaDeslizantes() {
		setTitle("Sliders");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 200);

		JSlider sldBarra = new JSlider();
		sldBarra.setBorder(new EmptyBorder(10, 10, 10, 10));
		sldBarra.setMajorTickSpacing(15);
		sldBarra.setMinorTickSpacing(5);
		sldBarra.setPaintLabels(true);
		sldBarra.setPaintTicks(true);
		sldBarra.setMinimum(10);
		sldBarra.setMaximum(100);
		sldBarra.setFont(new Font("Verdana", Font.PLAIN, 10));
		sldBarra.setSnapToTicks(true);

		add(sldBarra, BorderLayout.NORTH);

		JLabel lblTexto = new JLabel("Texto de ejemplo");
		sldBarra.setValue(lblTexto.getFont().getSize());
		add(lblTexto, BorderLayout.SOUTH);

		sldBarra.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				Font fuenteActual = lblTexto.getFont();
				lblTexto.setFont(new Font(fuenteActual.getFamily(), fuenteActual.getStyle(), sldBarra.getValue()));
			}
		});

		setVisible(true);
	}

}
