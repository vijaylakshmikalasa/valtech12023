package com.valtech.training;

public class VarArgs {
	
	//varargs should be last arg
	public int add(int a, int ... b) {
		int result = a;
		for(int b1 : b) {
			result+=b1;
		}
		return result;
		
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println(va.add(2));
		System.out.println(va.add(2,3));
		System.out.println(va.add(2,3,4));
		System.out.println(va.add(2,3,4,5));
	}

}
