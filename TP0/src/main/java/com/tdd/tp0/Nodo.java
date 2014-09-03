package com.tdd.tp0;

public class Nodo {
	private Object dato;
	private Nodo siguiente;
	
	public Nodo (){
		this.dato = null;
		this.siguiente = null;
	}
	
	public Nodo (Object dato){
		this.dato = dato;
	}
	
	public Object obtenerDato() {
		return this.dato;
	}
	public void setearDato(int dato) {
		this.dato = dato;
	}
	
	public Nodo obtenerSiguiente() {
		return this.siguiente;
	}
	
	public void setearSiguiente(Nodo nodoSiguiente) {
		this.siguiente = nodoSiguiente;
	}
	
	public static boolean igualNodo(Nodo nodo1, Nodo nodo2){
		return nodo1.dato==nodo2.dato;
	}

	public static Nodo obtenerSiguienteNodo(Nodo nodo){
		return nodo.siguiente;
	}

}











