import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    void appendList(int data) {
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    void Delete(int pos)
    {
        Node current = this;
        if (pos == 0)
        {
         this.data = current.next.data;
         current.next = current.next.next;
        }
        else{
            for (int i = 0; i < pos - 1; i++)
            {
                current = current.next;
            }
            current.next = current.next.next;

        }
    }

    void displayList() {
        Node current = this;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
     void insert(Node new_Node,int data)
     {
        Node current = this;
        while (current.data != data) {
            current = current.next;
            }
            new_Node.next=current.next;
            current.next = new_Node;
     }

}

public class appendLL {
    public static void main(String[] args) {
        Node list = new Node(10);
        Node n1 = new Node(505);
        list.appendList(20);
        list.appendList(30);
        list.appendList(40);
        list.appendList(50);
        list.appendList(60);
        list.appendList(70);
        list.appendList(80);
        list.appendList(90);
        list.appendList(100);
        list.insert(n1,20);
        // list.Delete(0);
        list.displayList();
    }
}
