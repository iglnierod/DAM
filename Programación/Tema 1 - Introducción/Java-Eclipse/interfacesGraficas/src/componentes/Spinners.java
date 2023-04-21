package componentes;

import javax.swing.*;
import java.awt.*;

public class Spinners {
	public static void main(String[] args) {
		new VentanaSpinner();
	}
}

class VentanaSpinner extends JFrame {
	public VentanaSpinner() {
		setTitle("Spinner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 200);

		JSpinner spnValores = new JSpinner();

		JPanel pnlSpinners = new JPanel();
		pnlSpinners.setLayout(new BoxLayout(pnlSpinners, BoxLayout.Y_AXIS));
		pnlSpinners.add(spnValores);

		JPanel pnlCentral = new JPanel();
		pnlCentral.add(pnlSpinners);

		spnValores.setPreferredSize(new Dimension(100, 30));

		add(pnlCentral, BorderLayout.CENTER);

		setVisible(true);
	}
}
