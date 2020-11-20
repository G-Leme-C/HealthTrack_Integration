package br.com.fiap.healthtrack.dao;

import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.Evento;
import br.com.fiap.healthtrack.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class EventoDAO {

	private final String INSERT = "INSERT INTO T_EVENTO(DH_INICIO_EVENTO, DH_FINAL_EVENTO, VL_LATITUDE_LOCAL, VL_LONGITUDE_LOCAL, "
			+ "DS_EVENTO, QT_MAXIMA_PARTICIPANTES) VALUES(?, ?, ?, ?, ?, ?)";
	private final String GETALL = "SELECT * FROM T_EVENTO";
	
	private Connection conexao;

	public ArrayList<Evento> getAll() {
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				eventos.add(new Evento(
						result.getInt("ID_EVENTO"),
						result.getDate("DH_INICIO_EVENTO"),
						result.getDate("DH_FINAL_EVENTO"),
						result.getString("VL_LATITUDE_LOCAL"),
						result.getString("VL_LONGITUDE_LOCAL"),
						result.getString("DS_EVENTO"),
						result.getInt("QT_MAXIMA_PARTICIPANTES")					
						));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return eventos;
	}

	public boolean insert(Evento evento) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setDate(1,new java.sql.Date(evento.getDhInicioEvento().getTime()));
			pstmt.setDate(2,new java.sql.Date(evento.getDhFinalEvento().getTime()) );
			pstmt.setString(3, evento.getLatitudeLocalEvento());
			pstmt.setString(4, evento.getLongitudeLocalEvento());
			pstmt.setString(5, evento.getDescricaoEvento());
			pstmt.setInt(6, evento.getQtMaximaParticipantes());
			
			int regAfetados = pstmt.executeUpdate();
			conexao.close();
			return (regAfetados > 0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
}
