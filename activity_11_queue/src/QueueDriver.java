/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 11 - QueueDriver
 */

public class QueueDriver {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        System.out.println(queue);
        queue.push(5);
        queue.push(8);
        queue.push(3);
        System.out.println(queue);
        System.out.println(queue.pop());
        queue.push(10);
        queue.push(2);
        queue.push(9);
        System.out.println(queue);
        queue.push(7);
        System.out.println(queue);
        while (!queue.isEmpty()) {
            queue.pop();
            System.out.println(queue);
        }
    }
}