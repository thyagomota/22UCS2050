/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 04 - LinkedListTest
 */
 
 import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test()
    void testRemoveHeadEmptyList() {
        LinkedList ll = new LinkedList();
        try {
            ll.remove(0);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testRemoveHeadSingleNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.remove(0);
        assertTrue(ll.isEmpty());
    }

    @Test()
    void testRemoveHeadTwoNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.remove(0);
        assertEquals(5, ll.get(0));
    }

    @Test()
    void testRemoveHeadThreeNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.remove(0);
        assertEquals(7, ll.get(0));
        assertEquals(5, ll.get(1));
    }

    @Test()
    void testNegativeIndexEmptyList() {
        LinkedList ll = new LinkedList();
        try {
            ll.remove(-1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testInvalidIndexEmptyList() {
        LinkedList ll = new LinkedList();
        try {
            ll.remove(1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testNegativeIndexSingleNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        try {
            ll.remove(-1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testInvalidIndexSingleNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        try {
            ll.remove(1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testNegativeIndexTwoNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        try {
            ll.remove(-1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testNegativeIndexThreeNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(3);
        try {
            ll.remove(-1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testInvalidIndexTwoNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        try {
            ll.remove(2);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test()
    void testInvalidIndexThreeNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(3);
        try {
            ll.remove(3);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return;
        }
        throw new Error("ArrayIndexOutOfBoundException NOT thrown!");
    }

    @Test
    void testValidIndexSingleNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.remove(0);
        assertTrue(ll.isEmpty());
    }

    @Test
    void testValidIndexTwoNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.remove(0);
        assertEquals(ll.size(), 1);
        assertEquals(5, ll.get(0));
        ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.remove(1);
        assertEquals(ll.size(), 1);
        assertEquals(7, ll.get(0));
    }

    @Test
    void testValidIndexThreeNodeList() {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.remove(0);
        assertEquals(ll.size(), 2);
        assertEquals(7, ll.get(0));
        assertEquals(5, ll.get(1));
        ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.remove(1);
        assertEquals(ll.size(), 2);
        assertEquals(3, ll.get(0));
        assertEquals(5, ll.get(1));
        ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.remove(2);
        assertEquals(ll.size(), 2);
        assertEquals(3, ll.get(0));
        assertEquals(7, ll.get(1));
    }
}