package com;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Devin", "Cohen");
		
		/* test for setters and getters
		 * 
		em1.setAltEmail("test@gmail.com");
		System.out.println(em1.getAltEmail());
		
		*/
		
		System.out.println(em1.showInfo());
	}

}
