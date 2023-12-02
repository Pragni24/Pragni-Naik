package polymorphism.Types.CompileTimePolymorphism;
// compile time polymorphism or static polymorphism
//achieved by method overloading or operator overloading
public class MethodOverloading {
    /*
    when we have more than one function/method in the same class with the same name and number of arguments.
    then these functions are known as overloaded functions. Functions can be overloaded by a change in the number of
    arguments or/and a change in the type of arguments.

    different return type is not considered as overloading
     */
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(5,4));
        System.out.println(Helper.Multiply(6,4,8));
        System.out.println(Helper.Multiply(5.5,6.3));
    }

}
class Helper{
    static int Multiply(int one,int two){
        return one*two;
    }
   /*
   static int Multiply(int a,int b){
        return a*b;//method overloading,gives error
    }

    */

    static double Multiply(double one, double two){
        return one*two;
    }
    static int Multiply(int p,int q,int r){
        return p*q*r;
    }
}
