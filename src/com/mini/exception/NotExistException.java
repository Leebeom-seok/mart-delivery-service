package com.mini.exception;

public class NotExistException extends Exception {
	public NotExistException(){
		this("�������� �ʴ� ���Դϴ�.");
	}
	public NotExistException(String message){
		super(message);
	}
}
