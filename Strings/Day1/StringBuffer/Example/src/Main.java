public class Main {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("WeMakeDevs");
        String str = sb.toString();
        System.out.println(str);
        StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");
        System.out.println(sb2.capacity());
        StringBuffer sb3 = new StringBuffer(50);
        sb.insert(2,"Rahul");
        System.out.println(sb);
        sb.replace(1,4,"Kushwaha");
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb3.capacity());


    }
}