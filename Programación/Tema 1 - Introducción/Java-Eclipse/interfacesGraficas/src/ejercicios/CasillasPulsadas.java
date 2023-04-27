package ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CasillasPulsadas {
	public static void main(String[] args) {
		new VentanaCasillasPulsadas();
	}
}

class VentanaCasillasPulsadas extends JFrame {
	private final int WIDTH = 600;
	private final int HEIGHT = 600;
	public VentanaCasillasPulsadas() {
		setTitle("Casillas Pulsadas");
		setBounds(1300, 200, WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new Cuadricula(), BorderLayout.CENTER);
		add(new Contadores(), BorderLayout.SOUTH);
		setVisible(true);
	}

	class Cuadricula extends JPanel {
		private final int ROWS = 9;
		private final int COLS = 9;
		
		public Cuadricula() {
			this.setLayout(new GridLayout(ROWS, COLS));
			boolean blancaUltima = false;
			for (int i = 0; i < COLS; i++)
				for (int j = 0; j < ROWS; j++)
					if (blancaUltima) {
						this.add(new CasillaNegra());
						blancaUltima = false;
					} else {
						this.add(new CasillaBlanca());
						blancaUltima = true;
					}
		}
	}

	class Contadores extends JPanel {
		private static int contadorBlancas = 0;
		private static int contadorNegras = 0;
		private static JLabel lblBlancas = new JLabel();
		private static JLabel lblNegras = new JLabel();
		
		public Contadores() {
			this.setLayout(new GridLayout(1,2,40,20));
			
			lblBlancas.setFont(new Font("Arial", 0, 18));
			lblNegras.setFont(new Font("Arial", 0, 18));
			
			updateBlancas();
			updateNegras();
			this.add(lblBlancas);
			this.add(lblNegras);
		}
		
		public static void updateBlancas() {
			lblBlancas.setText("Total clicks casillas blancas: " + contadorBlancas);
			
		}
		
		public static void updateNegras() {
			lblNegras.setText("Total clicks casillas negras: " + contadorNegras);			
		}
		 
		public static void sumarBlancas() {
			contadorBlancas++;
			updateBlancas();
		}
		
		public static void sumarNegras() {
			contadorNegras++;
			updateNegras();
		}
	}
	
	class Casilla extends JPanel {
		private JLabel lblContador;
		private int contador = 0;
		private Color color;

		public Casilla(Color color) {
			setPreferredSize(new Dimension(50, 50));
			this.setLayout(new GridBagLayout());
			this.color = color;

			lblContador = new JLabel("0");
			lblContador.setFont(new Font("Arial", Font.BOLD, 22));
			lblContador.setForeground(color);

			this.addMouseListener(new ClickEvent());
			this.add(lblContador);
		}

		private void sumarContador() {
			contador++;
			lblContador.setText(contador + "");
			if(color.equals(Color.BLACK)) {
				Contadores.sumarBlancas();
				return;
			}
			Contadores.sumarNegras();
		}

		class ClickEvent extends MouseAdapter {
			@Override
			public void mouseClicked(MouseEvent e) {
				sumarContador();
			}
		}
	}

	class CasillaBlanca extends Casilla {
		public CasillaBlanca() {
			super(Color.BLACK);
			setBackground(Color.WHITE);
		}

	}

	class CasillaNegra extends Casilla {
		public CasillaNegra() {
			super(Color.WHITE);
			setBackground(Color.BLACK);
		}
	}
}