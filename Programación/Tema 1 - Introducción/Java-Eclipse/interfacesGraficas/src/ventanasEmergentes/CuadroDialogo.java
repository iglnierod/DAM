package ventanasEmergentes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CuadroDialogo {
	public static void main(String[] args) {
		new VentanaCuadroDialogo();
	}
}

class VentanaCuadroDialogo extends JFrame {
	public VentanaCuadroDialogo() {
		setTitle("Cuadros de diálogo");
		setBounds(1000,100,600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		JOptionPane.showMessageDialog(this, "Espero que te guste el programa");
		JPanel pnlNorte = new JPanel(new FlowLayout());
		JButton btnTexto = new JButton("Nombre");
		
		
		pnlNorte.add(btnTexto);
		
		
		JLabel lblNombre = new JLabel("Texto de ejemplo");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 25));
		
		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(lblNombre, BorderLayout.SOUTH);
		
		btnTexto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				String res = JOptionPane.showInputDialog("Escribe tu nombre:","Introduce tu nombre");
//				lblNombre.setText(res);
				String[] nombres = {"Rodrigo",
									"Carlos",
									"Xian"};
				String res = (String)JOptionPane.showInputDialog(VentanaCuadroDialogo.this,"Nombre:","Titulo",3,new ImageIcon("recursos/rojo.png"),nombres,0);
				lblNombre.setText(res);
		}});
		
		
		setVisible(true);
		
//		JOptionPane.showMessageDialog(this, "Se ha finalizado la carga", "Titulo del cuadro de diálogo", JOptionPane.PLAIN_MESSAGE);
//		int[] tiposMensaje = {
//				JOptionPane.ERROR_MESSAGE, // 0
//				JOptionPane.INFORMATION_MESSAGE, // 1
//				JOptionPane.WARNING_MESSAGE, // 2
//				JOptionPane.QUESTION_MESSAGE, // 3
//				JOptionPane.PLAIN_MESSAGE // -1
//			};
//		
//		for (int i : tiposMensaje) {
//			JOptionPane.showMessageDialog(this, "Texto de ejemplo", i+"", i);
//		}
		
	}
}