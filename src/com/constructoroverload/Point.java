package com.constructoroverload;

public class Point {
	int x;
	int y;
	public Point() {	//�޲ι��췽��
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {	//
		this.x = x;		//ͨ��this���ó�Ա����
		this.y = y;		//this��ʾÿ��ʵ������ָ���Լ������ã�����ʵ����������
	}

}
