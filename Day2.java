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

    void displayList() {
        Node current = this;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class Day2 {
    public static void main(String[] args) {
        Node list = new Node(10);
        list.appendList(20);
        list.appendList(30);
        list.appendList(40);
        list.appendList(50);
        list.appendList(60);
        list.appendList(70);
        list.appendList(80);
        list.appendList(90);
        list.appendList(100);
        list.displayList();
    }
}
