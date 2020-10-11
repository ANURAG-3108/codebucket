package com.codebucket.strarray;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateCheck {
	
	
	public static void main(String[] args) {
		System.out.println(getFormatedDate("1524155201186"));		
	}
	
	private static String getFormatedDate(String date) {
		String fnName = "GlobeMarketAgents.getFormatedDate() :: ";
		System.out.println(fnName + " Processing date from Milisecond [ " + date+ " ] to formated date");
		long longDate = Long.parseLong(date);
		System.out.println(fnName+ " Successfully parse the date into Long from String");
		Date dateObj = new Date(longDate);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		System.out.println(fnName + " Formated Date is [ "+ formatter.format(dateObj) + " ]");
		return formatter.format(dateObj);
	}
}
