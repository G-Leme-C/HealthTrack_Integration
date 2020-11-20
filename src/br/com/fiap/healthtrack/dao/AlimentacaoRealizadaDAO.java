package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.AlimentacaoRealizada;
import br.com.fiap.healthtrack.entities.Alimento;
import br.com.fiap.healthtrack.util.*;

public class AlimentacaoRealizadaDAO {
	private final String INSERT = "INSERT INTO T_ALIMENTACAO_USUARIO (ID_USUARIO, ID_ALIMENTO, DH_ALIMENTACAO, QT_ALIMENTO) VALUES (?, ?, ?, ?)";
	private final String GETALL = "SELECT * FROM T_ALIMENTACAO_USUARIO";
	
	private Connection conexao;

	public ArrayList<AlimentacaoRealizada> getAll() {
		ArrayList<AlimentacaoRealizada> alimentacaoRealizada = new ArrayList<AlimentacaoRealizada>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				alimentacaoRealizada.add(new AlimentacaoRealizada(
						result.getInt("ID_ATV_FISICA_USUARIO"),
						result.getInt("ID_USUARIO"),
						result.getDate("DH_ALIMENTACAO"),
						result.getInt("QT_ALIMENTO"),
						new Alimento(result.getInt("ID_ALIMENTO"))
						));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return alimentacaoRealizada;
	}

	public boolean insert(AlimentacaoRealizada alimentacaoRealizada) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setInt(1, alimentacaoRealizada.getIdUsuario());
			pstmt.setInt(2, alimentacaoRealizada.getAlimento().getIdAlimento());
			pstmt.setDate(3, new java.sql.Date(alimentacaoRealizada.getDhAlimentacao().getTime()));
			pstmt.setInt(4, alimentacaoRealizada.getQuantidadeAlimentoGramas());
			
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
