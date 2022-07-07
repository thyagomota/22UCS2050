/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 05 - PriorityQueueDriver
 */

public class PriorityQueueDriver {

    public static void main(String[] args) {

        PriorityQueue<Customer> pq = new PriorityQueue<>();
        System.out.println(pq);
        pq.push(new Customer("Daisy"));
        pq.push(new Customer("Donald"));
        System.out.println(pq);
        pq.push(new Customer("Scrooge", 3));
        System.out.println(pq);
        pq.push(new Customer("Huey", 2));
        System.out.println(pq);
        pq.pop();
        pq.push(new Customer("Dewey", 2));
        pq.push(new Customer("Louie", 2));
        System.out.println(pq);
        pq.pop(); pq.pop(); pq.pop();
        System.out.println(pq);
        pq.push(new Customer("Von Drake", 1));
        System.out.println(pq);
    }
}
