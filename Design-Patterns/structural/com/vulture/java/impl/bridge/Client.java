package com.vulture.java.impl.bridge;

/**
 * In this example the client creates a list of animals, which include both a Monkey and a Gorilla. 
 * The constructors to these objects accept a Feeding class that is passed to the Animal constructor. 
 * The Feeding class implementations both implement both feeding methods (peelFood() and crackOpen()) 
 * but in different ways.Although this is a contrived example, it illustrates that there is no dependency between 
 * Animal objects and Feeding object implementations. You are free to completely change any of the 
 * Feeding implementations, add new Animals, change Animals, and so forth, all without modifying the contract 
 * between objects. These objects implement the following bridge pattern roles: 
 * 	--Abstraction: Animal abstract class
 *     --Refined Abstraction: Monkey and Gorilla implementations of the Animal class
 *     --Implementor: Feeding abstract class
 *Concrete Implementor: BananaFeeder and CoconutFeeder As a final note, the two layers of abstraction 
 *present here can be found in the fact that we have a hierarchy of animals and a hierarchy of feeding objects. 
 *These hierarchies are simple in this example, but they could be infinitely complex with dozens of classes 
 *arranged in a deep inheritance hierarchy. But because we related the two hierarchies through containment 
 *(the abstraction contains the implementor) the two hierarchies can change, expand, and grow without affecting 
 *one another. In short, the bridge pattern is a good solution for relating a hierarchy of objects and a hierarchy 
 *of implementors. It can also wrap objects that you do not own. For example, you may have a set of transport 
 *implementors (FTP, SSH, CSP, etc.) and you use third party libraries for their implementation. They obviously 
 *will not fit into your implementor hierarchy, but you can create implementor wrappers that transform these 
 *third party libraries into a form usable by your application. In this example, the abstractions may be files and 
 *you could then inject an FTP transport or an SCP transport into the file abstractions for transport to some destination.
 *The important thing to look for in your application when considering the bridge pattern is for hierarchy of objects 
 *and a hierarchy of implementation objects that you need to relate. Hopefully after this explanation, 
 *this statement now makes sense:
 *
 *decoupling an abstraction from its implementation, so that the two can vary independently The initial confusion that 
 *I had with the definition was thinking about abstractions and implementations as being in the same hierarchy. 
 *Once you understand that the abstractions are objects and implementations perform actions on the abstractions, 
 *it all becomes clear (at least a little clearer.)
 */
import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Monkey(new BananaFeeder()));
		for (Animal animal : animals) {
			animal.eat();
		}
	}
}
