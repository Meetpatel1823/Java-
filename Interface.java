interface StackIntrface {
    public void push(int p);

    public int pop();

}

class CreateStack implements StackIntrface {
    int myStack[];
    int tos;

    CreateStack(int size) {
        myStack = new int[size];
        tos = -1;

    }

    public void push(int p)
        {
            if(tos==myStack.length-1)
            {
                System.err.println("stackoverflow");
            }
            else{
                myStack[++tos]=p;
            }
        }

    public int pop() {
        if (tos < 0) {
            System.out.println("StackUnderFlow");
            return 0;
        } else {
            return myStack[tos--];
        }
    }

}



class Interface {
    public static void main(String[] args) {
        System.out.println("hellow");
        
    }
}