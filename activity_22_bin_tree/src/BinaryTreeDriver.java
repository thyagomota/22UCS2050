/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BinaryTreeDriver
 */

public class BinaryTreeDriver {

    // TODO: create a binary tree and add the data elements to reproduce the tree described in the lecture about trees; don't forget to print your tree at the end
    public static void main(String[] args) {
        BinaryTree<String> binTree = new BinaryTree<>();
        System.out.println(binTree);
        binTree.add("Janet");
        System.out.println(binTree);
        binTree.add("Alex");
        binTree.add("Paul");
        System.out.println(binTree);
        binTree.add("Brenna");
        System.out.println(binTree);
        binTree.add("Kristi");
        binTree.add("Xavier");
        binTree.add("Anthony");
        binTree.add("Carla");
        System.out.println(binTree);
    }
}
