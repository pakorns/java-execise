package com.java63;

public class Exercise2 {
	public static void main(String[] args) {
		String str1,str2; 
		str1="Somsak"; str2 = "Somsak";
		System.out.println("getByte :" + str1.getBytes());
		System.out.println("Lower case :"+ str1.toLowerCase());
		System.out.println("Upper case : " + str2.toUpperCase());
		if(str1.equals(str2)) {
			System.out.println("Equals");
		}
		
	}

}
