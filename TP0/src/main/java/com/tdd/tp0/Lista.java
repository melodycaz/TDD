package com.tdd.tp0;

public class Lista {
	protected Nodo cabecera;
	protected Nodo ultimo;
	protected int tamano;

	public Lista(){
		cabecera = null;
		ultimo = null;
		tamano = 0;
	}
	
	public int obtenerTamano(){
		return tamano;
	}
	
	public void insertarElemento(Object dato){
	  Nodo nodo = new Nodo(dato);
		if (estaVacia()){
		  cabecera = nodo;
		  ultimo = nodo;		
		}else{
			ultimo.setearSiguiente(nodo);
			ultimo = nodo;
		}
	  tamano ++;
	}
	
	public void removerElemento() throws AssertionError{
		try
		{
			cabecera = cabecera.obtenerSiguiente();
			this.tamano--;
		}
		catch (Exception ex)
		{
			throw new AssertionError("Exception: Intenta desencolar de una cola vacia.");
		}
	}
	
	public Object obtenerCabecera() throws AssertionError{
		try
		{
			return cabecera.obtenerDato();
		}
		catch (Exception ex)
		{
			throw new AssertionError("Exception: Intenta obtener elemento de una cola vacia.");
		}	
	}

	public boolean estaVacia(){
		return this.tamano == 0;
	}
		
}
	



	
