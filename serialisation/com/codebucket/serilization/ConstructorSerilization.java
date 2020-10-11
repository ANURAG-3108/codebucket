package com.codebucket.serilization;

import java.io.Serializable;

public class ConstructorSerilization implements Serializable{
	public int check;
	
	
	public ConstructorSerilization() {
		check = 10;
		System.out.println("Calling Cons");
	}
	
	public void modifyValue(){
		check = 20;
	}
	
}
