package Inheritance;

public class multilevelInheritance {
    public static void main(String[] args) {
        childDog d = new childDog();
        d.bark();
        d.eat();
        d.weep();
    }


}class Animal1{
    void eat(){
        System.out.println("Is eating a bread!");
    }
}
class Dog1 extends Animal1 {
    void bark(){
        System.out.println("Is barking over a thief");
    }
}

class childDog extends Dog1{
    void weep(){
        System.out.println("Is weeping!");
    }
}
