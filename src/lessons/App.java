 /**
 * 
 */
package lessons;

import java.util.*;

/**
 * @author Руся
 *
 */
public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		App.supervisor();
	}
	
	private static void supervisor() {
		Scanner scan = new Scanner(System.in);

		String name = App.name(scan);
		
		byte age = App.age(scan);
		scan.nextLine();
		
		String sex = App.sex(scan);

		scan.close();
		
		App.objHumanClass(name, age, sex);
	}
	
	private static void objHumanClass(String name, byte age, String sex) {
		Human human = new Human(name, age, sex);
		
		System.out.println("Values sets!");
		
		human.printValue();
	}
	
	private static String name(Scanner scan) {
		String name;
		
		do {
			System.out.println("Enter name which yo want to set:" + " ");
			
			name = scan.nextLine();
			
			if (name.isEmpty()) {
				System.out.println("Name cannot be empty. Try again!");
			}
			
		} while (name.isEmpty());
		
		return name;
	}
	
	private static byte age(Scanner scan) {
		byte age;
		
		do {
			System.out.println("Enter age which yo want to set:" + " ");
			
			if (!scan.hasNextByte()) {
				System.out.println("Age can be number!");
				Scanner newScan = new Scanner(System.in);
				return App.age(newScan);
			} 
			
			age = scan.nextByte();
			
			if (age < 0) {
				System.out.println("Age cannot be negative. Try again!");
			} else if (age > 121) {
				System.out.println("Age cannot be too old age. Try again!");
			}
		} while (age < 0 || age > 121);
		
		return age;
	}
	
	private static String sex(Scanner scan) {
		String sex;
		boolean invalid;
		
		do {
			System.out.println("Enter sex which yo want to set [Man\\Woman\\Intersex]:" + " ");
		
			sex = scan.nextLine() ;
			
			switch (sex) {
				case "Man" :				
				case "man" :
				case "Woman" :
				case "woman" :  
				case "Intersex" : 
				case "intersex" : {
					invalid = false;
					break;
				}
				default : 
					System.out.println("Empty or invalid value. Try again!");
					invalid = true;
				}
			
		} while (invalid);
		return sex;
	}
	
}	  