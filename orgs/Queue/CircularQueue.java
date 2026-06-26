package orgs.Queue;



class CircularQueueing {
private int[] arr;
private int front;
private int rear;
private int capacity;

public CircularQueueing(int size){
    capacity = size;
    arr = new int[size];

    front = -1;
    rear = -1;

}
boolean isEmpty(){
    return front == -1;
}
boolean isFull(){
    return ((rear+1)%capacity)== front;
}
void enqueue(int data ) {
    if (isFull()) {
        System.out.println("Queue is full");
        return;
    }
    if (isEmpty()) {
        front = rear = 0;

    } else {
         rear = (rear + 1) % capacity;
    }
    arr[rear] = data;

}
int dequeue(){
    if(isEmpty()){
        System.out.println("queue underflow!!");
        return -1;
    }
    int dequeueElement = arr[front];
    if(front == rear){
        front = rear = -1;
    } else {
        front = (front + 1) % capacity;
    }
    return dequeueElement;
}
  void display(){
    if(isEmpty()) {
        System.out.println("queue is empty!!!");
        return;
    }
    for(int i=front; ; i =(i+1) % capacity){
        System.out.print(arr[i] + " ");

        if( i == rear){
            break;
        }
    }
    System.out.println();
  }
}

public class CircularQueue {
    public static void main(String[] args){
        CircularQueueing queue = new CircularQueueing(10);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(30);

        queue.display();

        System.out.println("deleted" + queue.dequeue());
        System.out.println("deleted" + queue.dequeue());
        queue.display();
        queue.enqueue(35);
        queue.enqueue(40);
        queue.display();


    }


}