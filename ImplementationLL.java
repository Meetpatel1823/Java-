import java.util.*;

public class ImplementationLL {

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
        int size = LengthOfLL();

        void InsertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

        }

        void DeleteAtPos(int val) {
            Node temp = head;
            if (val == 0) {
                head = head.next;
                return;
            }
            for (int i = 1; i <= val - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            size--;

        }

        {
            if (head == null) {
                System.out.println("List is Empty");
            } else if (head.next == null) {
                head = null;
            } else {

                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }

                temp = tail;
                temp.next = null;
                tail.next = null;
            }
        }


        void InsertAtStart(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }

        void InsertAtPos(int val, int data) {
            Node current = new Node(data);
            Node temp = head;
            if (val == 0) {
                InsertAtStart(data);
                return;
            } else if (val == LengthOfLL()) {
                InsertAtEnd(data);
                return;
            } else if (val < 0 && val > LengthOfLL()) {
                System.out.println("Wrong Index Input: ");
                return;
            } else {

                for (int i = 1; i <= val - 1; i++) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
        }

        int GetAt(int val) {
            Node temp = head;
            int count = 0;
            for (int i = 1; i <= val; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print("-> " + temp.data);
                temp = temp.next;
            }
            System.out.println();
        }

        int LengthOfLL() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }
        void DeleteNode(Node node)
        {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.InsertAtEnd(10);
        ll.InsertAtEnd(20);
        ll.InsertAtEnd(30);
        ll.InsertAtEnd(40);
        ll.InsertAtEnd(50);
        // ll.InsertAtStart(1);
        // ll.InsertAtStart(111);

        // ll.Display();
        // ll.InsertAtPos(1, 11);
        // ll.InsertAtPos(3, 22);

        // ll.InsertAtPos(5, 33);
        // ll.InsertAtPos(7, 44);
        // ll.InsertAtPos(9, 55);
        // ll.InsertAtPos(0, -111);

        // ll.DeleteAtPos(0);
        
        int n = ll.LengthOfLL();

        ll.Display();
        System.out.println("Length of LL : " + n);
        System.out.println(ll.tail.data);
        System.out.println(ll.GetAt(0));

    }

}
