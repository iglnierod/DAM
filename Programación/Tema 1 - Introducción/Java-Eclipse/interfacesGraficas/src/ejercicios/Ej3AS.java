package ejercicios;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ej3AS {
	public static void main(String[] args) {
		new VentanaRGBA();
	}
}

class VentanaRGBA extends JFrame {

	private JPanel controles = new JPanel();

	private JSpinner spRojo = new JSpinner(new SpinnerNumberModel(0, 0, 255, 5));
	private JSpinner spVerde = new JSpinner(new SpinnerNumberModel(0, 0, 255, 5));
	private JSpinner spAzul = new JSpinner(new SpinnerNumberModel(0, 0, 255, 5));
	private JSpinner spAlpha = new JSpinner(new SpinnerNumberModel(255, 0, 255, 5));
	private JSpinner spPaso = new JSpinner(new SpinnerNumberModel(5, 1, 25, 1));
	private JPanel display = new JPanel();

	public VentanaRGBA() {

		setTitle("RGBA");
		setBounds(0, 0, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		RGBAListener listener = new RGBAListener();
		createSpinner(spRojo, new JLabel("Rojo:"), listener);
		createSpinner(spVerde, new JLabel("Verde:"), listener);
		createSpinner(spAzul, new JLabel("Azul:"), listener);
		createSpinner(spAlpha, new JLabel("Alpha:"), listener);
		createSpinner(spPaso, new JLabel("Paso:"), new PasoListener());
		getContentPane().add(controles, BorderLayout.NORTH);
		getContentPane().add(display, BorderLayout.CENTER);

		setVisible(true);

	}

	private void createSpinner(JSpinner cmb, JLabel lbl, ChangeListener listener) {
		cmb.setPreferredSize(new Dimension(60, 30));
		cmb.addChangeListener(listener);
		controles.add(lbl);
		controles.add(cmb);
	}

	class RGBAListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			int rojo = (int) spRojo.getValue();
			int verde = (int) spVerde.getValue();
			int azul = (int) spAzul.getValue();
			int alpha = (int) spAlpha.getValue();

			display.setBackground(new Color(rojo, verde, azul, alpha));
			VentanaRGBA.this.repaint();
		}
	}

	class PasoListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {

			cambiarPaso((int) spPaso.getValue());

		}

		private void cambiarPaso(int paso) {
			final int MIN = 0;
			final int MAX = 255;

			spRojo.setModel(new SpinnerNumberModel((int) spRojo.getValue(), MIN, MAX, paso));
			spVerde.setModel(new SpinnerNumberModel((int) spVerde.getValue(), MIN, MAX, paso));
			spAzul.setModel(new SpinnerNumberModel((int) spAzul.getValue(), MIN, MAX, paso));
			spAlpha.setModel(new SpinnerNumberModel((int) spAlpha.getValue(), MIN, MAX, paso));

		}

	}

}

