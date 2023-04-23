package ejercicios;

import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ej1 {
	public static void main(String[] args) {
		new Ventana();
	}
}

class Ventana extends JFrame {
	public Ventana() {
		setTitle("Ej1");
		setBounds(0, 0, 250, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new Panel());

		setVisible(true);
	}
}

class Panel extends JPanel implements ActionListener {
	JButton boton = new JButton("Mostrar hora");
	JButton botonA = new JButton("A");
	JButton botonB = new JButton("B");
	JTextField tfield = new JTextField("Hola que tal", 17);
	JLabel label = new JLabel();

	public Panel() {
		botonA.addActionListener(this);
		add(botonA);

		boton.addActionListener(this);
		add(boton);

		botonB.addActionListener(this);
		add(botonB);

		tfield.addActionListener(this);
		add(tfield);

		add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "A":
			label.setText("Se ha pulsado el botón A");
			break;
		case "B":
			label.setText("Se ha pulsado el botón B");
			break;
		case "Mostrar hora":
			label.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
			break;
		}
		Object source = e.getSource();
		if (source == tfield)
			label.setText("El texto es: " + tfield.getText());
		
	}
}