package mrigendra_fopoopslab1;

import java.util.Scanner;

public class DriverClass {
public static void main(String[] args) {
		
		Employee emp = new Employee("Mrigendra", "kumar");      
		CredentialServices cs = new CredentialServices();            
		String createdEmail;                                                 
		String createdPassword;        
		
	
		
		System.out.println("Choose your Department from the following list:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);  
		int input = sc.nextInt();
		
		
		switch (input) {
		
		case 1:{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "tec");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;
		}
		case 2:{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "adm");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;

}
			
		case 3 :{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;
}
			
		case 4:{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "leg");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;
}
			
	}

}
}


