package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] data = new int[] {10, 20, 30, 40, 50};
		 int sum=0;
		 int average=0; 
		 
		 for (int i=0; i<5; i++) {
			 System.out.println(10*(i+1));
			 sum += data[i];
			 average = sum/5;
			 
		 }
		 
		 System.out.println("평균은 " + average + " 입니다.");
	}
	

}
