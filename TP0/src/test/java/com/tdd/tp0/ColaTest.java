package com.tdd.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColaTest {

	@Test
	public void addUnElementoTest() {
		Cola cola = new Cola();
		cola.add(1);
		Object datoNodoEncolado= cola.cabecera.obtenerDato();
		
		assertEquals(1,datoNodoEncolado);
		assertEquals(1, cola.obtenerTamano());
	}
	
	@Test
	public void comprobarCabeceraVariosElementosTest() {
		Cola cola = new Cola();
		cola.add(1);
		cola.add(2);
		Object cabecera= cola.cabecera.obtenerDato();
		
		assertEquals(1,cabecera);
	}
	
	@Test
	public void comprobarTamanoVariosElementosTest() {
		Cola cola = new Cola();
		cola.add(1);
		cola.add(2);
		cola.add(3);
		int tamano = cola.obtenerTamano();
		
		assertEquals(3,tamano);
	}
	
	@Test
	public void removeTest(){
		Cola cola = new Cola();
		cola.add(1);
		cola.add(2);
		cola.add(3);
		cola.remove();
		
		assertEquals(2,cola.top());
		assertEquals(2,cola.size());
		
	}
	
	@Test(expected = AssertionError.class)
	public void removeDeColaVaciaTest(){
		Cola cola = new Cola();
		cola.remove();
	}

	@Test
	public void isEmptyTest(){
		Cola cola = new Cola();
		
		assertTrue(cola.isEmpty());
	}
	
	@Test
	public void topTest(){
		Cola cola = new Cola();
		cola.add(1);
		cola.add(2);
		cola.add(3);
		
		Object elementTop= cola.top(); 
		
		assertEquals(1,elementTop);
	}
	
	@Test(expected = AssertionError.class)
	public void topDeColaVaciaTest(){
		Cola cola = new Cola();
		Object dato = cola.top();
	}
	
}
