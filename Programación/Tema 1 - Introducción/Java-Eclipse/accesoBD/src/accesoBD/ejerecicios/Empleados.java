package accesoBD.ejerecicios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.LinkedList;

public class Empleados {
	public static void main(String[] args) {
		new VentanaEmpleados();
	}
}

class VentanaEmpleados extends JFrame {
	// CONEXION
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "javadmin";
	static final String CLAVE = "20J@v@23";
	// ATRIBUTOS
	private JTextField txtOficina = new JTextField(6);
	private JComboBox<String> cmbEmpleados = new JComboBox<String>();
	private JTextArea txaInformacion = new JTextArea();

	// CONSTRUCTOR
	public VentanaEmpleados() {
		setTitle("Empleados");
		setBounds(0, 0, 400, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnlNorte = new JPanel();
		pnlNorte.add(new JLabel("Oficina:"));
		pnlNorte.add(txtOficina);
		pnlNorte.add(new JLabel("Empleados"));
		pnlNorte.add(cmbEmpleados);

		cmbEmpleados.setPreferredSize(new Dimension(130, 25));
		txaInformacion.setBorder(new TitledBorder("Datos empleados seleccionado"));

		txtOficina.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int codigoTecla = e.getKeyCode();
				if (codigoTecla == 10) {
					cmbEmpleados.removeAllItems();
					LinkedList<String> lista = getEmpleados(txtOficina.getText());
					for (String empleado : lista) {
						cmbEmpleados.addItem(empleado);
					}
				}
			}
		});

		cmbEmpleados.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String sentenciaSQL = "SELECT employeeNumber, concat(firstName,' ',lastName) AS 'nombre',extension,email,officeCode,jobTitle "
						+ "FROM employees WHERE concat(firstName,' ',lastName) = ?;";
				StringBuilder sb = new StringBuilder();
				try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
						PreparedStatement ps = con.prepareStatement(sentenciaSQL)) {
					String empleado = cmbEmpleados.getSelectedItem().toString();
					if (empleado == null)
						return;
					ps.setString(1, empleado);
					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						sb.append("Nº: " + rs.getString("employeeNumber") + "\n");
						sb.append("Nombre: " + rs.getString("nombre") + "\n");
						sb.append("Extensión: " + rs.getString("extension") + "\n");
						sb.append("Email: " + rs.getString("email") + "\n");
						sb.append("Oficina: " + rs.getString("officeCode") + "\n");
						sb.append("Puesto: " + rs.getString("jobTitle"));
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
				txaInformacion.setText(sb.toString());
			}
		});

		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					txaInformacion.print();
				} catch (PrinterException e1) {
					e1.printStackTrace();
				}
			}
		});

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(txaInformacion);
		JPanel pnlSur = new JPanel();
		pnlSur.add(btnImprimir);
		this.add(pnlSur, BorderLayout.SOUTH);
		setVisible(true);
	}

	// METODOS
	private LinkedList<String> getEmpleados(String codOficina) {
		String sentenciaSQL = "SELECT firstName,lastName FROM employees WHERE officeCode = ?;";
		LinkedList<String> empleados = new LinkedList<>();
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement ps = con.prepareStatement(sentenciaSQL)) {
			ps.setString(1, codOficina);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				empleados.add(rs.getString("firstName") + " " + rs.getString("lastName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empleados;
	}

}