package dispociones_avanzadas;

import java.awt.*;
import javax.swing.*;

public class DisposicionCaja {
	public static void main(String[] args) {
		new VentanaCaja();
	}
}

class VentanaCaja extends JFrame {
	public VentanaCaja() {
		setTitle("Disposición en caja");
		setBounds(1400, 300, 200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(10);
		txtNombre.setMaximumSize(txtNombre.getPreferredSize());

		Box cajaHorizontalNombre = Box.createHorizontalBox();
		cajaHorizontalNombre.add(lblNombre);
		cajaHorizontalNombre.add(Box.createHorizontalStrut(10));
		cajaHorizontalNombre.add(txtNombre);

		Box cajaHorizontalApellido1 = Box.createHorizontalBox();
		JTextField txtApellido1 = new JTextField(10);
		txtApellido1.setMaximumSize(txtApellido1.getPreferredSize());
		cajaHorizontalApellido1.add(new JLabel("Apellido 1"));
		cajaHorizontalApellido1.add(Box.createHorizontalStrut(10));
		cajaHorizontalApellido1.add(txtApellido1);

		Box cajaHorizontalApellido2 = Box.createHorizontalBox();
		JTextField txtApellido2 = new JTextField(10);
		txtApellido2.setMaximumSize(txtApellido2.getPreferredSize());
		cajaHorizontalApellido2.add(new JLabel("Apellido 2"));
		cajaHorizontalApellido2.add(Box.createHorizontalStrut(10));
		cajaHorizontalApellido2.add(txtApellido2);

		Box cajaHorizontalBotones = Box.createHorizontalBox();

		JButton btnRegistrar = new JButton("Registrar");
		JButton btnVaciar = new JButton("Vaciar");
		
		cajaHorizontalBotones.add(btnRegistrar);
		cajaHorizontalBotones.add(Box.createHorizontalGlue());
		cajaHorizontalBotones.add(btnVaciar);

		Box cajaVertical = Box.createVerticalBox();
		cajaVertical.add(cajaHorizontalNombre);
		cajaVertical.add(cajaHorizontalApellido1);
		cajaVertical.add(cajaHorizontalApellido2);
		cajaVertical.add(cajaHorizontalBotones);

		getContentPane().add(cajaVertical);

		setVisible(true);
	}
}