package oop.labor09;

import java.util.ArrayList;

public class ArraylistQueue implements IQueue {
    ArrayList<Object> items=new ArrayList<>();
    private int capacity;

    public ArraylistQueue(int capacity) {
        this.capacity = capacity;
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    public boolean isFull(){
        return items.size()==capacity;
    }
    public void enQueue(Object item){
        items.add(item);
    }
    public Object deQueue(){
        return items.remove(0);
    }
    public void printQueue(){
        for (Object it:items){
            System.out.println(it);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!= o.getClass()) return false;
        ArraylistQueue that=(ArraylistQueue) o;
        if (that.items.size()!=this.items.size()){
            return false;
        }
        for (int i=0;i<that.items.size();i++){
            if (!that.items.get(i).equals(this.items.get(i))){
                return false;
            }
        }
        return true;
    }
}
