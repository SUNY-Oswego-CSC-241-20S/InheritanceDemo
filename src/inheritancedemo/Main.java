package inheritancedemo;

public class Main {

    public static void main(String[] args) {
	// Pet p1 = new Pet("Bradley"); // This statement is not allowed if Pet is abstract

        Dog d1 = new Dog("Abby");
        Dog d2 = new Dog("Rom");
        Cat c1 = new Cat("Todd");
        Cat c2 = new Cat("Rosie");

        // We can create an array of Pet object references
        Pet [] myPets = new Pet[4];
        myPets[0] = c1;
        myPets[1] = c2;
        myPets[2] = d1;
        myPets[3] = d2;

        // All pets can speak
        for(Pet p : myPets) {
            System.out.println(p.getName() + " says " + p.speak());
        }




    }
}
