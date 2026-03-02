package firstProject;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month");
		byte month = sc.nextByte();
		
		sc.nextLine();

		switch (month) {
		case 2:
			System.out.println("Enter year");
			int year = sc.nextInt();
			sc.nextLine();
			
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not a Leap Year");
			}
			break;
		
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	    		System.out.println("31 days");
	    		break;
	    		
	    case 4:
	    case 6:
	    case 9:
	    case 11:
		    	System.out.println("30 days");
	    		break;
		}
	}

}
