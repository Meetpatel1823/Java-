import java.util.*;
public class LL {

    Node head;

    class Node
    {
String data;
Node next;

Node(String data)
{
    this.data=data;
    this.next = null;

}

    }
//add first // add last

public void addFirst(String data)
{
Node newNode = new Node(data);

if(head == null)
{
    head = newNode;
    return;
}
newNode.next = head ;
head = newNode;

}

public void addLast(String data)
{
    Node newNode = new Node(data);
    while(head!=null)
    {
        head = newNode;
        return;
    }
Node currNode = head;
while(currNode.next!=null)
{
    currNode = currNode.next;
}
currNode.next = newNode;

}

public void printList()
{

    if(head==null)
    {
        System.out.println("no elements");
        return;
    }
    Node currNode = head;
while(currNode!=null)
{
    System.out.print(currNode.data + " -> ");
    currNode = currNode.next;
}
System.out.println("NULL");
}


public static void main(String args[])
    {
LL list = new LL();
list.addLast("Dhruv");
list.addLast("is");
list.addLast("a");
list.addLast("good");
list.addLast("boy");




list.printList();


    }
    
}
