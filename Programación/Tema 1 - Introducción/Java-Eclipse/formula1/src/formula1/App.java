package formula1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

public class App {
	public static void main(String[] args) {
		new MainWindow();
	}
}

class MainWindow extends JFrame {
	// Atributos de la clase
	private final String URL = "jdbc:mysql://192.168.56.33:3306/f1_2022";
	private final String USUARIO = "progjava";
	private final String PASSWD = "abc123.";

	JComboBox<String> cmbGP = anadirGP();
	JTextArea txaTexto = new JTextArea();

	public MainWindow() {
		// Ajustes ventana
		setTitle("Fórmula 1");
		setBounds(0, 0, 700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Añadir al panel
		JPanel pnlNorte = new JPanel();
		pnlNorte.add(new JLabel("Grandes Premios"));
		pnlNorte.add(cmbGP);
		JButton btnResultado = new JButton("Ver resultado");
		pnlNorte.add(btnResultado);

		// Eventos
		btnResultado.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txaTexto.setText(verResultado());
			}
		});

		// Editar componentes
		cmbGP.setPreferredSize(new Dimension(370, 25));
		cmbGP.setMaximumRowCount(5);
		txaTexto.setEditable(false);
		txaTexto.setFont(new Font("Ubuntu Mono", Font.PLAIN, 22));
		txaTexto.setText("Texto de ejemplo");

		// Añadir a la ventana
		this.add(pnlNorte, BorderLayout.NORTH);
		JScrollPane scp = new JScrollPane(txaTexto);
		this.add(scp, BorderLayout.CENTER);

		setVisible(true);
	}

	private JComboBox anadirGP() {
		String consultaSQL = "SELECT nombre FROM GPS;";
		JComboBox<String> cmb = new JComboBox<String>();
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWD);
				Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(consultaSQL);

			while (rs.next()) {
				cmb.addItem(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cmb;
	}

	private String verResultado() {
		StringBuilder sb = new StringBuilder();
		String GP = cmbGP.getSelectedItem().toString();
		if (GP.contains("'"))
			GP = GP.substring(0, GP.indexOf("'"));
		String consultaSQL = "SELECT pu.posicionFinal, p.apellido FROM PILOTOS p, PUNTUACIONES pu, GPS g "
				+ "WHERE p.idPiloto = pu.idPiloto AND pu.fecha = g.fecha AND g.nombre LIKE '%" + GP
				+ "%' ORDER BY 1 asc;";
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWD);
				Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(consultaSQL);

			while (rs.next()) {
				sb.append(String.format("%3s - %s\n", rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
}
