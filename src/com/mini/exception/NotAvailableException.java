package com.mini.exception;

public class NotAvailableException extends Exception {
	public NotAvailableException(){
		this("�̿��� �� �ִ� ��Ʈ�� �����ϴ�.");
	}
	public NotAvailableException(String message){
		super(message);
	}
}
