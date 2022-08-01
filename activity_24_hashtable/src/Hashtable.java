/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 24 - Hashtable
 */

import java.util.Iterator;

public class Hashtable<K,V> implements Iterable<K> {

    private final int SIZE = 11;
    private HashNode<K,V>[] table;

    public Hashtable() {
        table = new HashNode[SIZE];
    }

    public void put(K key, V value) {
        int index = key.hashCode() % SIZE;
        HashNode<K, V> current = table[index];
        if (current == null)
            table[index] = new HashNode<>(key, value);
        else {
            while (current.getNext() != null) {
                if (current.getKey().equals(key)) {
                    current.setValue(value);
                    return;
                }
                current = current.getNext();
            }
            if (current.getKey().equals(key))
                current.setValue(value);
            else
                current.setNext(new HashNode<>(key, value));
        }
    }

    public V get(K key) {
        int index = key.hashCode() % SIZE;
        HashNode<K, V> current = table[index];
        while (current != null) {
            if (current.getKey().equals(key))
                return current.getValue();
            current = current.getNext();
        }
        return null;
    }

    private String linkedListToString(HashNode<K,V> head) {
        String out = "";
        HashNode<K, V> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        // optional (get rid of the last space)
        out = out.trim();
        return out;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < SIZE; i++)
            out += i + " -> " + linkedListToString(table[i]) + "\n";
        return out.trim();
    }


    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {

            private int index = 0;
            private HashNode<K, V> current = table[index];

            @Override
            public boolean hasNext() {
                while (true) {
                    if (index == SIZE)
                        break;
                    if (current == null) {
                        index++;
                        if (index < SIZE)
                            current = table[index];
                    }
                    else
                        return true;
                }
                return false;
            }

            @Override
            public K next() {
                if (hasNext()) {
                    K key = current.getKey();
                    current = current.getNext();
                    return key;
                }
                return null;
            }
        };
    }
}
