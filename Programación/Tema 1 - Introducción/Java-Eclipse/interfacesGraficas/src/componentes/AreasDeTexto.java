package componentes;

import java.awt.event.*;
import javax.swing.*;

public class AreasDeTexto {

	public static void main(String[] args) {
		new VentanaAreaDeTexto();
	}
}

class VentanaAreaDeTexto extends JFrame {
	public VentanaAreaDeTexto() {
		setTitle("Área de texto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1520, 250, 300, 400);

		add(new PanelAreaTexto());

		setVisible(true);
	}
}

class PanelAreaTexto extends JPanel {
	public PanelAreaTexto() {
		JTextArea txaTexto = new JTextArea(8, 20);
		txaTexto.setLineWrap(true);
		JScrollPane scpTexto = new JScrollPane(txaTexto);
		add(scpTexto);
		JButton mayus = new JButton("Mayúsculas");
		mayus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!(txaTexto.getSelectedText() == null))
					txaTexto.replaceSelection(txaTexto.getSelectedText().toUpperCase());
			}
		});
		add(mayus);
	}
}
