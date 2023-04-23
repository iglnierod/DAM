package layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebasGridLayout {

	public static void main(String[] args) {
		new VentanaCalculadora();
	}
}

class VentanaCalculadora extends JFrame {

	public VentanaCalculadora() {
		setTitle("Calculadora");
		setBounds(1390, 250, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new PanelCalculadora());
		setVisible(true);
	}
}

class PanelCalculadora extends JPanel {

	private JTextField txtPantalla;
	private JPanel pnlBotones;
	private boolean esDecimal = false;
	private double resultado;
	private boolean operando = false;
	char operacion;

	public PanelCalculadora() {
		txtPantalla = new JTextField("0");
		setLayout(new BorderLayout());
		add(txtPantalla, BorderLayout.NORTH);
		txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
		txtPantalla.setFont(new Font("Arial", 0, 25));

		pnlBotones = new JPanel(new GridLayout(4, 4));
		agregarBoton("7", new InsertarNumero());
		agregarBoton("8", new InsertarNumero());
		agregarBoton("9", new InsertarNumero());
		agregarBoton("/", new InsertarOperacion());
		agregarBoton("4", new InsertarNumero());
		agregarBoton("5", new InsertarNumero());
		agregarBoton("6", new InsertarNumero());
		agregarBoton("*", new InsertarOperacion());
		agregarBoton("1", new InsertarNumero());
		agregarBoton("2", new InsertarNumero());
		agregarBoton("3", new InsertarNumero());
		agregarBoton("-", new InsertarOperacion());
		agregarBoton("0", new InsertarNumero());
		agregarBoton(".", new InsertarPuntoDecimal());
		agregarBoton("=", new InsertarOperacion());
		agregarBoton("+", new InsertarOperacion());

		add(pnlBotones);
	}

	private void agregarBoton(String texto, ActionListener listener) {
		JButton btn = new JButton(texto);
		btn.addActionListener(listener);
		pnlBotones.add(btn);
	}

	private class InsertarNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String valor = e.getActionCommand();

			if (txtPantalla.getText().equals("0") || operando) {
				txtPantalla.setText(valor);
				operando = false;
			}
			else
				txtPantalla.setText(txtPantalla.getText() + valor);

		}

	}

	private class InsertarPuntoDecimal implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (esDecimal)
				return;
			txtPantalla.setText(txtPantalla.getText() + e.getActionCommand());
			esDecimal = true;
		}

	}

	private class InsertarOperacion implements ActionListener {
		boolean calcular = false;
		@Override
		public void actionPerformed(ActionEvent e) {
			String lastChar = txtPantalla.getText();
			if (lastChar.equals("."))
				return;
			switch (e.getActionCommand()) {
			case "+":
				resultado = Double.parseDouble(txtPantalla.getText());
				operando = true;
				operacion = '+';
				break;
			case "-":
				resultado = Double.parseDouble(txtPantalla.getText());
				operando = true;
				operacion = '-';
				break;
			case "*":
				resultado = Double.parseDouble(txtPantalla.getText());
				operando = true;
				operacion = '*';
				break;
			case "/":
				resultado = Double.parseDouble(txtPantalla.getText());
				operando = true;
				operacion = '/';
				break;
			case "=":
				calcular = true;
				operando = false;
			}
			System.out.println(operacion);
			if(calcular) {
				if (operacion == '+') {
					txtPantalla.setText((resultado + Double.parseDouble(txtPantalla.getText())) + "");
					
				} else if (operacion == '-') {
					txtPantalla.setText((resultado - Double.parseDouble(txtPantalla.getText())) + "");
				
				} else if (operacion == '*') {
					txtPantalla.setText((resultado * Double.parseDouble(txtPantalla.getText())) + "");
				
				} else if (operacion == '/') {
					txtPantalla.setText((resultado / Double.parseDouble(txtPantalla.getText())) + "");
				}
				
			}
			
		}
	}
}
