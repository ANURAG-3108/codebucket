package com.vulture.java.impl.adapter;

/**
 * Have you ever been in the situation where youre building an application, you have most of the work done, 
 * but theres one piece that you dont necessarily want to write from scratch because there is a nearly perfect 
 * existing implementation? The problem is that its nearly perfect, but it doesnt fit into your object hierarchy 
 * and because you didnt write it, youre not free to change it. Do you look at this perfect fit for your application 
 * as the basis to rebuild it from scratch or do you try to find a way to adapt it to work in your application?
 * As an example consider a company that builds cars. Cars require engines and so your application has built an 
 * abstract Engine base class and two classes that extend Engine and provide concrete functionality. A class diagram .
 * The supposition here is that you can develop new engines that extend the Engine class and and there will be a
 *  consumer object that will use engines through the methods exposed in the Engine base class. 
 *  For example, there will probably be a Car class that will know how to work with engines by invoking 
 *  methods such as start(), stop(), accelerate(), and decelerate(). Listings 1, 2, and 3 show implementations
 *   of the engines and listing 4 shows an implementation of the Car class.
 *   
 *   Now consider that you found a new engine: a twin turbo engine. Fuel economy is definitely not what this engine 
 *   is about, but you want to be able to upgrade your car offering to include a sportier model. The problem is that the 
 *   TwinTurboEngine class is not compatible with your Engine hierarchy. As a matter of fact it may have an 
 *   elaborate hierarchy of its own and not even provide methods like accelerate() and decelerate(). 
 *   In this example consider that accelerate is engage() and decelerate is disengage(). Its a great engine, 
 *   but you cannot pass it to a Car class because it only accepts engines that extend your Engine class. 
 *   Do you throw away the perfect addition to your product line and start building your own engine?
 *   This is where the Adapter pattern comes in. The Gang of Four define the Adapter pattern with the following intent:
 *   Convert the interface of a class into another interface that the clients expect. Adapter lets classes work together 
 *   that could not otherwise because of incompatible interfaces. The strategy is to wrap the foreign object with a 
 *   new object that fits into your object hierarchy. The adapter pattern is predicated upon inheritance and 
 *   specifically polymorphism: use it when you have a polymorphic relationship (such as a Car class that uses 
 *   engines through the Engine base class) and you need to fit another class into the 
 *   polymorphic relationship. For example, listing 5 shows code for the new HighPerformanceEngine class.
 *   
 */
public abstract class Engine {
	
	protected String name;

	  public Engine( String name ) {
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }

	  public abstract void start();
	  public abstract void stop();
	  public abstract void accelerate();
	  public abstract void decelerate();

}
