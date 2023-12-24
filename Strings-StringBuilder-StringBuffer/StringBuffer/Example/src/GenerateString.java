import java.util.Random;
class RandomString{
    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i=0;i<size;i++){
            int randomChar = 97+(int)(random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}
public class GenerateString {
    public static void main(String[] args) {
        String name = RandomString.generate(20);
        System.out.println(name);
    }
}
