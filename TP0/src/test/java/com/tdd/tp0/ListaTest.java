package com.tdd.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTest {
	
	@Test
	public void obtenerTamanoTest() {
		Lista lista = new Lista();
		lista.insertarElemento(1);
		int tamano = lista.obtenerTamano(); 
		
		assertEquals(tamano, 1);
	}

	@Test
	public void insertarUnElementoTest() {
		Lista lista = new Lista();
		lista.insertarElemento(1);
		Object cabeceraDato = lista.obtenerCabecera();
		int tamano = lista.tamano;
		
		assertEquals(1,cabeceraDato);
		assertEquals(1,tamano);
	}
	
	@Test
	public void insertarUnElementoNuloTest() {
		Lista lista = new Lista();
		lista.insertarElemento(1);
		lista.insertarElemento(2);
		lista.insertarElemento(3);
		int tamano = lista.tamano;
		
		assertEquals(3,tamano);
	}
	
	@Test
	public void insertarVariosElementosTest() {
		Lista lista = new Lista();
		lista.insertarElemento(null);
		Object cabeceraDato = lista.obtenerCabecera();
		int tamano = lista.tamano;
		
		assertEquals(null,cabeceraDato);
		assertEquals(1,tamano);
	}
	
	@Test
	public void removerElementoTest() {
		Lista lista = new Lista();
		lista.insertarElemento(1);
		lista.removerElemento();
		int tamano = lista.tamano;
		
		assertEquals(0,tamano);
	}
	
	@Test(expected = AssertionError.class)
	public void removerElementoDeListaVaciaTest(){
		Lista lista = new Lista();
		lista.removerElemento();
	}
	
	@Test(expected = AssertionError.class)
	public void obtenerCabeceraDeListaVaciaTest(){
		Lista lista = new Lista();
		lista.obtenerCabecera();
	}
	
	@Test
	public void estaVaciaTest(){
		Lista lista = new Lista();
		assertTrue(lista.estaVacia());	
	}
	
}	