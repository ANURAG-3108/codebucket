package com.vulture.java.impl.adapter;

/**
 * The HighPerformanceEngine class wraps the TwinTurboEngine class and adapts, or translates, Engine methods to
 *  TwinTurboEngine methods. The mapping does not have to be one-to-one in order to use this pattern. For example, 
 *  the decelerate() method does not just invoke a single TwinTurboEngine, but adapts the decelerate() call to the 
 *  disengage() and brake() calls. The TwinTurboEngine could require an additional TurboTimer class to be used
 *   during acceleration or any number of other helper classes. The point is that we found an object that we wanted to 
 *   use in our application and so we created an adapter class that is able to be used in our application that makes use of the 
 *   object or objects that accomplish our business objective.
 *
 */
public class HighPerformanceEngine extends Engine {
	private TwinTurboEngine twinTurbo = new TwinTurboEngine();

	public HighPerformanceEngine() {
		 super( "High Performance" );
	}

	public void start() {
		twinTurbo.turnOn();
	}

	public void stop() {
		twinTurbo.turnOff();
	}

	public void accelerate() {
		twinTurbo.engage();
	}

	public void decelerate() {
		twinTurbo.disengage();
		twinTurbo.brake();
	}
}
