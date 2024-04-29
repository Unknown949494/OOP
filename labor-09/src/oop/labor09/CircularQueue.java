package oop.labor09;

public class CircularQueue implements IQueue {
    private int capacity;
    private Object[] items;
    private int front;
    private int rear;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front=this.rear=-1;
        items=new Object[capacity];

    }
    public boolean isFull(){
        if (front==0 && rear==capacity-1 ){
            return true;

        }
        if (front==rear+1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public void enQueue(Object item){
        if (isFull()){
            System.out.println("Full");
            return;
        }
        front=0;
        rear=(rear+1)%capacity;
        items[rear]=item;
    }
    public Object deQueue(){
        Object save;
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        save=items[front];
        if (front==rear){
            front=rear=-1;
        }
        else {
            front=(front+1)%capacity;
        }
        return save;
    }
    public void printQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i=front;i!=rear;i=(i+1)%capacity){
            System.out.println(items[i]);
        }
    }

}
