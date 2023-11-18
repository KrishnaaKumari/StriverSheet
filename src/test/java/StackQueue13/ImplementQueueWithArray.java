package StackQueue13;

class Queue {
    int front, rear;
    int []arr;

    Queue() {
        front = -1;
        rear =-1;
        arr = new int[100001];
    }

    // Enqueue (add) element 'e' at the end of the queue.
    public void enqueue(int e) {
        // Write your code here.
        if(front==-1)
        {
            front=0;
            rear=0;
            arr[rear]=e;
        }
        else{
            rear++ ;
            arr[rear]=e;
        }

    }

    // Dequeue (retrieve) the element from the front of the queue.
    public int dequeue() {
        // Write your code here.
        if(front==-1||front>rear)
        {
            front=rear=-1;
            return -1;
        }
        else{
            int num=arr[front];
            front++ ;
            return num ;
        }
    }
}
public class ImplementQueueWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
