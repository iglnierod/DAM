package ejerciciosBD.circuitosf1;

import java.util.LinkedList;

import com.mysql.cj.protocol.Resultset;

import java.net.URL;
import java.sql.*;

public class Circuito {
	private int idCircuito;
	private String nombre;
	private String pais;
	private double longitud;
	private int numCurvas;
	private URL trazado;
	
	public Circuito(int idCircuito, String nombre, String pais, double longitud, int numCurvas,URL trazado) {
		super();
		this.idCircuito = idCircuito;
		this.nombre = nombre;
		this.pais = pais;
		this.longitud = longitud;
		this.numCurvas = numCurvas;
		this.trazado = trazado;
	}
	// METODOS
	public static LinkedList<Circuito> getListaCircuitos() {
		LinkedList<Circuito> circuitos = new LinkedList<Circuito>();
		String sentenciaSQL = "SELECT * FROM circuitos";
		
		try(Connection con = DriverManager.getConnection(App.URL,App.USUARIO,App.CLAVE);
				Statement stmt = con.createStatement()){
			ResultSet rs = stmt.executeQuery(sentenciaSQL);
			while(rs.next()) {
				int idCircuito = rs.getInt("idCircuito");
				String nombre = rs.getString("nombre");
				String pais = rs.getString("pais");
				double longitud = rs.getDouble("longitud");
				int numCurvas = rs.getInt("numCurvas");
				URL trazado = rs.getURL("trazado");
				
				circuitos.add(new Circuito(idCircuito, nombre, pais, longitud, numCurvas,trazado));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return circuitos;
	}
	
	public String getInformacion() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nombre: " + nombre + " ");
		sb.append("Pais: " + pais  + " ");
		sb.append("Longitud: " + longitud + " ");
		sb.append("Nº Curvas: " + numCurvas);
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
	// GETTERS & SETTERS
	public int getIdCircuito() {
		return idCircuito;
	}

	public void setIdCircuito(int idCircuito) {
		this.idCircuito = idCircuito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getNumCurvas() {
		return numCurvas;
	}

	public void setNumCurvas(int numCurvas) {
		this.numCurvas = numCurvas;
	}
	public URL getTrazado() {
		return trazado;
	}
	public void setTrazado(URL trazado) {
		this.trazado = trazado;
	}

}
