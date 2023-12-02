package polymorphism.Example;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes sqaure = new Square();
        circle.area();
    }
}
