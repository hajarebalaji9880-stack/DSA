package dsa_Problems;

public class Linkedlist {

    public static class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    // Insert at a given position
    public static void AddPos(Node Head, int pos, int data) {

        Node b1 = new Node(data);

        Node curr = Head;
        int count = 1;

        while (count < pos - 1) {
            curr = curr.Next;
            count++;
        }

        b1.Next = curr.Next;
        curr.Next = b1;
    }

    public static void main(String[] args) {

        Node a1 = new Node(5);
        Node a2 = new Node(10);
        Node a3 = new Node(15);
        Node a4 = new Node(20);
        Node a5 = new Node(25);

        a1.Next = a2;
        a2.Next = a3;
        a3.Next = a4;
        a4.Next = a5;

        Node Head = a1;

        // Insert 12 at position 3
        AddPos(Head, 3, 12);

        Node Current = Head;

        while (Current != null) {
            System.out.print(Current.data);
            if (Current.Next != null) {
                System.out.print(" -> ");
            }
            Current = Current.Next;
        }
    }
}