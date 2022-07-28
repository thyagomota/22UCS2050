/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 24 - Hashtable
 */

public class Hashtable<K,V> {

    private final int SIZE = 11;
    private HashNode<K,V>[] table;

    public Hashtable() {
        table = new HashNode[SIZE];
    }

    public void put(K key, V value) {
        int index = key.hashCode() % 11;
        HashNode<K, V> newHashNode = new HashNode<>(key, value);
        HashNode<K, V> current = table[index];
        if (current == null)
            table[index] = newHashNode;
        else {
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(newHashNode);
        }
    }

    public V get(K key) {
        return null;
    }
}
