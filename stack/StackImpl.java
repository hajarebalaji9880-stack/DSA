package stack;

class Stack {
    int[] arr;
    int top;
    int capacity;
    {
        System.err.println("Stack class is being initialized.");
    }

    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack is already full.");
            return;
        }
        arr[++top] = val;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public int size() {
        return top + 1;
    }
}

public class StackImpl {
    public static void main(String[] args) {

        Stack st = new Stack(10);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Top element: " + st.peek());

        st.display();

        System.out.println("Popped: " + st.pop());

        st.display();

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        System.out.println("Is Full: " + st.isFull());
    }
}