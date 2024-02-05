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
    public void insert(int after,int val){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null){
            node.next.prev=node;
        }
    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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
