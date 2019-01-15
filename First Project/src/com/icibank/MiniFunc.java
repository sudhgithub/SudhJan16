package com.icibank;

public class MiniFunc implements Ministatement
{

	public static void main(String[] args) {
		
		MiniFunc F =new MiniFunc();
		F.mul();
	System.out.println(F.bb);
	
	}

	@Override
	public void mul() {
		System.out.println("I am implemented mul function in deposit Mini class");
		
	
	}

}
