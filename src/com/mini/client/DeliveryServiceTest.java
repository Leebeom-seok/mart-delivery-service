package com.mini.client;

import com.mini.dao.impl.DeliveryServiceDAOImpl;
import com.mini.dto.Mart;

import config.ServerInfo;

public class DeliveryServiceTest {

	public static void main(String[] args) {
		DeliveryServiceDAOImpl ds = DeliveryServiceDAOImpl.getInstance();
		
		// �׽�Ʈ �ڵ�
		try {
			ds.saveMart(new Mart("��ȣ", "���ؽ�"));
			ds.deleteMart("��ȣ");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("������ �������.");
		} catch(ClassNotFoundException e){
			System.out.println("������ ���������.");
		}
	}
}
