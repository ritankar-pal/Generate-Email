package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		//Creating the object of the email class:: 
		
		Email e = new Email("Ritankar", "Pal");
		e.setMailboxCapacity(30);
		System.out.println(e.showInfo());

	}

}
