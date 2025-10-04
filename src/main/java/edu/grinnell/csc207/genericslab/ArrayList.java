package edu.grinnell.csc207.genericslab;

import java.util.Arrays;

/**
 * An array-based implementation of a list.
 */
public class ArrayList<T> {

    private static final int INITIAL_SIZE = 8;
    private T[] data;
    private int sz;

    /**
     * Constructs a new, empty array list.
     */
    public ArrayList() {
        this.data = (T[]) new Object[INITIAL_SIZE];
        this.sz = 0;
    }

    private void ensureCapacity() {
        if (sz >= data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(T value) {
        ensureCapacity();
        data[sz++] = value;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return sz;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public T get(int index) {
        if (index < 0 || index >= sz) {
            throw new IndexOutOfBoundsException(index);
        }
        return data[index];
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public T remove(int index) {
        if (index < 0 || index >= sz) {
            throw new IndexOutOfBoundsException(index);
        } else {
            T ret = data[index];
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            sz -= 1;
            return ret;
        }
    }


    /**
     * Inserts sep in between each element of this list.
     * @param sep a variable to be inserted of any type
     */
    public void intersperse(T sep){
        T[] temp = (T[]) new Object[sz*2];
        for (int i =0; i<this.sz; i++) {
            temp[i] = sep;
            temp[i*2] = data[i];      
        }
        data = Arrays.copyOf(temp, temp.length);
    }
    /**
     * Returns the maximum element in a list. This does not work because
     * we cannot confirm that type T is a type that has a possible max.
     */
    public T maximum(){
        throw new UnsupportedOperationException();
    }

    /**
     * Returns string representation of the List
     */
    public String toString(){
        String ret = "[";
        for(int i = 0; i< sz; i++){
            ret += data[i]+ ", ";
        }
        ret += "]";
        return ret;
    }

    /**
     * sorts a list using an insertion sort algorithm.
     * This does not work with a generic typ as we do not know whether the
     * values in the list can be sorted.
     */
    public void insertionSort(){
        throw new UnsupportedOperationException();
    }

}
