package it.polito.tdp.anagrammi.model;

import it.polito.tdp.anagrammi.DAO.AnagrammaDAO;

public class TestModel {

	public static void main(String[] args) {

		AnagrammaDAO dao= new AnagrammaDAO();
		System.out.println(dao.isCorrect("ciao"));
		
	}

}
