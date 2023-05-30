package componentes_avanzados;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

public class Listas {
	public static void main(String[] args) {
		new VentanaPruebaListas();
	}
}

class VentanaPruebaListas extends JFrame {

	private static final String[] DIAS_SEMANA = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado","Domingo" };

	public VentanaPruebaListas() {
		setTitle("Probando listas");
		setBounds(0, 0, 500, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JList<String> lstDias = new JList<>(DIAS_SEMANA);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.add(lstDias);

		DefaultListModel<String> modelo = new DefaultListModel<>();
		modelo.addAll(Arrays.asList(DIAS_SEMANA));
		modelo.addElement("Juernes");
		lstDias.setModel(modelo);
		
		JLabel lblDiasSeleccionados = new JLabel("Ningún día seleccionado");

		lstDias.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
			 	java.util.List<String> diasSeleccionados = lstDias.getSelectedValuesList();
			 	lblDiasSeleccionados.setText("Días seleccionados: " + diasSeleccionados);
			}
		});

		this.add(pnlPrincipal);
		this.add(lblDiasSeleccionados, BorderLayout.SOUTH);

		setVisible(true);
	}
}