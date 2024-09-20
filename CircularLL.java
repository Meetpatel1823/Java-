public class CircularLL {

    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static class cirrLL{
        Node head;
        boolean isEmpty()
        {
            return head==null;
        }
    void Insert(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
            newNode.next = head;
        }
        newNode.next = head;
        Node last = head;
        while(last.next != head)
        {
            last = last.next;
        }
        last.next = newNode;
        head = newNode;
    }

    void Append(int data)
    {
 Node newNode = new Node(data);
 if(isEmpty())
 {
    head = newNode;
    newNode.next = head;
    return;
 }
Node last = head;
while(last.next!=head)
{
    last=last.next;   
}
last.next = newNode;
newNode.next = head;
    }

    void Delete(int data)
    {
        if(isEmpty())
        {
            System.out.println("Empty List !");
        }
        Node current = head;
        Node prev = null;
        do{
            if(current.data==data)
            {
                break;
            }
            prev = current;
            current=current.next;

        }while(current!=head);
        if(current==null)
        {
            System.out.println("Node not found !");
        }

        if(current==head&&current.next == head)
        {
            head=null;
            return;
        }
if(current == head)
{
    head= head.next;
    prev.next = head;
}else{
    prev.next = current.next;
}
    }

    void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next; 

        } while (current != head);
        System.out.println();
    }

    }
    public static void main(String[] args) {
        cirrLL list = new cirrLL();
        list.Append(1); 

        list.Append(2);
        list.Insert(3);
        list.Append(4);

        list.display(); // Output: 3 1 2 4

        list.Delete(4   );
        list.display(); // Output: 3 


    }
}
