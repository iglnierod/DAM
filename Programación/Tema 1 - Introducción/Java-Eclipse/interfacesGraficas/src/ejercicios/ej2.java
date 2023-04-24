package ejercicios;

import java.awt.*;
import javax.swing.*;

public class ej2 {
	public static void main(String[] args) {
		new VentanaEj2();
	}
}

class VentanaEj2 extends JFrame {

	private JPanel pnlIntroducir = new JPanel();
	private JLabel lblTexto;
	private JTextField txfMarca = new JTextField(10);
	private JButton btnAnadir = new JButton("Añadir");

	private JPanel pnlMarcas = new JPanel(new BorderLayout());
	private JComboBox<String> cmbMarcas = new JComboBox<String>();

	public VentanaEj2() {
		setTitle("Ejercicio 1");
		setBounds(0, 0, 500, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		
		cmbMarcas.setPreferredSize(new Dimension(100,25));;
		
		addToPnl(pnlIntroducir, lblTexto = new JLabel("Introduzca una marca de coches"));
		addToPnl(pnlIntroducir, txfMarca);
		addToPnl(pnlIntroducir, btnAnadir);

		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblTexto = new JLabel("MARCAS:"));
		pnlNorth.add(cmbMarcas);
		
		pnlMarcas.add(pnlNorth, BorderLayout.NORTH);
		
		
		getContentPane().add(pnlIntroducir);
		getContentPane().add(pnlMarcas);

		
		setVisible(true);
	}

	private void addToPnl(JPanel pnl, JComponent o) {
		pnl.add(o);
	}

	private void anadirMarca(String s) {
		if (!s.equals(" "))
			cmbMarcas.addItem(s.trim());
	}
}