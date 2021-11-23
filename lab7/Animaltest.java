package ie.itcarlow.lab7;

	// Author 			: Donavon Fox
	// Date 			: Nov-2021
	// Purpose 			: A test driver program for our Animal class

public class Animaltest
	{
public static void main (String args[])
{
			Animal dog = new dog("Poodle", 4, 'M');
			System.out.println(dog);
			dog.eat();
			dog.sleep();
			dog.makeSound();
			
			System.out.println();
			
			Animal cat = new Cat("Tom", 2, 'F');
			System.out.println(cat);
			cat.eat();
			cat.sleep();
			cat.makeSound();

			System.out.println();

			Animal cow = new Cow("Daisy", 3, 'F');
			System.out.println(cow);
			cow.eat();
			cow.sleep();
			cow.makeSound();

			
			Vet vet = new Vet ("Alice Byrne");
			vet.vaccinate(dog);
			vet.vaccinate(cat);
			vet.vaccinate(cow);
			
			}//end main
	}//end class

