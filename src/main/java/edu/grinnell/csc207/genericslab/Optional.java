package edu.grinnell.csc207.genericslab;

import java.util.NoSuchElementException;

/**
 * An Optional<@T> is either empty or holds a single value of type @T.
 * 
 * @param T the type of value potentially held by this <code>Optional</code>.
 */
public class Optional<T> {
    private Optional(){};

    public static <T> Optional<T> empty(){
        Optional<T> ret =  null;
        return ret;
    }

    public static <T> Optional<T> of(T value){
        Optional<T> ret = (Optional<T>)value;
        return ret;
    }

    public Optional<T> first;

    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }

    public boolean isPresent(){
        if(first != null){
            return true;
        }
        return false;
    }

    public T get(){
        if(first.isEmpty()){
            throw new NoSuchElementException();
        } else{
            return (T)first;
        }
    }

    public T orElse(T other){
        if (first.isEmpty()) {
            return other;
        } else{
            return (T) first;
        }
    }

}
