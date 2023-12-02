package Inheritance;

public class hierarchialInheritance {
    public static void main(String[] args) {
        cat c = new cat();
        c.meow();
        c.eat();
        dog d = new dog();
        d.bark();
        d.eat();
    }
}
class Animal2{
    void eat(){
        System.out.println("Is eating!");
    }
}
class dog extends Animal2{
    void bark(){
        System.out.println("is barking!");
    }
}
class cat extends Animal2{
    void meow(){
        System.out.println("Is meowing!");
    }
}