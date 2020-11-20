package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.Usuario;
import br.com.fiap.healthtrack.entities.Evento;
import br.com.fiap.healthtrack.entities.InscricaoEvento;
import br.com.fiap.healthtrack.util.*;

public class InscricaoEventoDAO {
	private final String INSERT = "INSERT INTO T_INSCRITOS_EVENTO (ID_EVENTO, ID_USUARIO) VALUES(?, ?);";
	private final String GETALL = "SELECT * FROM T_INSCRITOS_EVENTO";
	
	private Connection conexao;

	public ArrayList<InscricaoEvento> getAll() {
		ArrayList<InscricaoEvento> inscricoesEventos = new ArrayList<InscricaoEvento>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				inscricoesEventos.add(new InscricaoEvento(
						result.getInt("ID_INSCRICAO_EVENTO"),
						new Usuario(result.getInt("ID_USUARIO")),
						new Evento(result.getInt("ID_EVENTO"))
						));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return inscricoesEventos;
	}

	public boolean insert(InscricaoEvento inscricao) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setInt(1, inscricao.getEvento().getIdEvento());
			pstmt.setInt(2, inscricao.getUsuarioInscrito().getIdUsuario());
			
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
