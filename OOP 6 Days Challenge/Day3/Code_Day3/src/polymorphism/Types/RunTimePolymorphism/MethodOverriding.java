package polymorphism.Types.RunTimePolymorphism;
/* run time or dynamic method dispatch polymorphism.achieved by method overriding*/
public class MethodOverriding {
    /*
    In a simple language, when we have two classes, one
     is child class, and the other is parent class, and when we write the same function in both the child class and the parent class, the method is said to be overridden.
     This concept is known as runtime polymorphism because the
      compiler will decide at runtime to which function it will call during the program's execution.
     */
    public static void main(String[] args) {
        vehicle pqr = new car();
        pqr.run();
        vehicle abc = new vehicle();
        abc.run();
    }
}
class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }

}
class car extends vehicle{
    void run(){
        System.out.println("car running");
    }
}
