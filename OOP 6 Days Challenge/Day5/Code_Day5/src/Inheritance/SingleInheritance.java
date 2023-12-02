package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }


}
class Animal{
    void eat(){
        System.out.println("Is easting a bread!");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Is barking over a thief");
    }
}
