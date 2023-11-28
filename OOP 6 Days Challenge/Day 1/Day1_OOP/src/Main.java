
public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        //declaring reference to object
        Student student1;

        // allocate a student to an object
        student1 = new Student();
        student1.rno=12;
        student1.name="Pragni";
      //  student1.marks=80.7F;
        student1.greeting();
        Student student3 = new Student(13,"Pragni Naik",89);
        student3.display();


        System.out.println(student1);
        System.out.println(student1.rno);
        System.out.println(student1.marks);
        System.out.println(student1.name);
        Student random = new Student();
        System.out.println(random.marks);
        System.out.println(random.rno);
        System.out.println(random.name);
    }
}

    //creating class in Java
    class Student{
        int rno;
        String name;
        float marks;
        //adding functions in class
        void greeting(){
            System.out.println("Hello my name is "+this.name);
        }

        //creating constructor
        Student(){
            //this.name="Pragni";
            //this.rno=27;
            //this.marks=90.2f;

            //calling a constructor from another constructor
            this(20,"default person",100.0f);
        }
        Student(int rollno,String name,float marks){
            this.rno=rollno;
            this.name=name;
            this.marks=marks;
        }
        void display(){
            System.out.println(rno+" "+name+" "+marks);
        }
    }
