package com.velocity.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr=new int[10];
		System.out.println("Git phase1");
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		
		
		for(int x:arr)
			System.out.print("Numbers"+x);
		

	}

}
