public class LLDelete {

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

        Node nthNode(Node node, int n) {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            int m = count - n + 1;
            temp = head;
            while (m > 1) {
                temp = temp.next;
                m--;
            }
            return temp;

        
        }
        Node nthNodeFromEnd(Node n,int n1)
        {
            Node fast = head;
            Node slow = head;
            for(int i=0;i<=n1;i++)
            {
                fast=fast.next;
            }
            while(fast!=null)
            {
                fast=fast.next;
                slow=slow.next;
            }
            // slow.data=slow.next.data;
            // slow.next=slow.next.next;

return slow;
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

        Node DeleteNthFromLast(int n1)
        {
            Node fast = head;
            Node slow = head;
            
            for(int i=1;i<=n1;i++)
            {
                fast=fast.next;
            }
            if(fast==null)
            {
                head=head.next;
                return head;
            }
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            // slow.data=slow.next.data;
            slow.next=slow.next.next;
            return head;

        }

    }


    public static void main(String[] args) {
LinkedList ll= new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
      ll.addNode(n1);
      ll.addNode(n2);
      ll.addNode(n3);
      ll.addNode(n4);
      ll.addNode(n5);
      ll.DeleteNthFromLast(5);
      ll.display();
    //   n1 = DeleteNthFromLast(n1,5);
      


        Node temp = ll.nthNode(n1, 5);
        // Node nthFromLast = ll.nthNodeFromEnd(n1, 0);
        // System.out.println(temp.data);
        // System.out.println(nthFromLast.data);


    }

}
