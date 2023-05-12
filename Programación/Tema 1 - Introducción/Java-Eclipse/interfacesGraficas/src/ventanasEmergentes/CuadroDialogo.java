package ventanasEmergentes;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class CuadroDialogo {
	public static void main(String[] args) {
		new VentanaCuadroDialogo();
	}
}

class VentanaCuadroDialogo extends JFrame {
	JButton btnSalir = new JButton("Salir");

	public VentanaCuadroDialogo() {
		setTitle("Cuadros de diálogo");
		setBounds(1000, 100, 600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

//		JOptionPane.showMessageDialog(this, "Espero que te guste el programa");
		JPanel pnlNorte = new JPanel(new FlowLayout());
		JButton btnTexto = new JButton("Nombre");

		pnlNorte.add(btnTexto);

		JLabel lblTexto = new JLabel("Texto de ejemplo");
		lblTexto.setFont(new Font("Arial", Font.BOLD, 25));

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(lblTexto, BorderLayout.SOUTH);

		btnTexto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				String res = JOptionPane.showInputDialog("Escribe tu nombre:","Introduce tu nombre");
//				lblNombre.setText(res);
				String[] nombres = { "Rodrigo", "Carlos", "Xian" };
				String res = (String) JOptionPane.showInputDialog(VentanaCuadroDialogo.this, "Nombre:", "Titulo", 3,
						new ImageIcon("recursos/rojo.png"), nombres, 0);
				lblTexto.setText(res);
			}
		});

		JButton btnConfirmacion = new JButton("Confirmación");
		pnlNorte.add(btnConfirmacion);
		int[] tiposOpcion = { JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.OK_CANCEL_OPTION, };
		btnConfirmacion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i : tiposOpcion) {
					int valorElegido = JOptionPane.showConfirmDialog(VentanaCuadroDialogo.this, "Elija un opción",
							"Confirmación", i);
					lblTexto.setText("Valor elegido: " + valorElegido);
				}
			}
		});

		JButton btnOpcion = new JButton("Opciones");
		pnlNorte.add(btnOpcion);
		btnOpcion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				for (int i : tiposOpcion) {
//					int valorElegido = JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, "¿Cómo te llamas?",
//							"Nombre", i, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Anna", "Pedro", "Lidia" },
//							"Lidia");
//					lblNombre.setText("Valor elegido: " + valorElegido);
//				}
				Object[] arrayObjetos = { btnTexto, new ImageIcon("recursos/zoom16.png"), new JTextField("Hola", 7),
						2023 };
				JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, arrayObjetos, "Array Objetos",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

				JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, "¿Qué objeto prefieres?", "Array Opciones",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayObjetos, arrayObjetos[1]);
			}
		});

		JButton btnDias = new JButton("Días");
		pnlNorte.add(btnDias);
		JComboBox<String> cmbDias = new JComboBox<String>();
		cmbDias.addItem("Lunes");
		cmbDias.addItem("Martes");
		cmbDias.addItem("Miércoles");
		cmbDias.addItem("Jueves");
		cmbDias.addItem("Viernes");
		cmbDias.addItem("Sábado");
		cmbDias.addItem("Domingo");
		Random r = new Random();
		btnDias.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int valorElegido = JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, cmbDias, "Dias",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Aceptar", "Cancelar", "Cualquiera" }, 0);
				if (valorElegido == 0)
					lblTexto.setText((String) cmbDias.getSelectedItem());
				else if (valorElegido == 2) {
					cmbDias.setSelectedIndex(r.nextInt(0, cmbDias.getItemCount()));
					lblTexto.setText((String) cmbDias.getSelectedItem());
				}
			}
		});

		pnlNorte.setBorder(BorderFactory.createEtchedBorder());
		pnlNorte.setBorder(BorderFactory.createLineBorder(Color.RED));
		pnlNorte.setBorder(BorderFactory.createMatteBorder(5, 10, 15, 20, Color.BLUE));
		pnlNorte.setBorder(BorderFactory.createMatteBorder(5, 10, 15, 20, new ImageIcon("recursos/zoom-16.png")));
		pnlNorte.setBorder(BorderFactory.createTitledBorder("Botones"));
		CompoundBorder bordeCompuesto = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.RED),
				BorderFactory.createLineBorder(Color.BLUE));
		pnlNorte.setBorder(BorderFactory.createTitledBorder(bordeCompuesto, "Botones", TitledBorder.CENTER,
				TitledBorder.ABOVE_BOTTOM, new Font("Arial", Font.ITALIC, 21), Color.GREEN));

		pnlNorte.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cerrarVentana();
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarVentana();
			}
		});

		setVisible(true);

	}

	private void cerrarVentana() {
		int valorElegido = JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, "Deseas cerrar la ventana?", "Cerrar Aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, 0);
		if (valorElegido == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
