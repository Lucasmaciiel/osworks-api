package com.algaworks.osworks.domain.excepetion;

public class NegocioExcepetion extends RuntimeException {

	public static final long serialVersionUID = 1L;
	
	public NegocioExcepetion(String message) {
		super(message);
	}
}
