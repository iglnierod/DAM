package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DesplegablesCmb {
	public static void main(String[] args) {
		new VentanaDesplegables();
	}
}

class VentanaDesplegables extends JFrame {
	private JComboBox<String> cmbFuentes = new JComboBox<>();
	public VentanaDesplegables() {
		setTitle("Desplegables");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 200);
		
		add(cmbFuentes, BorderLayout.NORTH);
		
		añadirTiposLetra();
		
		cmbFuentes.setEditable(true);
		cmbFuentes.setMaximumRowCount(4);
		JLabel lblTexto = new JLabel("Texto de ejemplo");
		lblTexto.setFont(new Font(lblTexto.getFont().getFamily(), Font.BOLD, 30));
		add(lblTexto, BorderLayout.SOUTH);
		
		cmbFuentes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTexto.setFont(new Font((String)cmbFuentes.getSelectedItem(), Font.BOLD, 30));
			}
		});
		setVisible(true);
	}
	
	public void añadirTiposLetra() {
		for (String fuente : GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()) {
			cmbFuentes.addItem(fuente);
		}
	}
}
