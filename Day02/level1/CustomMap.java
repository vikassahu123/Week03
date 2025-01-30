// Implement a Custom Hash Map
// Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
// Hint: Use an array of linked lists to handle collisions using separate chaining.


import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] map;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        map = (LinkedList<Entry<K, V>>[]) new LinkedList[SIZE];
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        if (map[index] == null) map[index] = new LinkedList<>();
        for (Entry<K, V> entry : map[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        map[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);
        if (map[index] != null) {
            for (Entry<K, V> entry : map[index]) {
                if (entry.key.equals(key)) return entry.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        if (map[index] != null) {
            map[index].removeIf(entry -> entry.key.equals(key));
        }
    }

    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class CustomMap {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        System.out.println(map.get("A"));
        map.remove("A");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }
}

