package com.tdd.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodoTest {

	@Test
	public void obtenerDatoTest() {
		Nodo nodo = new Nodo(1);
		Object dato = nodo.obtenerDato();
		
		assertEquals(1,dato);
	}
	
	@Test
	public void obtenerSiguienteTest() {
		Nodo nodo1 = new Nodo(1);
		Nodo nodo2 = new Nodo(2);
		nodo1.setearSiguiente(nodo2);
		
		assertEquals(nodo2,Nodo.obtenerSiguienteNodo(nodo1));
	}
	
	@Test
	public void igualNodoTest() {
		Nodo nodo1 = new Nodo(1);
		Nodo nodo2 = new Nodo(1);
		
		assertTrue(Nodo.igualNodo(nodo1, nodo2));
	}
	
}
