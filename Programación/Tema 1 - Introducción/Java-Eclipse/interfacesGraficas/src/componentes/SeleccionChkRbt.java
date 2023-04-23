package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SeleccionChkRbt {
	public static void main(String[] args) {
		new VentanaSeleccion();
	}
}

class VentanaSeleccion extends JFrame {

	private JTextArea txaTexto;
	private Font fuente;
	private JCheckBox chkNegrita;
	private JCheckBox chkCursiva;

	public VentanaSeleccion() {
		setTitle("Selección");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 400);

		txaTexto = new JTextArea(12, 100);
		txaTexto.setLineWrap(true);
		txaTexto.setWrapStyleWord(true);

		fuente = txaTexto.getFont();

		JScrollPane scp = new JScrollPane(txaTexto);
		add(scp, BorderLayout.CENTER);

		chkNegrita = new JCheckBox("Negrita");
		chkCursiva = new JCheckBox("Cursiva");

		JPanel pnlChecks = new JPanel();
		pnlChecks.add(chkNegrita);
		pnlChecks.add(chkCursiva);

		add(pnlChecks, BorderLayout.SOUTH);

		chkNegrita.addActionListener(new CambiarEstiloLetra());
		chkCursiva.addActionListener(new CambiarEstiloLetra());

		JPanel pnlOpciones = new JPanel(new GridLayout(2, 1));
		pnlOpciones.setBorder(new EmptyBorder(5, 10, 0, 10));

		// RADIO BUTTONS
		JPanel pnlColorFondo = new JPanel();
		pnlColorFondo.setLayout(new BoxLayout(pnlColorFondo, BoxLayout.Y_AXIS));
		JRadioButton rbtFondoNegro = new JRadioButton("Negro");
		JRadioButton rbtFondoBlanco = new JRadioButton("Blanco", true);
		JRadioButton rbtFondoRojo = new JRadioButton("Rojo");
		JRadioButton rbtFondoAzul = new JRadioButton("Azul");

		ButtonGroup bgColorFondo = new ButtonGroup();
		bgColorFondo.add(rbtFondoNegro);
		bgColorFondo.add(rbtFondoBlanco);
		bgColorFondo.add(rbtFondoRojo);
		bgColorFondo.add(rbtFondoAzul);

		pnlColorFondo.add(new JLabel("Color fondo:"));
		pnlColorFondo.add(rbtFondoNegro);
		pnlColorFondo.add(rbtFondoBlanco);
		pnlColorFondo.add(rbtFondoRojo);
		pnlColorFondo.add(rbtFondoAzul);

		pnlOpciones.add(pnlColorFondo);

		CambiarColorFondo ccf = new CambiarColorFondo();

		rbtFondoNegro.addActionListener(ccf);
		rbtFondoBlanco.addActionListener(ccf);
		rbtFondoRojo.addActionListener(ccf);
		rbtFondoAzul.addActionListener(ccf);

		JPanel pnlColorLetra = new JPanel();
		pnlColorLetra.setLayout(new BoxLayout(pnlColorLetra, BoxLayout.Y_AXIS));

		JRadioButton rbtLetraBlanca = new JRadioButton("Blanco");
		JRadioButton rbtLetraNegra = new JRadioButton("Negro", true);

		CambiarColorLetra ccl = new CambiarColorLetra();
		rbtLetraBlanca.addActionListener(ccl);
		rbtLetraNegra.addActionListener(ccl);
		ButtonGroup bgColorLetra = new ButtonGroup();
		bgColorLetra.add(rbtLetraBlanca);
		bgColorLetra.add(rbtLetraNegra);

		pnlColorLetra.add(new JLabel("Color letra:"));
		pnlColorLetra.add(rbtLetraBlanca);
		pnlColorLetra.add(rbtLetraNegra);

		pnlOpciones.add(pnlColorLetra);

		getContentPane().add(pnlOpciones, BorderLayout.WEST);

		setVisible(true);
	}

	private class CambiarEstiloLetra implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int estilo = 0; // Font.PLAIN = 0
			if (chkNegrita.isSelected())
				estilo += 1; // Font.BOLD = 1
			if (chkCursiva.isSelected())
				estilo += 2;
			// Negria + Cursiva = 1 + 2 = 3
			fuente = new Font(fuente.getFamily(), estilo, fuente.getSize());
			txaTexto.setFont(fuente);
		}
	}

	private class CambiarColorFondo implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Negro":
				txaTexto.setBackground(Color.BLACK);
				break;
			case "Blanco":
				txaTexto.setBackground(Color.WHITE);

				break;
			case "Rojo":
				txaTexto.setBackground(Color.RED);
				break;
			case "Azul":
				txaTexto.setBackground(Color.BLUE);
				break;
			}
		}
	}

	private class CambiarColorLetra implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Negro":
				txaTexto.setForeground(Color.BLACK);
				break;
			case "Blanco":
				txaTexto.setForeground(Color.WHITE);
			}
		}
	}
}
