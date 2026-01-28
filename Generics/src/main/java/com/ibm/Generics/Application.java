package com.ibm.Generics;
class Point<T extends Number>{
	private T x;
	private T y;
	
	public Point(T x,T y) {
		this.x=x;
		this.y=y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point<Float> point=new Point<Float>(2.3f,3.4f);
		System.out.println(point.getX()+","+point.getY());
		Point<Integer> point1=new Point<Integer>(2,3);
		System.out.println(point1.getX()+","+point1.getY());
	}
}