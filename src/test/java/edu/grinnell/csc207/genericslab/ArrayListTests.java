package edu.grinnell.csc207.genericslab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayListTests {

    @Test
    public void stringArrTest(){
        ArrayList<String> stringArr = new ArrayList<String>();
        stringArr.add("Element1");
        stringArr.add("Element2");
        stringArr.add("Element3");
        assertEquals(3, stringArr.size());
        assertEquals("Element3", stringArr.get(2));
        assertEquals("Element3", stringArr.remove(2));
        assertEquals(2, stringArr.size());
    }

    @Test
    public void intArrTest(){
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        assertEquals(3, intArr.size());
        assertEquals(3, intArr.get(2));
        assertEquals(3, intArr.remove(2));
        assertEquals(2, intArr.size());
    }

    @Test
    public void boolArrTest(){
        ArrayList<Boolean> boolArr = new ArrayList<Boolean>();
        boolArr.add(true);
        boolArr.add(false);
        boolArr.add(true);
        assertEquals(3, boolArr.size());
        assertEquals(true, boolArr.get(2));
        assertEquals(true, boolArr.remove(2));
        assertEquals(2, boolArr.size());
    }

}

