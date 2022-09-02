package P2;

import java.util.Scanner;

class Railway_Reservation
{
	Scanner r=new Scanner(System.in);
	void main_menu() throws Exception
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~MAIN MENU~~~~~~~~~~~~~~~~~~~~~~~~~\n1. Admin Mode\n2. User Mode\n3. Exit");
		int ch=r.nextInt();
		switch(ch)
		{
			case 1: admin_log();
				break;
			case 2: u_user_login();
				break;
			default:System.out.println("");
				   System.exit(0);
				break;
		
		}
			
	}
	void admin_log() throws Exception 
	{
		System.out.print("Enter password : ");
		String ps=r.next();
		if(ps.equals("toluene"))
		{
			admin_mode();
		}
		else
		{
			System.out.println("Wrong password contact to the creator!!!!!!");
			main_menu();
		}
	}
	
		
	void admin_mode() throws Exception
	{
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ADMINISTRATOR MENU~~~~~~~~~~~~~~~~~~~~~~~~~\n1. Create detail database of trains\n2. Add Details of trains\n3. Display all the database of trains\n4. Display Chart of a train\n5. Display all users\n6. Update train date\n7. Return to main menu \n8. Exit");
		int ch=r.nextInt();
		switch(ch)
		{
			case 7:main_menu();
				break;	
			default:System.out.println("");
					System.exit(0);
				break;
		}
		
	}
	
	void u_user_login() throws Exception
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~WELCOME TO USER MENU~~~~~~~~~~~~~~~~~~~~~~~~~\n1. Login\n2. Sign Up\n3. Return to main menu\n4. Exit");
		int ch=r.nextInt();
		switch(ch)
		{
			
			case 3:main_menu();
				break;
			default:System.out.println("");
					System.exit(0);
				break;
		}
	}
	
	public static void main(String args[]) throws Exception
	{
	System.out.println("**************************************************************************************************************");
	System.out.println("                                      RAILWAY RESERVATION SYSTEM                                              ");
	System.out.println("**************************************************************************************************************");
		System.out.println();
		System.out.println();	
		Railway_Reservation rail=new Railway_Reservation();
		rail.main_menu();
	}			
}