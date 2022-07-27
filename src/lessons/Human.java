/**
 * 
 */
package lessons;

/**
 * @author Руся
 *
 */
public class Human{
	
	private String name;
	private byte age;
	private String sex;
	
	public Human(String name, byte age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex.substring(0, 1).toUpperCase() + sex.substring(1);
	}


	public String getName() {
		return this.name;
	}
  
	public byte getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public void printValue() {
		System.out.println("You have set name" + " " + "\"" + this.name + "\"." + "\n");
		System.out.println("You have set age" + " " + "\"" + this.age + "\"." + "\n");
		if (this.sex.isEmpty()) {
			System.out.println("You have not set your sex.");
		} else {
			System.out.println("You have set sex" + " " + "\"" + this.sex + "\"." + "\n");
		}
	}
}
