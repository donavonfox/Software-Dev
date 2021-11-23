package ie.itcarlow.lab7;

public class Vet {

	
private String name; 	


public Vet(String name) {
this.name = name;
}


public void vaccinate (Animal animal) {
 
if (animal instanceof dog)
{
System.out.println("Dog is vaccinated: " + animal);	
}//end if
else if (animal instanceof Cat)
{
System.out.println("Cat is Vaccinated:" + animal);
}

else {
System.out.println("Vet can only vaccinate dogs and cats!");
}


}//end void 





}
