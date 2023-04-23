package ejercicios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AreaDeTexto {

	public static void main(String[] args) {
		new VentanaADT();
	}
}

class VentanaADT extends JFrame {
	public VentanaADT() {
		// AJUSTES VENTANA
		setTitle("Ejercicio Area de Texto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 400);

		// COMPONENTES
		JTextArea txaArea = new JTextArea(8, 15);
		JScrollPane scpTexto = new JScrollPane(txaArea);

		txaArea.setFont(new Font("Calibri", 0, 15));

		JPanel pnlBtn = new JPanel(new FlowLayout());
		JButton btnAddTxt = new JButton("Añadir texto");
		JToggleButton btnLineWrap = new JToggleButton("Ajuste de línea");
		JButton btnClear = new JButton("Borrar");
		JToggleButton btnCortarEspacios = new JToggleButton("Cortar espacios");

		pnlBtn.add(btnAddTxt);
		pnlBtn.add(btnLineWrap);
		pnlBtn.add(btnCortarEspacios);
		pnlBtn.add(btnClear);

		// EVENTOS
		btnAddTxt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txaArea.append("Hola,¿Qué tal? ");
			}
		});

		btnLineWrap.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txaArea.setLineWrap(!txaArea.getLineWrap());
			}
		});

		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txaArea.setText("");
			}
		});

		btnCortarEspacios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txaArea.setWrapStyleWord(!txaArea.getWrapStyleWord());
			}
		});

		// AÑADIR PANEL BOTONES
		getContentPane().add(pnlBtn, BorderLayout.SOUTH);
		// AÑADIR PANEL TEXTAREA
		add(scpTexto, BorderLayout.CENTER);

		setVisible(true);
	}

}