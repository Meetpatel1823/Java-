public class DoublyLinkedList {

    public static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
public static class DoublyLL{
    Node head;
    Node tail;
    void append(Node n)
    {
        if(head == null)
        {
            head = n;
            tail = n;
        }else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
void insert (Node n,int pos)
{
    if(pos==0)
    {
        if(head==null)
        {
            head= n;
            tail = n;
        }else{
            n.next = head;
            head.prev = n;
            head = n;
        }
    }else{
            Node temp = head;
            for(int i = 1;i<pos;i++)
            {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            n.prev = temp;
            if(temp.next!=null)
            {
                temp.next.prev=n;
            }
            if(n.next ==null)
            {
                tail = n;
            }
    }
}

}

    public static void main(String[] args) {
        
    }
    
}
