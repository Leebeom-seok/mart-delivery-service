package com.mini.exception;

public class DuplicateException extends Exception {
	public DuplicateException(){
		this("�̹� �����ϴ� ���Դϴ�.");
	}
	public DuplicateException(String message){
		super(message);
	}
}
