package com.vulture.java.impl.adapter;

public class MediumPerformanceEngine extends Engine{
	public MediumPerformanceEngine() {
	    super( "Medium Performance" );
	  }

	  public void start() {
	    System.out.println( "Started the " + name + " engine." );
	  }
	  public void stop() {
	    System.out.println( "Stopped the " + name + " engine." );
	  }
	  public void accelerate() {
	    System.out.println( "Speed increased by 5 mph." );
	  }
	  public void decelerate() {
	    System.out.println( "Speed decreased by 5 mph." );
	  }

}
