package ejerciciosBD.equiposf1;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class App extends JFrame {
	static final String URL = "jdbc:mysql://192.168.56.33:3306/f1_2022";
	static final String USUARIO = "progjava";
	static final String CLAVE = "abc123.";
	
	// MAIN
	public static void main(String[] args) {
		new App();
	}
	
	// CONSTRUCTOR
	public App() {
		setTitle("Información equipos");
		setBounds(0,0,700,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// LISTA EQUIPOS
		JPanel pnlCentroArriba = new JPanel(new GridLayout(1,2));
		JList<Equipo> liEquipos = new JList<>();
		DefaultListModel<Equipo> modeloEquipos = new DefaultListModel<>();
		modeloEquipos.addAll(Equipo.getEquipos());
		liEquipos.setModel(modeloEquipos);
		liEquipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		liEquipos.setBorder(new TitledBorder("Equipos"));
		
		pnlCentroArriba.add(liEquipos);
		
		// LISTA DIRECTORES
		JTextArea txaDirector = new JTextArea();
		txaDirector.setEditable(false);
		txaDirector.setBorder(new TitledBorder("Información Director"));
		
		pnlCentroArriba.add(txaDirector);
		
		// PATROCINADORES
		JPanel pnlCentroAbajo = new JPanel(new GridLayout(1,1));
		JList<Patrocinador> liPatrocinadores = new JList<>();
		liPatrocinadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scp = new JScrollPane(liPatrocinadores);
		pnlCentroAbajo.add(scp);
		
		JPanel pnlCentro = new JPanel(new GridLayout(2,1));
		pnlCentro.add(pnlCentroArriba);
		pnlCentro.add(pnlCentroAbajo);		
		
		// EVENTOS
		liEquipos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Equipo equipoSeleccionado = liEquipos.getSelectedValue();
				txaDirector.setText(equipoSeleccionado.getDirector().toString());
			
				DefaultListModel<Patrocinador> modeloPatrocinadores = new DefaultListModel<>();
				modeloPatrocinadores.addAll(equipoSeleccionado.getPatrocinadores());
				liPatrocinadores.setModel(modeloPatrocinadores);
			}
		});
		
		this.add(pnlCentro);
		
		setVisible(true);
	}
}
