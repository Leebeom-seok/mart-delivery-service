package com.mini.exception;

public class CannotUpdateException extends Exception {
	public CannotUpdateException(){
		this("��� ������ų �� �����ϴ�.");
	}
	public CannotUpdateException(String message){
		super(message);
	}
}
