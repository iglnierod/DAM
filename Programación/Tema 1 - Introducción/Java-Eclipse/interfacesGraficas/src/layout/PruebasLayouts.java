package layout;

import java.awt.*;
import javax.swing.*;

public class PruebasLayouts {

	public static void main(String[] args) {
		new VentanaLayout();
	}
}

class VentanaLayout extends JFrame {
	public VentanaLayout() {
		setTitle("Disposición por defecto");
		setBounds(1390, 250, 500, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new PanelLayout(), BorderLayout.NORTH);
		add(new PanelLayout2(), BorderLayout.SOUTH);
		
		setVisible(true);
	}
}

class PanelLayout extends JPanel {
	public PanelLayout() {		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new FlowLayout(FlowLayout.CENTER, 150, 175));
	
		setLayout(new BorderLayout());
		add(new JButton("rojo"),BorderLayout.EAST);
		add(new JButton("verde"), BorderLayout.SOUTH);
		add(new JButton("azul"), BorderLayout.WEST);
		
	}
}

class PanelLayout2 extends JPanel {
	public PanelLayout2() {
		add(new JButton("blanco"));
		add(new JButton("negro"));
	}
}

































