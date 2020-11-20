package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.AtividadeFisica;
import br.com.fiap.healthtrack.entities.AtividadeFisicaPraticada;
import br.com.fiap.healthtrack.util.*;

public class AtividadeFisicaPraticadaDAO {
	private final String INSERT = "INSERT INTO T_ATIVIDADE_FISICA_USUARIO (ID_ATIVIDADE_FISICA, ID_USUARIO, QT_MIN_ATIVIDADE, DH_ATIVIDADE_FISICA, VL_DISTANCIA_PERCORRIDA, VL_ELEVACAO, VL_BMP_MEDIO) VALUES(?, ?, ?, ?, ?, ?, ?);";
	private final String GETALL = "SELECT * FROM T_ATIVIDADE_FISICA_USUARIO";
	
	private Connection conexao;

	public ArrayList<AtividadeFisicaPraticada> getAll() {
		ArrayList<AtividadeFisicaPraticada> atividadesFisicas = new ArrayList<AtividadeFisicaPraticada>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				atividadesFisicas.add(new AtividadeFisicaPraticada(
						result.getInt("ID_ATV_FISICA_USUARIO"),
						new AtividadeFisica(result.getInt("ID_ATIVIDADE_FISICA")),
						result.getInt("ID_USUARIO"),
						result.getLong("QT_MIN_ATIVIDADE"),
						result.getDate("DH_ATIVIDADE_FISICA"),
						result.getLong("VL_DISTANCIA_PERCORRIDA"),
						result.getLong("VL_ELEVACAO"),
						result.getInt("VL_BMP_MEDIO")
						));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return atividadesFisicas;
	}

	public boolean insert(AtividadeFisicaPraticada atvFisicaPraticada) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setInt(1, atvFisicaPraticada.getAtividadeFisica().getIdAtividadeFisica());
			pstmt.setInt(2, atvFisicaPraticada.getIdUsuario());
			pstmt.setLong(3, atvFisicaPraticada.getTempoPraticado());
			pstmt.setDate(4, new java.sql.Date(atvFisicaPraticada.getDhPratica().getTime()));
			pstmt.setDouble(5, atvFisicaPraticada.getDistanciaPercorridaMetros());
			pstmt.setDouble(6, atvFisicaPraticada.getElevacaoMetros());
			pstmt.setInt(7, atvFisicaPraticada.getBpmMedio());
			
			
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
