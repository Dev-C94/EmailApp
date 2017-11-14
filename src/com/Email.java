package com;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String emailDomain = "company.com";
	private String password;
	private int defaultPwLength = 8;
	private String altEmail;
	private int mailboxCapacity = 500; //in MB
	private String email;
	
	
	//constructor for firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("Email created for " + firstName + " " + lastName);
		
		//call method asking for department and return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call method for return random password
		this.password = randomPassword(defaultPwLength);
		System.out.println("\nYour randomly generated password is: " + this.password + "\n");
		
		//concatenate the email elements
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + 
				department.toLowerCase() + "." + emailDomain;
		//System.out.println("Your email is: " + email);
		
	}
	
	//get department
	private String setDepartment() {
		System.out.print(" DEPARTMENT CODES AS FOLLOWED:\n1 for Sales\n2 for Development\n3 for accounting\n0 for none\nEnter the department code: ");
		Scanner input = new Scanner(System.in);
		int deptCode = input.nextInt();
		if(deptCode == 1) {return "Sales";}
		else if(deptCode == 2) {return "Development";}
		else if(deptCode == 3) {return "Accounting";}
		else{return "";}
	}
	
	//generate random password
	public String randomPassword(int length) {
		String pwSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * pwSet.length());
			password[i] = pwSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//set method for changing the password
	public void setNewPassword(String password) {
		this.password = password;
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alt email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	//get methods to initialize new values
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAltEmail() {return altEmail;}
	public String getPassword() {return password;}
	
	//show all the info
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
}




















