/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 05 - PriorityQueueTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    @Test
    public void testSamePriority() {
        PriorityQueue<Customer> pq = new PriorityQueue<>();
        pq.push(new Customer("a"));
        pq.push(new Customer("b"));
        pq.push(new Customer("c"));
        assertEquals(new Customer("a"), pq.pop());
        assertEquals(new Customer("b"), pq.pop());
        assertEquals(new Customer("c"), pq.pop());
    }

    @Test
    public void testHigherThanFront() {
        PriorityQueue<Customer> pq = new PriorityQueue<>();
        pq.push(new Customer("b"));
        pq.push(new Customer("c"));
        pq.push(new Customer("a", 1));
        assertEquals(new Customer("a", 1), pq.pop());
        assertEquals(new Customer("b"), pq.pop());
        assertEquals(new Customer("c"), pq.pop());
    }

    @Test
    public void testPriorityInBetween() {
        PriorityQueue<Customer> pq = new PriorityQueue<>();
        pq.push(new Customer("d"));
        pq.push(new Customer("a", 2));
        pq.push(new Customer("b", 2));
        pq.push(new Customer("c", 1));
        assertEquals(new Customer("a", 2), pq.pop());
        assertEquals(new Customer("b", 2), pq.pop());
        assertEquals(new Customer("c", 1), pq.pop());
        assertEquals(new Customer("d"), pq.pop());
    }

    @Test
    public void testLowestPriority() {
        PriorityQueue<Customer> pq = new PriorityQueue<>();
        pq.push(new Customer("a", 1));
        pq.push(new Customer("b", 1));
        pq.push(new Customer("c", 1));
        pq.push(new Customer("d"));
        assertEquals(new Customer("a", 1), pq.pop());
        assertEquals(new Customer("b", 1), pq.pop());
        assertEquals(new Customer("c", 1), pq.pop());
        assertEquals(new Customer("d"), pq.pop());
    }
}