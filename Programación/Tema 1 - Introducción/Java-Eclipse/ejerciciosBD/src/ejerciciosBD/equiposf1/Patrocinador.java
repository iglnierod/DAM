package ejerciciosBD.equiposf1;

import java.sql.*;
import java.util.LinkedList;

public class Patrocinador {
	private int idPatrocinador;
	private String marca;
	private String pais;
	private String tipo;
	
	public Patrocinador(int idPatrocinador, String marca, String pais, String tipo) {
		super();
		this.idPatrocinador = idPatrocinador;
		this.marca = marca;
		this.pais = pais;
		this.tipo = tipo;
	}
	
	public static LinkedList<Patrocinador> getPatrocinadores(int idEquipo) {
		LinkedList<Patrocinador> patrocinadores = new LinkedList<>();
		String sentenciaSQL = "SELECT p.idPatrocinador,p.marca,p.pais,p.tipo FROM PATROCINADORES p, PATROCINADORES_EQUIPOS pe "
				+ "WHERE p.idPatrocinador = pe.idPatrocinador AND pe.idEquipo = ?;";
		try(Connection con = DriverManager.getConnection(App.URL,App.USUARIO,App.CLAVE);
				PreparedStatement ps = con.prepareStatement(sentenciaSQL)){
			ps.setInt(1, idEquipo);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int idPatrocinador = rs.getInt("idPatrocinador");
				String marca = rs.getString("marca");
				String pais = rs.getString("pais");
				String tipo = rs.getString("tipo");
				patrocinadores.add(new Patrocinador(idPatrocinador, marca, pais, tipo));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return patrocinadores;
	}
	
	@Override
	public String toString() {
		return this.marca;
	}
	
	public int getIdPatrocinador() {
		return idPatrocinador;
	}
	public void setIdPatrocinador(int idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
