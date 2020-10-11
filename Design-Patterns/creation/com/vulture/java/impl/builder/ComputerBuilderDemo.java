package com.vulture.java.impl.builder;


public class ComputerBuilderDemo {
	
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("", "").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
	}

}
