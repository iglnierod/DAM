package componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menus {
	public static void main(String[] args) {
		new VentanaMenus();
	}
}

class VentanaMenus extends JFrame {
	public VentanaMenus() {
		setTitle("Menús");
		setBounds(1425, 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		MENUS
		JMenuBar mnbBarraMenu = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenu mnuEdicion = new JMenu("Edicion");
		JMenu mnuFormato = new JMenu("Formato");
		JMenu mnuVer = new JMenu("Ver"); 
		
		mnbBarraMenu.add(mnuArchivo);
		mnbBarraMenu.add(mnuEdicion);
		mnbBarraMenu.add(mnuFormato);
		mnbBarraMenu.add(mnuVer);
		
//		 MENU ABRIR
		
		JMenuItem mniAbrir = new JMenuItem("Abrir", 'A');
		JMenuItem mniGuardar = new JMenuItem("Guardar", new ImageIcon("recursos/save-16.png"));
		JMenuItem mniSalir = new JMenuItem("Salir", new ImageIcon("recursos/zoom-16.png"));
		
//		mniGuardar.setHorizontalTextPosition(JMenuItem.LEFT); ICONO A LA DERECHA

		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(new JSeparator());
		mnuArchivo.add(mniSalir);
		
//		MENU EDICION
		JMenuItem mniCopiar = new JMenuItem("Copiar");
		JMenuItem mniPegar = new JMenuItem("Pegar");

		mnuEdicion.add(mniCopiar);
		mnuEdicion.add(mniPegar);
				
//		MENU FORMATO
		JCheckBoxMenuItem mniAjusteLinea = new JCheckBoxMenuItem("Ajuste de línea");
		JMenuItem mniFuente = new JMenuItem("Fuente...");

		mnuFormato.add(mniAjusteLinea);
		mnuFormato.add(mniFuente);
				
//		MENU VER
		JMenu mnuZoom = new JMenu("Zoom");
		JMenuItem mniAcercar = new JMenuItem("Acercar");
		JMenuItem mniAlejar = new JMenuItem("Alejar");
		
		mnuZoom.add(mniAcercar);
		mnuZoom.add(mniAlejar);
		
		mnuVer.add(mnuZoom);
		
		mnuArchivo.setMnemonic('A');
		mniAbrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ejecutando el menú abrir");
			}
		});
		
		mniSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mniSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK/*, true*/));
		
		
		JPopupMenu pupSaludo = new JPopupMenu();
		JMenuItem mniSaludoConsola = new JMenuItem("Saludo por consola");
		JMenuItem mniSaludoPopup= new JMenuItem("Saludo por JOptionPane");
		
		mniSaludoConsola.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("¡Hola!");
			}
		});
		
		mniSaludoPopup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaMenus.this, "¡Hola!");
			}
		});
		
		pupSaludo.add(mniSaludoConsola);
		pupSaludo.add(mniSaludoPopup);
		
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setComponentPopupMenu(pupSaludo);
		
		JPopupMenu pupColores = new JPopupMenu();
		JMenuItem mniRojo = new JMenuItem("Rojo");
		pupColores.add(mniRojo);
		
		pnlPrincipal.setComponentPopupMenu(pupColores);
		
		mniRojo.addActionListener(new ActionListener() {			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlPrincipal.setBackground(Color.RED);
			}
		});
		
		JPanel pnlColor1 = new JPanel();
		JPanel pnlColor2 = new JPanel();
		
		pnlPrincipal.setLayout(new GridLayout(2, 2));
		pnlPrincipal.add(pnlColor1);
		pnlPrincipal.add(new JLabel());
		pnlPrincipal.add(new JLabel());
		pnlPrincipal.add(pnlColor2);
		
		JPopupMenu pupColor1 = new JPopupMenu();
		JMenuItem mniAzul = new JMenuItem("Azul");
		pupColor1.add(mniAzul);
		
		mniAzul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlColor1.setBackground(Color.BLUE);
			}
		});
		
		JPopupMenu pupColor2 = new JPopupMenu();
		JMenuItem mniAmarillo = new JMenuItem("Amarillo");
		pupColor2.add(mniAmarillo);
		
		mniAmarillo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlColor2.setBackground(Color.YELLOW);
			}
		});
		
		pnlColor1.setComponentPopupMenu(pupColor1);
		pnlColor2.setComponentPopupMenu(pupColor2);
		
		
		getContentPane().add(pnlPrincipal, BorderLayout.CENTER);
		getContentPane().add(mnbBarraMenu, BorderLayout.NORTH);
		
		setVisible(true);
	}
}


































