package com.algaworks.osworks.domain.excepetion;

public class EntidadeNaoEncontradaException extends NegocioExcepetion{

	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontradaException(String message) {
		super(message);
	}

}
