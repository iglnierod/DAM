package ejerciciosBD.equiposf1;

import java.util.LinkedList;
import java.sql.*;

public class Equipo {
	//ATRIBUTOS
	private int idEquipo;
	private String nombre;
	private String pais;
	private String fechaIncio;
	private int idDirector;
	private int idFabricante;
	private Director director;
	private LinkedList<Patrocinador> patrocinadores;
	
	// CONSTRUCTOR
	public Equipo(int idEquipo, String nombre, String pais, String fechaIncio, int idDirector, int idFabricante) {
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.pais = pais;
		this.fechaIncio = fechaIncio;
		this.idDirector = idDirector;
		this.idFabricante = idFabricante;
		this.setDirector();
		this.patrocinadores = Patrocinador.getPatrocinadores(this.idEquipo);
	}
	// METODOS
	public static LinkedList<Equipo> getEquipos() {
		LinkedList<Equipo> equipos = new LinkedList<>();
		String sentenciaSQL = "SELECT * FROM EQUIPOS";
		try(Connection con = DriverManager.getConnection(App.URL,App.USUARIO,App.CLAVE);
				Statement stmt = con.createStatement()){
			ResultSet rs = stmt.executeQuery(sentenciaSQL);
			while(rs.next()) {
				int idEquipo = rs.getInt("idEquipo");
				String nombre = rs.getString("nombre");
				String pais = rs.getString("pais");
				String fechaIncio = rs.getString("fechaInicio");
				int idDirector = rs.getInt("idDirector");
				int idFabricante = rs.getInt("idFabricante");
				equipos.add(new Equipo(idEquipo, nombre, pais, fechaIncio, idDirector, idFabricante));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return equipos;
	}
	
	private void setDirector() {
		String sentenciaSQL = "SELECT * FROM DIRECTORES WHERE idDirector = ?";
		try(Connection con = DriverManager.getConnection(App.URL,App.USUARIO,App.CLAVE);
				PreparedStatement ps = con.prepareStatement(sentenciaSQL)){
			ps.setInt(1, this.idDirector);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String nacionalidad = rs.getString("nacionalidad");
				String fechaNacimiento = rs.getString("fechaNacimiento");
				
				this.director = new Director(this.idDirector, nombre, apellido, nacionalidad, fechaNacimiento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public Director getDirector() {
		return director;
	}
	
	// GETTERS & SETTERS
	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(LinkedList<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFechaIncio() {
		return fechaIncio;
	}

	public void setFechaIncio(String fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

	public int getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
	}

	public int getIdFabricante() {
		return idFabricante;
	}

	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}
	
	
}
