package br.com.fiap.healthtrack.dao;

import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.AtividadeFisica;
import br.com.fiap.healthtrack.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class AtividadeFisicaDAO {

	private final String INSERT = "INSERT INTO T_ATIVIDADE_FISICA(DS_ATIVIDADE, TIP_ATIVIDADE, VL_KCAL_POR_MIN) VALUES(?, ?, ?)";
	private final String GETALL = "SELECT * FROM T_ATIVIDADE_FISICA";
	
	private Connection conexao;

	public ArrayList<AtividadeFisica> getAll() {
		ArrayList<AtividadeFisica> atividadesFisicas = new ArrayList<AtividadeFisica>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				atividadesFisicas.add(new AtividadeFisica(
						result.getInt("ID_ATIVIDADE_FISICA"),
						result.getString("DS_ATIVIDADE"),
						result.getString("TIP_ATIVIDADE"),
						result.getInt("VL_KCAL_POR_MIN")));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return atividadesFisicas;
	}

	public boolean insert(AtividadeFisica atvFisica) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setString(1, atvFisica.getDescricaoAtividadeF());
			pstmt.setString(2, atvFisica.getTipoAtividadeF());
			pstmt.setDouble(3, atvFisica.getValorKCalMinuto());
			
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
