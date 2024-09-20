public class SinglyCircular {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class CirLL
    {
        Node head;
        void append(Node node)
        {
            if(head==null)
            {
                node= head;
                head.next=head;
            }else{
                Node temp = head;
                while(temp.next!=head)
                {
                    temp=temp.next;
                }
                temp.next = node;
                node.next = head;

            }
        }
        void insert(Node node,int pos)
        {
            if(pos<0)
            {
                throw new IndexOutOfBoundsException("position out of bounds");
            }
            if(pos==0)
            {
                if(head==null)
                {
                    head=node;
                    head.next=head;
                }else{
                    Node temp = head;
                    while(temp.next!=head)
                    {
                        temp=temp.next;
                    }
                    temp.next = node;
                    node.next = head;
                    head = node;

                }
            }
            else{
                Node temp = head;
                for(int i = 1;i<=pos;i++)
                {
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next = node;
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}
