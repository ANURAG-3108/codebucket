package com.vulture.java.impl.bridge;


/**
 * 
 * The Bridge pattern is a structural design pattern with the intent of decoupling an abstraction from its implementation, 
 *  so that the two can vary independently (from the gang of fours Design Pattern book.) If this sounds a little confusing, 
 * dont worry, it is. I performed considerable research to find you good references for the Bridge Pattern and the best 
 * that I found is in the Design Patterns Explained: A New Perspective on Object-Oriented Design, Second Edition by 
 * Alan Shalloway and James Trott, which describes this definition with the following commentary:
 *     
 * I remember exactly what my first thoughts were when I read this: Huh?
 * And then: How come I understand every word in this sentence, but I have no idea what it means?
 * While comical, I believe that the authors crystallized my initial thoughts when I first encountered the bridge pattern. 
 * While it sounds simple, it is rather complex, but that complexity introduces a very powerful design pattern. 
 * The basic premise behind the bridge pattern is that you have a set of related objects (through inheritance) and 
 * you have a set of objects that perform some operations on those objects and you want to be able to change both
 * sets of objects without breaking the loose coupling between them.
 * The example that the authors presented was a set of shapes (a circle and a rectangle) and two different drawing
 * programs that know how to draw shapes (but differently.) The point was that the author wanted to be able to 
 * add additional drawing programs as well as shapes without introducing redundancy or complex inheritance
 * hierarchies. A good description of the bridge pattern is defining two layers of abstraction: abstracting 
 * objects and abstracting objects that perform actions on the first group of objects.The bridge pattern is 
 * composed of the following components: Abstraction: defines the abstract interface for the set of related objects 
 * (e.g. the Shape class) Refined Abstraction: extends the abstract interface and provides specific functionality 
 * (e.g. Circle and Rectangle)
 *        
 * Implementor: defines the interface for the implementation classes (e.g. the drawing interface)
 * Concrete Implementor: implementations of the implementor interface (e.g. drawing program 1 and drawing program 2)
 * I think that an example will really bring this pattern to light. In this example I have a set of Animal objects and a set of 
 * feeding objects. The animals eat, but they eat differently. The feeding objects are used by animals to eat their food, 
 * but they perform differently. The following code shows how you might represent these classes:
 *
 *
 *BRIDGE DESING PATTERN : Its nothing but the bridging of classes. Here we are creating bridge between monkey 
 *and BananaFeeding. In client class when we call the animal object (animals.add(new Monkey(new BananaFeeder()));)
 *and pass the values of monkey to create the monkey which is banana feeding then it will call the Monkey class which 
 *is internally call the feeding class .Thus here we are creating the a bridge between multiple classes > BridgeDesingPattern 
 */
public abstract class Animal {

	 protected Feeding feeding;
	  public abstract void eat();

	  protected Animal( Feeding feeding ) {
	    this.feeding = feeding;
	  }

	  protected void peelFood() {
	    feeding.peelFood();
	  }

	  public void crackOpen() {
	    feeding.crackOpen();
	  }
	}
