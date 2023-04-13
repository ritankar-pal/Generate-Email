package emailapp;

import java.util.Scanner;


public class Email {

	//instance variables::
	private String firstName; 
	private String lastName; 
	private String department;
	private String email;
	private String compName = "techno.com";
	
	private String password; 
	private int defaultPasswordLength = 8;
	
	private int mailboxCapacity; 
	private String alternateEmail;
	
	
	
	//Constructor to accept the first and last name
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Welcome " + this.firstName + " "+this.lastName);
		System.out.println();
		
		
		//Call a method to ask for the dept and it will return the department::
		this.department = setDepartment();
		
		//Combined Email Address::
		this.email = this.firstName.toLowerCase()+ "." + this.lastName.toLowerCase() 
				+ "."+ this.department + "@" + compName;
		
//		System.out.println("EMAIL CREATED:: " + email);	
		
		
		//calling the method for password generation::
		this.password = randomPassword(this.defaultPasswordLength);
//		System.out.println("Your Password is:: "+ this.password);
		System.out.println();
		System.out.println("=====================================================");
	}
	
	
	//Ask for department
	private String setDepartment() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Department Codes::\n1 for Sales\n2 for "
				+ "Dev\n3 for Accounting\n0 for None\n\nEnter Department Code: ");
		
		int deptChoice = scan.nextInt();
		
		if(deptChoice == 1) {return "sales";}
		else if(deptChoice == 2) {return "dev";}
		else if(deptChoice == 3) {return "accounting";}
		else {return "";}
		
	}
	
	
	//Generate random password
	private String randomPassword(int length) {
		
		//Password will be created from the below string choices::
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$%#";
		String passGenerated = "";
		
		//creating an array of chars of the defined length; 
		char[] ar = new char[length];
		
		//creating a for-loop to fill the array ar with the char: 
		for(int i=0; i<ar.length; i++) {
			
			int rand = (int) (Math.random()*passwordSet.length());
			ar[i] = passwordSet.charAt(rand);
		}
		
		
		//looping through the filled array to return the password as a String::
		for(char elem:ar) {
			passGenerated += elem;
		}
		return passGenerated;
			
	}
	
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Alternate Email Address 
	public void setAlternameEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Set to change the password
	public void setChangePassword(String password) {
		this.password = password;
	}
	
	
	
	//get methods for the above set methods::
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternameEmail() {
		return alternateEmail;
	}
	public String getChangePassword() {
		return password;
	}
	
	
	//Displaying the info:: 
	public String showInfo() {
		return "Your Company Email:: " + this.email + 
				"\nYour Password:: " + this.password +
				"\nMailbox Capacity:: " + this.mailboxCapacity + "mb";
	}
	
}







