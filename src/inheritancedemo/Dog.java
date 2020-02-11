package inheritancedemo;

public class Dog extends Pet{
    // Dog inherits all the public variables and methods from Pet

    public Dog(String name) {
        super(name);  // Call parent constructor to initialize the private variable in the parent class
    }

    // This method can only be called on Dog objects
    public String bark(){
        return "Woof!";
    }

    @Override
    public String speak() {
        return this.bark(); // Use the value that is also returned by the bark method()
    }

}
