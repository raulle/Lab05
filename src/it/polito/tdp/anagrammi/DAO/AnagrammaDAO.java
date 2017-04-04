package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AnagrammaDAO {

	public boolean isCorrect(String anagramma){
		String sql= "SELECT nome " +
					"FROM parola "+
					"WHERE nome=?";
		String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=chiaretta<3";
		boolean result=false;
		try{
			Connection conn= DriverManager.getConnection(jdbcURL);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, anagramma);
			ResultSet res = pst.executeQuery();
			if(res.next()){
				result=true;
			} else
				result=false;
			conn.close();

		} catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
}

