package edu.citytech.cst.finance.util;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.Pair;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class SingleLinkedList <T extends Comparable<T> > implements IList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private final IntFunction<T[]> intFunction;
    private int size;

    public SingleLinkedList(IntFunction<T[]> intFunction){

        this.intFunction = intFunction;
    }
    @Override
    public void setConsumer(Consumer<T> consumer) {



    }

    @Override
    public void insert(T currentItem) {

        Node<T> newNode = new Node<>(currentItem);

        if (head==null) {
            head = tail = newNode;
        }
        else {
            Node<T> temp= tail;
            temp.next = newNode;
            tail= newNode;
        }
        this.size = this.size + 1;

    }

    @Override
    public void inserts(T... values) {

        for(T t : values)
            this.insert(t);

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int indexNo) {
        T value = getNodeAt(indexNo).data;
        return value;
    }

    Node<T> getNodeAt(int indexNo){

        if(indexNo==0)
            return head;
        Node<T> currentNode = head;

        int index =0;
        while (currentNode != null){
            currentNode = currentNode.next;
            index++;
            if(index == indexNo)
                return currentNode;
        }
        return null;
    }
    @Override
    public Integer[] findAll(T value) {

        DynamicArray <Integer>da = new DynamicArray<Integer>(Integer[]::new);
        if (size == 0)
            return da.toArray();

        Node<T> currentNode = head;
        int index =0;

        do{
            T current = currentNode.data;

            if(current.compareTo(value) == 0)
                da.insert(index);

            index++;

        }while (  (currentNode = currentNode.next) != null );

        return da.toArray();
    }


    @Override
    public Pair<Integer, T>[] query(Predicate<T> predicate, long limit) {
        IList<Pair<Integer,T>> dynamicArray = new DynamicArray<>(10, Pair[]::new);


        if (size == 0)
            return dynamicArray.toArray();

        Node<T> currentNode = head;
        int index =0;

        do{
            T current = currentNode.data;

            if(predicate.test(current)) {

                Pair<Integer, T> pair = new Pair<>(index,current);

                dynamicArray.insert(pair);
            }

            if(limit == index + 1  )
                break;

            index++;

        }while (  (currentNode = currentNode.next) != null );

        return dynamicArray.toArray();
    }

    @Override
    public Pair<Integer, T>[] query(Predicate<T> predicate) {
       return this.query(predicate,Long.MAX_VALUE);
    }

    @Override //0(1)
    public T getLastItem() {
        return this.tail.data;
    }

    @Override
    public void removeAt(int i) {

    }



    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public void removeAll() {

    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public T getFirstItem() {
        return this.head.data;
    }

    @Override
    public void removeFirstItem() {
        if(size ==1){

            this.head = this.tail = null;
            size --;

        }
        else if (size > 1){
            Node<T> second = this.head.next;
            this.head = null;
            this.head = second;
            size --;
        }


    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("SingleLinkedList  ");
        sb.append("size=    ");
        sb.append(size);
        sb.append("  {  ");
        Node<T> currentNode= this.head;
        while(currentNode != null){
            sb.append(" ");
            sb.append(currentNode.data);
            currentNode = currentNode.next;

        }
        sb.append("   }  ");
        return sb.toString();
    }
}
