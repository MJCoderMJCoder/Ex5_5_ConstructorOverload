package com.constructoroverload;

public class ConstructorOverload {

	public static void main(String[] args) {
		Point p1 = new Point();		//声明p1对象，并创建p1；立即调用构造方法实例化对象
		Point p2 = new Point(3, 4);
		System.out.println("p1的原点为(" + p1.x + "," + p1.y + ")");
		System.out.println("p2的原点为(" + p2.x + "," + p2.y + ")");
	}

}
