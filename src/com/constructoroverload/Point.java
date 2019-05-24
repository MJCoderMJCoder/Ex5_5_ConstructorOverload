package com.constructoroverload;

public class Point {
	int x;
	int y;
	public Point() {	//无参构造方法
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {	//
		this.x = x;		//通过this引用成员变量
		this.y = y;		//this表示每个实例对象指向自己的引用，代表实例对象自身
	}

}
