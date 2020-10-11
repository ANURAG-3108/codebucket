package com.vulture.java.impl.observer;

public class CricketObserverDemo {
	
	private static String cName = "CricketObserverDemo :: ";
	public static void main(String [] args) throws InterruptedException{
		CricketScore cricketScore = new CricketScore();		
		new ObserverChannelStar(cricketScore);
		System.out.println(cName+"Changing the state to 10");		
		cricketScore.setScore(10);
	}
}
