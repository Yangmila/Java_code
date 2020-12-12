package experiment04;

import experiment02.picture;

public class Computer {
	public static int add(int a,int b){
		System.out.println(a+b);
		return 0;
	}
	public static int sub(int a,int b){
		System.out.println(a-b);
		return 0;
	}
	public static int multi(int a,int b){
		System.out.println(a*b);
		return 0;
	}
	public static int div(int a,int b){
		System.out.println(a/b);
		return 0;
	}

	public static void main(String[] args){
		Computer.add(12,3);
		Computer.sub(12,3);
		Computer.multi(12,3);
		Computer.div(12,3);
		
	}
	
}
