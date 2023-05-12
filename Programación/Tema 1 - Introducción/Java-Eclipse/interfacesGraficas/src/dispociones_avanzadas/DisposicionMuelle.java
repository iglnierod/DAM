package dispociones_avanzadas;

import java.awt.*;
import javax.swing.*;

public class DisposicionMuelle {
	public static void main(String[] args) {
		new VentanaMuelle();
	}
}

class VentanaMuelle extends JFrame {
	public VentanaMuelle() {
		setTitle("Disposición en muelle");
		setBounds(1400, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btnRojo = new JButton("Rojo");
		JButton btnVerde = new JButton("Verde");
		JButton btnAzul = new JButton("Azul");
		
		SpringLayout disposicionMuelle = new SpringLayout();
		JPanel pnl = new JPanel(disposicionMuelle);
		
		pnl.add(btnRojo);
		pnl.add(btnVerde);
		pnl.add(btnAzul);
		getContentPane().add(pnl);

		Spring sprMuelle = Spring.constant(0,10,100);
		disposicionMuelle.putConstraint(SpringLayout.WEST, btnRojo, sprMuelle, SpringLayout.WEST, pnl);
		disposicionMuelle.putConstraint(SpringLayout.WEST, btnVerde, sprMuelle, SpringLayout.EAST, btnRojo);
		disposicionMuelle.putConstraint(SpringLayout.WEST, btnAzul, sprMuelle, SpringLayout.EAST, btnVerde);
		disposicionMuelle.putConstraint(SpringLayout.EAST, pnl, sprMuelle, SpringLayout.WEST, btnAzul);
		
		
		setVisible(true);
	}
}
