# Questions practiced 
## Link of the problems
Here are the list of Easy, Medium and Hard level questions that I have practiced.(Also, find my code here,but first click on the link and try on your own. Happy coding!)
### Easy level questions
- [Search in a Linked List](https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/651073/offering/10442134?goalRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav)
```java
public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node temp = head;
        while(temp!=null){
            if(temp.data==k){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
}
```
- [Middle of Linked List](https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/651073/offering/10442132?goalRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav)
```java

public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        int n=0;
        Node node = head;
        while(node!=null){
            n++;
            node=node.next;
        }
        int mid = n/2;
        Node temp = head;
        
        for(int i=1;i<=mid;i++){
            
            temp=temp.next;
        }
        return temp; 
    
    }
    
}
```
- [Reverse a linked list](https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/651073/offering/10442133?goalRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav)
```java


public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
```
- [Delete node in a linked list](https://www.codingninjas.com/studio/problems/delete-node-in-a-linked-list_1105578?interviewProblemRedirection=true)
```java
public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        node.data=node.next.data;
        node.next=node.next.next;
	}
}
```
- [Find a Node in Linked List](https://www.codingninjas.com/studio/problems/find-a-node-in-linked-list_625049)
```java
public class Solution {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		Node temp2=head;
		for(int i = 0 ; i < count ; i++){
			if((int)temp2.data==n){
				return i;
			}
			temp2=temp2.next;
		}
		return -1;
	}
}
```
- [Reverse Linked List](https://www.codingninjas.com/studio/problems/reverse-the-singly-linked-list_799897)
```java
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> current = head ;
		LinkedListNode<Integer> prev = null ;
		LinkedListNode<Integer> nextnode = null;
		while(current!=null){
			nextnode=current.next;
			current.next=prev;
			prev=current;
			current=nextnode;
			
		}
		return prev;
    }
}
```
