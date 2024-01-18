package com.algos.queue;

/**
 * A simple way is to use an array to represent our Queue,
 * with two pointers: one to the front of the Queue, and one to the rear.
 *
 * We'll initialize our Queue with a fixed size and set both pointers to -1.
 * When we Enqueue an item, we'll increment the rear pointer and
 * add the new item at the rear. When we Dequeue an item,
 * we'll increment the front pointer, effectively removing the first item.
 * We can get the front item by accessing the array element at the front pointer,
 * and we can check if the Queue is empty by comparing the front and rear pointers.
 */
public class P00Queue {
    private int size;
    private int[] queue;
    private int front;
    private int rear;

    public P00Queue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int data) {
        if ((this.rear + 1) % this.size == this.front) {
            System.out.println("Queue is Full\n");
        } else {
            this.rear = (this.rear + 1) % this.size;
            this.queue[this.rear] = data;
        }
    }

    public void dequeue() {
        if (this.front == this.rear) {
            System.out.println("Queue is Empty\n");
        } else {
            this.front = (this.front + 1) % this.size;
        }
    }

    public void display() {
        if (this.front == this.rear) {
            System.out.println("No elements in the Queue");
        } else {
            System.out.print("Elements in the Queue are: ");
            for (int i = this.front; i <= this.rear; i++) {
                System.out.print(this.queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P00Queue queue = new P00Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
    }

}
