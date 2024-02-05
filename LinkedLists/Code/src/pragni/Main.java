package pragni;

public class Main {
    public static void main(String[] args) {
        /*
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println("Item removed is "+list.deleteFirst());
        list.display();
        System.out.println("Item removed is "+list.deleteLast());
        list.display();
        System.out.println("Item removed is "+list.delete(2));
        list.display();

         */
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();
        list.displayReverse();
        list.insertLast(30);
        list.display();

    }
}
