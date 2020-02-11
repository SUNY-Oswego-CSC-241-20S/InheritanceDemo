package inheritancedemo;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public String meow(){
        return "Meow.";  // Only can be called on Cat objects
    }

    @Override
    public String speak() {
        return this.meow();  // Use the value returned by meow method
    }
}
