package br.com.fiap.healthtrack.dao;

import java.util.ArrayList;

import br.com.fiap.healthtrack.entities.Pesagem;
import br.com.fiap.healthtrack.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class PesagemDAO {

	private final String INSERT = "INSERT INTO T_PESO_USUARIO(ID_USUARIO, DH_PESAGEM, VL_PESO) VALUES(?, ?, ?)";
	private final String GETALL = "SELECT * FROM T_PESO_USUARIO";
	
	private Connection conexao;

	public ArrayList<Pesagem> getAll() {
		ArrayList<Pesagem> pesagens = new ArrayList<Pesagem>();
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			Statement stmt = conexao.createStatement();
			ResultSet result = stmt.executeQuery(GETALL);
			
			while(result.next()) {
				pesagens.add(new Pesagem(
						result.getInt("ID_PESO_USUARIO"),
						result.getInt("ID_USUARIO"),
						result.getDate("DH_PESAGEM"),
						result.getFloat("VL_PESO")
						));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return pesagens;
	}

	public boolean insert(Pesagem peso) {
		try {
			this.conexao = DBManager.obterConexaoDB();
			
			PreparedStatement pstmt = conexao.prepareStatement(INSERT);
			pstmt.setInt(1, peso.getIdUsuario());
			pstmt.setDate(2,new java.sql.Date(peso.getDhPeso().getTime()));
			pstmt.setDouble(3, peso.getValorPeso());
			
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
