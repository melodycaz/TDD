package com.tdd.tp0;


public class Cola extends Lista implements Queue{
	
	public Cola(){}
	
	public void add (Object dato){
		   insertarElemento(dato);	 
	}
	
	public void remove() throws AssertionError{	
		removerElemento();
	}

	public boolean isEmpty() {
		return this.estaVacia();
	}

	public int size() {
		return this.obtenerTamano();
	}

	public Object top() throws AssertionError {
		return this.obtenerCabecera();
	}

}