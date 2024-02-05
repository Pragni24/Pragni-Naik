package pragni;

public class DLL {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        Node last = temp;
        while (temp!=null){
            last=temp;
            temp=temp.next;
        }
        if(last==null){
            insertFirst(val);
            return;
        }
        node.next=null;
        last.next=node;
        node.prev=last;


    }
    public void display(){
        Node temp = head;
        Node last = temp;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");

    }
    public void displayReverse(){
        Node temp = head;
        Node last = temp;
        while (temp!=null){
            last=temp;
            temp=temp.next;
        }
        System.out.println("In reverse,");
        while(last!=null){
            System.out.print(last.val+"-> ");
            last=last.prev;
        }
        System.out.println("START");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }


}
