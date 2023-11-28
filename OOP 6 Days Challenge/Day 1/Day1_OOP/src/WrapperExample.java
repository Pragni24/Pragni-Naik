public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        Integer num = 45;
        //now it is created as object(num is obj of type integer,it is called wrapper class)
        swap(a,b);
        System.out.println(a+" "+b);//this won't swap because in java there is no such thing as pass by refrerence,only pass by value
        //even when you write Integer instead of int,it still won't change the original value

        final int bonus = 2;
        A kunal = new A("Kunal Kushwaha");
        kunal.name="other name";//can do this for non primitive datatype

    }

    static  void swap(int a, int b){
        int temp = a;
        a = b;
        b= a;
    }


}

class A{
    //always intialize final while declaring it,otherwise it gives error
    //you cannot change the value only holds for primitive datatype but you can make change in value for non primitive datatypes
    final int num = 10;
    String name;
    public  A(String name){
        this.name=name;
    }



}
