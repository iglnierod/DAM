package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
	s
	public VentanaSeleccion() {
		setTitle("Selección");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 400);
		
		txaTexto = new JTextArea(12,100);
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
		
		
		setVisible(true);
	}
	
	private class CambiarEstiloLetra implements ActionListener{
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
}



















