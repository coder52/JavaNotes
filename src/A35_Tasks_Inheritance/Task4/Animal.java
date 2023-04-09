package A35_Tasks_Inheritance.Task4;

public class Animal {
	
	private int id;	
	
	private String name;
	private String colour;
	private int age;
	private Gender gender;
	private String orginCountry;
	
	public Animal() {}
	
	public Animal(String name) {this.name = name;}
	
	public Animal(int id, String name, String colour, int age, Gender gender, String Country) {
		
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.gender = gender;
		this.orginCountry = Country;
		
		}
	
	public int getId() {return this.id;}
	
	public String getName() {return this.name;}	
	
	public String getColour() {return this.colour;}
	
	public int getAge() {return this.age;}
	
	public Gender getGender() {	return this.gender;}
	
	public String getOrginCountry() {return this.orginCountry;}
	
	public String noise()	{
		
		return "Not overriden.";
		
	}
	
	public String eat()	{
		
		return "Not overriden.";
		
	}
	
	public String sleep()	{
		
		return "Not overriden.";
		
	}
	
	public String toString() {
		
		return  "\n" + getClass().getSimpleName() +
				"\nId :"	+ this.getId() +
				"\nName :" + this.getName() +
				"\nColour :" + this.getColour() +
				"\nAge :" + this.getAge() +
				"\nGender :" + this.getGender() +
				"\nOrgin Country :" + this.getOrginCountry() +
				"\nNoise :" + this.noise() +
				"\nEat :" + this.eat() +
				"\nSleep :" + this.sleep();	
		
	}

}
