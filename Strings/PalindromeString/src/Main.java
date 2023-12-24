import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to check whether it is palindrome or not:");
        String original = in.next();
        String reverse = "";
        for(int i=original.length();i>0;i--){
            reverse = reverse + original.charAt(i-1);
        }
        if(reverse.equals(original)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}