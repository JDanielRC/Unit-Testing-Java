
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class UnitTest {

	// Unit tests for list size
	@Test
    public void getSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;
        list.size();
    }
    
    //Unit tests for clearing a list
    @Test
    public void getSizeOfClearedList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        assertEquals(0, list.size());
    }
    
    @Test(expected = NullPointerException.class)
    public void clearingNullList() {
    	List<Integer> list = null;
    	list.clear();
    }
    
    @Test
    public void removingElementByElement() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.remove(0);
    	list.remove(0);
    	list.remove(0);
    	assertEquals(0, list.size());
    }
    
    //Unit Tests for adding items
    
    @Test
    public void addingString() {
    	List<String> list = new ArrayList<>();
    	list.add("nameNAME10");
    	assertEquals("nameNAME10", list.get(0));
    }
    
    @Test
    public void addingCastedType() {
    	List<Integer> list = new ArrayList<>();
    	list.add(Integer.parseInt("5"));
    	assertEquals(5, list.get(0).intValue());
    }
    
    @Test(expected = NullPointerException.class)
    public void addingToNullList() {
    	List<Integer> list = null;
    	list.add(5);
    }
    
    //Unit tests for checking if an item exists
    
    @Test
    public void checkIfStringExists() {
    	List<String> list = new ArrayList<>();
    	list.add("i exist");
    	assertEquals(true, list.contains("i exist"));
    }
    
    @Test
    public void checkForInteger() {
    	List<Integer> list = new ArrayList<>();
    	list.add(5);
    	assertEquals(true, list.contains(5));
    }
    
    @Test
    public void checkForUnexistingValue() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	assertEquals(false, list.contains(4));
    }
    
    //Unit tests for obtaining items by index
    @Test
    public void obtainByIndex() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(100);
    	list.add(200);
    	list.add(500);
    	list.get(2);
    	assertEquals(200, list.get(2).intValue());
    }
    
    @Test(expected = NullPointerException.class)
    public void obtainFromNullList() {
    	List<Integer> list = null;
    	list.get(0);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void obtainNegativeIndex() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(10);
    	list.add(100);
    	list.get(-1);
    }
    
    //Unit tests for searching the index of an object
    @Test
    public void findIndex() {
    	List<Integer> list = new ArrayList<>();
    	list.add(15);
    	list.add(30);
    	list.add(45);
    	assertEquals(0, list.indexOf(15));
    }
    
    @Test(expected = NullPointerException.class)
    public void findingIndexInNullList() {
    	List<Integer> list = null;
    	list.indexOf(10);
    }
    
    @Test
    public void findIndexOfItemNotInTheList() {
    	List<Integer> list = new ArrayList<>();
    	list.add(2);
    	list.add(9);
    	list.add(13);
    	assertEquals(-1, list.indexOf(3));
    }
    
    //Unit tests for removing an item by index
    @Test
    public void removeByIndex() {
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(10);
    	list.add(100);
    	list.remove(1);
    	assertEquals(false, list.contains(10));
    }
    
    @Test(expected = NullPointerException.class)
    public void removingFromNullList() {
    	List<Integer> list = null;
    	list.remove(0);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void removingNegativeIndex() {
    	List<Integer> list = new ArrayList<>();
    	list.add(100);
    	list.add(1000);
    	list.add(10000);
    	list.remove(-1);
    }
}
