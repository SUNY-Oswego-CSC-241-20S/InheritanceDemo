package inheritancedemo;

public abstract class Pet {
    // As an abstract class, Pet cannot be instantiated

    //Instance variables
    private String name;

    // Constructor
    public Pet(String name) {
        this.name = name;
    }

    // "getter"
    public String getName(){
        return name;  // Current value in instance variable
    }

    // abstract method
    public abstract String speak(); // No implementation

}
