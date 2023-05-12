package dispociones_avanzadas;

import java.awt.*;
import javax.swing.*;

public class DisposicionLibre {
	public static void main(String[] args) {
		new VentanaDisposicionLibre();
	}
}

class VentanaDisposicionLibre extends JFrame {
	public VentanaDisposicionLibre() {
		setTitle("Disposicion libre");
		setBounds(1000,10,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.setBounds(50,50,100,40);
		btnRojo.setBackground(Color.RED);
		
		pnl.add(btnRojo);
		
		getContentPane().add(pnl);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.setBounds(150,50,60,100);
		pnl.add(btnVerde);
		btnVerde.setBackground(Color.GREEN);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.setBounds(75,70,100,70);
		btnAzul.setBackground(Color.BLUE);
		pnl.add(btnAzul);
		
		setVisible(true);
	}
}
