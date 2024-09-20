public class IntersectionOfLL {

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

        void InsertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        int Length() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void displayList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }

        Node getIntersectionNode(Node h1, Node h2) {
            Node temp1 = h1;
            Node temp2 = h2;

            int n1 = 0;
            int n2 = 0;
            while (temp1 != null) {
                n1++;
                temp1 = temp1.next;
            }
            while (temp2 != null) {
                n2++;
                temp2 = temp2.next;
            }

            temp1 = h1;
            temp2 = h2;

            if (n1 > n2) {
                for (int i = 0; i < n1 - n2; i++) {
                    temp1 = temp1.next;
                }
            } else {
                for (int i = 0; i < n2 - n1; i++) {
                    temp2 = temp2.next;
                }
            }

            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2) {
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            return null;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.InsertAtEnd(1);
        list1.InsertAtEnd(2);
        list1.InsertAtEnd(3);
        list1.InsertAtEnd(4);
        list1.InsertAtEnd(5);
        list1.InsertAtEnd(6);
        list1.InsertAtEnd(7);

        list2.InsertAtEnd(3);
        list2.InsertAtEnd(4);
        list2.InsertAtEnd(5);
        list2.InsertAtEnd(6);
        list2.InsertAtEnd(7);
        list2.InsertAtEnd(8);
        list2.InsertAtEnd(9);
        list2.InsertAtEnd(10);
        list2.InsertAtEnd(11);

        // Creating intersection
        list2.tail.next = list1.head.next.next.next;

        list1.displayList();
        list2.displayList();

        Node intersectionNode = list1.getIntersectionNode(list1.head, list2.head);
        if (intersectionNode != null) {
            System.out.println("Intersection at node with data: " + intersectionNode.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
