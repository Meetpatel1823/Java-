import java.util.List;

public class LL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;

        public void addNode(Node node)
        {
            if(head==null)
            {
                head=node;
                tail=node;
            }
            else
            {
                tail.next=node;
                tail=node;
            }
        }
        
         void display()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
                }
                System.out.print("null");
                System.out.println();
        } 
        
    }

    public static void main(String[] args) {
        
       
        LinkedList list = new LinkedList();
        list.addNode(new Node(1));
        list.addNode(new Node(2));
        list.addNode(new Node(3));
        list.addNode(new Node(4));
        list.addNode(new Node(5));
        list.addNode(new Node(6));
        list.addNode(new Node(7));
list.display();
    }
    
}
