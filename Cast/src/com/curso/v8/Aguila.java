package com.curso.v8;

public class Aguila extends Ave {
	
	String tipo = "Tipo Aguila";
	
	@Override
	void volar() {
		System.out.println("Aguila volar");
	}
	
	void volarAguila() {
		System.out.println("Método volarAguila()");
	}

}
