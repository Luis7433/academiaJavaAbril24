package com.curso.v3;

public class ComputadoraLinux implements Computadora {
	
	String version;

	public ComputadoraLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender Linux: "+version);
	}
	

}
