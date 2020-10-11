package com.codebucket.serilization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizeSerialization implements Serializable{
	String username = "Demouser";
	String password = "1111";

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String ePassword = "epwd" + password;
		os.writeObject(ePassword);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String ePassword = (String) is.readObject();
		password = ePassword.substring(4);
	}

}
