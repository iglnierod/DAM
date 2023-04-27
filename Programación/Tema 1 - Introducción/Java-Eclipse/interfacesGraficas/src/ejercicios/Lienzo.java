package ejercicios;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Lienzo {
	public static void main(String[] args) {
		new VentanaLienzo();
	}
}

class VentanaLienzo extends JFrame {
	private final int WIDTH = 500;
	private final int HEIGHT = 500;

	public VentanaLienzo() {
		setTitle("Casillas Pulsadas");
		setBounds(1390, 200, WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.add(new PanelLienzo());
		setVisible(true);
	}
}

class PanelLienzo extends JPanel {
	private final int ROWS = 50;
	private final int COLS = 50;
	public Pixel[][] pixeles = new Pixel[ROWS][COLS];
	private JPanel lienzo = new JPanel(new GridLayout(ROWS, COLS));

	// CONTADORES
	private JPanel pnlContadores = new JPanel();
	private JLabel lblBlanco = new JLabel("");
	private JLabel lblRojo = new JLabel("");
	private JLabel lblVerde = new JLabel("");
	private JLabel lblAzul = new JLabel("");
	private JLabel lblNegro = new JLabel("");

	private int contadorBlanco = 0;
	private int contadorRojo = 0;
	private int contadorVerde = 0;
	private int contadorAzul = 0;
	private int contadorNegro = 0;

	public PanelLienzo() {
		this.setLayout(new BorderLayout());

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				pixeles[i][j] = new Pixel();
				lienzo.add(pixeles[i][j]);
			}
		}

		pnlContadores.setLayout(new GridLayout(5, 2));
		anadirPnl(new JPanel(), Color.WHITE, lblBlanco);
		anadirPnl(new JPanel(), Color.RED, lblRojo);
		anadirPnl(new JPanel(), Color.GREEN, lblVerde);
		anadirPnl(new JPanel(), Color.BLUE, lblAzul);
		anadirPnl(new JPanel(), Color.BLACK, lblNegro);
		
		updateLbl();
		
		this.add(lienzo, BorderLayout.CENTER);
		this.add(pnlContadores, BorderLayout.WEST);
	}

	private void updateLbl() {
		resetLbl();
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if (pixeles[i][j].getBackground().equals(Color.WHITE)) {
					contadorBlanco++;
					lblBlanco.setText(contadorBlanco + "");
				} else if (pixeles[i][j].getBackground().equals(Color.RED)) {
					contadorRojo++;
					lblRojo.setText(contadorRojo + "");
				} else if (pixeles[i][j].getBackground().equals(Color.GREEN)) {
					contadorVerde++;
					lblVerde.setText(contadorVerde + "");
				} else if (pixeles[i][j].getBackground().equals(Color.BLUE)) {
					contadorAzul++;
					lblAzul.setText(contadorAzul + "");
				} else if (pixeles[i][j].getBackground().equals(Color.BLACK)) {
					contadorNegro++;
					lblNegro.setText(contadorNegro + "");
				}
			}
		}
		repaint();
	}

	private void resetLbl() {
		contadorBlanco=0;
		contadorRojo=0;
		contadorVerde=0;
		contadorAzul=0;
		contadorNegro=0;
	}
	
	private void anadirPnl(JPanel pnl, Color c, JLabel lbl) {
		pnl.setBackground(c);
		pnl.setPreferredSize(new Dimension(10, 5));
		pnlContadores.add(pnl);
		pnlContadores.add(lbl);
	}
	
	class Pixel extends JPanel {
		public Pixel() {
			this.setPreferredSize(new Dimension(1, 1));
			this.setBackground(Color.WHITE);
			this.addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					Color fondo = getBackground();
					switch (e.getModifiersEx()) {
					case MouseEvent.BUTTON1_DOWN_MASK: // IZQUIERDO
						if (fondo.equals(Color.RED)) {
							setBackground(Color.GREEN);
							updateLbl();
							return;
						}

						if (fondo.equals(Color.GREEN)) {
							setBackground(Color.BLUE);
							updateLbl();
							return;
						}

						setBackground(Color.RED);
						return;
					case MouseEvent.BUTTON3_DOWN_MASK: // DERECHO
						if (fondo.equals(Color.BLACK)) {
							setBackground(Color.WHITE);
							
							
							
							return;
						}
						setBackground(Color.BLACK);
						updateLbl();
						break;
					}
				}
			});
		}
	}
}
