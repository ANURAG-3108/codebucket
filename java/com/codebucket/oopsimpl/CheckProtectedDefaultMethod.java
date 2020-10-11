package com.codebucket.oopsimpl;

import com.codebucket.oops.ProtectedMethod;

public class CheckProtectedDefaultMethod extends ProtectedMethod { //DefaultMethod{

// As we can not used the default method in the another package but we can use the protected method in another package. 
//	We are not able to override the defaultMethodAccesibility() method.
	
	@Override
	protected void protectedMethodAccesslibity() {
		System.out.println("Calling the parent method");
		super.protectedMethodAccesslibity();
	}

	public static void main(String [] args){
		CheckProtectedDefaultMethod main = new CheckProtectedDefaultMethod();
		main.protectedMethodAccesslibity();
	}

/*	@Override
	void defaultMethodAccesibility() {
		System.out.println("Calling from main class CheckProtectedDefaultMethod");
		super.defaultMethodAccesibility();
	}
*/	
	

}
