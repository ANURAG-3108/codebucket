package com.vulture.java.impl.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketScore {
	List<CricketObserver> cricketObservers = new ArrayList<CricketObserver>();
	int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		System.out.println("CricketScore :: Got updated state "+score);
		this.score = score;
		notifyAllObserver();
	}

	public void attach(CricketObserver observer) {
		cricketObservers.add(observer);
	}

	private void notifyAllObserver() {
		System.out.println("CricketScore :: Notifying all the observer with score "+score);
		for (CricketObserver observer : cricketObservers) {
			observer.updateScore();
		}

	}

}
