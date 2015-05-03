package com.java.scu.GeneralJavaQuestions;

class ClassA{
	public int i = 10;
	public static int j = 20;
	private static final int k = 30;
	
	public void method1(){
		System.out.println("Class A: method 1");
	}
	public static void method2(){
		System.out.println("Class A : method 2");
	}
}
class ClassC extends ClassA{
	public int i = 1;
	public static int j = 2;
	private static final int k = 3;
	
	public void method1(){
		System.out.println("Class B: method 1");
	}
	public static void method2(){
		System.out.println("Class B : method 2");
	}
}
public class ClassB extends ClassC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.method1();
		
		

	}

}
