package edu.citytech.cst.finance.util;

public class IntDynamicArray {
    private int[] items;
    private int size;


    public IntDynamicArray(){
        this(3);
    }
    public IntDynamicArray(int length){
        if(length<=0){
            length=1;
        }
        this.items = new int[length];}

    public int[] toArray(){
        int[] storedValues = new int[size];
        for (int i = 0; i <storedValues.length ; i++) {
            storedValues[i] =items[i];

        }
        return  storedValues;
    }

    public void insert(int newItem) {
        // Check to see if the array is full
        if(items.length== size){
            int[] newItems = new int[size * 2];
            for (int i = 0; i < size ; i++) {
                newItems[i] = items[i];

            }

            items = newItems;
        }


        this.items[ size ] =newItem;
        size++;
    }

    public void inserts(int...newItems){
        for (int c: newItems) {
            insert(c);

        }
    }

    public int size() {
        return this.size;
    }

    public void removeAt(int deleteIndex) {

        if (deleteIndex < 0 || deleteIndex >= size){
            String message = "Invalid number %s, current size of the index is %s" +
                    "the valid range is between 0 and %s";
            message = String.format(message,deleteIndex,size,size - 1 );
             throw new IllegalArgumentException(message);
        }
        for(int i = deleteIndex; i < size; i++){
            items[i] = items[ i + 1];
        }
        size --;
    }

    @Override public String toString(){
        int[] values = this.toArray();
        String message = "Array values:  ";
        for (int c:values) {
            message += c+ " ";


        }
        return message;
    }

    public int[] findAll(int searchValue) {

        IntDynamicArray da = new IntDynamicArray();
        for (int i =0; i < size ; i++){
            if (items[i] == searchValue){
                da.inserts(i);
            }
        }

        return da.toArray();
    }
    //O(1)
    public void removeLastItem(){

        size--;
    }
    //O(1)
    public void removeAll(){
        items = new int[0];
        size = 0;
    }

    //O(1)
    public int get(int index) {

        if (index < 0 || index >= size){
            String message = "Invalid number %s, current size of the index is %s" +
                    "the valid range is between 0 and %s";
            message = String.format(message,index,size,size - 1 );
            throw new IllegalArgumentException(message);
        }
        return items[index];
    }

    //O(1)
    public int getLastItem(){
        return items[size-1];
    }

}
