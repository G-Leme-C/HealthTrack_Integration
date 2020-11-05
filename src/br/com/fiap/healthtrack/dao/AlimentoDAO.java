package br.com.fiap.healthtrack.dao;

import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.Alimento;
import br.com.fiap.healthtrack.util.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class AlimentoDAO {

	private final String INSERT = "INSERT INTO T_ALIMENTO(NM_ALIMENTO, VL_KCAL_GRAMA, VL_GORD_GRAMA, VL_CARB_GRAMA, VL_PROT_GRAMA)"
			+ " VALUES(?, ?, ?, ?, ?)";
	private final String GETALL = "SELECT * FROM T_ALIMENTO";
	
	private Connection conexao;

	public ArrayList<Alimento> getAll() {
		ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				alimentos.add(new Alimento(
						result.getInt("ID_ALIMENTO"),
						result.getString("NM_ALIMENTO"),
						result.getLong("VL_KCAL_GRAMA"),
						result.getLong("VL_GORD_GRAMA"),
						result.getLong("VL_CARB_GRAMA"),
						result.getLong("VL_PROT_GRAMA")
						));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return alimentos;
	}

	public boolean insert(Alimento alimento) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setString(1, alimento.getNomeAlimento());
			pstmt.setDouble(2, alimento.getValorkCalGrama());
			pstmt.setDouble(3, alimento.getValorGordGrama());
			pstmt.setDouble(4, alimento.getValorCarbGrama());
			pstmt.setDouble(5, alimento.getValorProtGrama());
			
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
