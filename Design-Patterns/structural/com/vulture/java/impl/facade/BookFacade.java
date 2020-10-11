package com.vulture.java.impl.facade;

public class BookFacade {

	private static String cName = "BookFacade :: ";

	private BookFacade() {
		System.out.println("Creating priavte constructor");
	}

	public static BookFacade getInstance() {
		System.out.println(cName+ "getInstance() called.. Going to return of class " + cName);
		BookFacade aBook = new BookFacade();
		return aBook;

	}

	public String getBookNameByAuthor(String aAuthor) {
		
		return aAuthor;
	}

}
