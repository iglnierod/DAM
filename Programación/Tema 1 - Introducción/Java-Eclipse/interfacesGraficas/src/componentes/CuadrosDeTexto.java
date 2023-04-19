package componentes;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import java.awt.event.*;

public class CuadrosDeTexto {

	public static void main(String[] args) {
		new VentanaTexto();
	}
}

class VentanaTexto extends JFrame {
	public VentanaTexto() {
		setTitle("Ventana texto");
		setBounds(1420, 250, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new PanelTexto());

		setVisible(true);
	}
}

class PanelTexto extends JPanel {
	public PanelTexto() {
		JLabel lblTexto = new JLabel("Texto:");
		add(lblTexto);
		JTextField txtTexto = new JTextField(15);
		add(txtTexto);

		JButton btnCapturarTexto = new JButton("Capturar texto");
		btnCapturarTexto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtTexto.getText().trim());
			}
		});
		add(btnCapturarTexto);
		
		Document documento = txtTexto.getDocument();
		documento.addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("Borrando texto");
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("Añadiendo texto");
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("Modificando texto");
			}
		});
	}
}