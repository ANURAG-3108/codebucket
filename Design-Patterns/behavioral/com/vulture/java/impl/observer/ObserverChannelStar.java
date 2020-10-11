package com.vulture.java.impl.observer;

public class ObserverChannelStar extends CricketObserver{
	
	public ObserverChannelStar(CricketScore cricScore) {
		this.cricketscore = cricScore;
		this.cricketscore.attach(this);
	}

	@Override
	public void updateScore() {
		System.out.println("CricketObserverChannelStar :: Updated Score is "+cricketscore.getScore());
		cricketscore.getScore();
	}	

}
