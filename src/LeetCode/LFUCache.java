package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

class LFUCache {
    private final int capacity;

    private final Map<Integer, Integer> keyToValue;
    private final Map<Integer, Integer> keyToFrequency;
    private final Map<Integer, LinkedHashSet<Integer>> frequencyToKeys;
    private int minFrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        this.keyToValue = new HashMap<>();
        this.keyToFrequency = new HashMap<>();
        this.frequencyToKeys = new HashMap<>();
    }

    public static void main(String[] args) {
        LFUCache cache = new LFUCache(4);
        cache.put(1, 1);
//        cache.put(2, 2);
//        assert cache.get(1) == 1; // returns 1
//        cache.put(3, 3); // evicts key 2
//        assert cache.get(2) == -1; // returns -1 (not found)
//        assert cache.get(3) == 3; // returns 3
//        cache.put(4, 4); // evicts key 1
//        assert cache.get(1) == -1; // returns -1 (not found)
//        assert cache.get(3) == 3; // returns 3
//        assert cache.get(4) == 4; // returns 4

    }

    public int get(int key) {
        if (!keyToValue.containsKey(key)) {
            return -1;
        }
        int value = keyToValue.get(key);
        increaseFrequency(key);
        return value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        if (keyToValue.containsKey(key)) {
            keyToValue.put(key, value);
            increaseFrequency(key);
        } else {
            if (keyToValue.size() >= capacity) {
                removeLeastFrequentKey();
            }


//            ------------------
            /*
             * keyToValue.put(key, value);
             * Purpose: Store the key and its associated value in the cache.
             * Action: Adds or updates the entry in the keyToValue map, which maps each key to its corresponding value.
             * Context: This is crucial for retrieving the value associated with the key during a get operation.
             */
            keyToValue.put(key, value);

//            ------------------
            /*
             * keyToFrequency.put(key, 1);
             * Purpose: Initialize the frequency count for the new key.
             * Action: Adds an entry in the keyToFrequency map, mapping the key to an initial frequency of 1.
             * Context: This sets the starting frequency for the new key, as it has just been inserted.
             */
            keyToFrequency.put(key, 1);

//            ------------------
            /*
             *The LinkedHashSet in the LFU Cache is used to maintain the set of keys that share the same frequency of access. It ensures that the keys are unique and preserves their insertion order, which is essential for efficiently updating and evicting keys based on their usage frequency.
             *  In the frequencyToKeys map, the key represents the frequency of access, and the value is a LinkedHashSet containing the keys (or items) that have been accessed that many times.
             *
             * computeIfAbsent:

             * This method checks if the key (frequency + 1) is present in the frequencyToKeys map.
             * If the key is not present, it uses the lambda expression k -> new LinkedHashSet<>() to create a new LinkedHashSet.
             * It then inserts this new LinkedHashSet into the map with the key (frequency + 1) and returns it.
             * If the key is already present, it simply returns the existing LinkedHashSet.

             * add(key):
             * This method adds the key to the LinkedHashSet obtained from the previous step.
             */

            frequencyToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);

            /*
             * minFrequency = 1;
             * Purpose: Set the minimum frequency to 1.
             * Action: Updates the minFrequency variable to 1.
             * Context: Since a new key with a frequency of 1 has been added, the minimum frequency must be updated to reflect this.
             */
            minFrequency = 1;
        }
    }

    private void increaseFrequency(int key) {
        int frequency = keyToFrequency.get(key);
        keyToFrequency.put(key, frequency + 1);

        frequencyToKeys.get(frequency).remove(key);
        if (frequency == minFrequency && frequencyToKeys.get(frequency).isEmpty()) {
            minFrequency++;
        }

        frequencyToKeys.computeIfAbsent(frequency + 1, k -> new LinkedHashSet<>()).add(key);
    }

    private void removeLeastFrequentKey() {
        LinkedHashSet<Integer> keys = frequencyToKeys.get(minFrequency);
        int keyToRemove = keys.iterator().next();
        keys.remove(keyToRemove);
        if (keys.isEmpty()) {
            frequencyToKeys.remove(minFrequency);
        }

        keyToValue.remove(keyToRemove);
        keyToFrequency.remove(keyToRemove);
    }
}




/* Another Solution
/*
/**
Approach:
The LFUCache class implements an LFU (Least Frequently Used) cache using a combination of linked lists and arrays. It maintains two arrays, `keys` and `cnts`, to store nodes based on keys and frequencies, respectively. A linked list is used to represent nodes with the same frequency.

Algorithm:
1. Define a Node class to represent cache entries. Each node has a key, value, frequency count (`cnt`), and pointers to the previous and next nodes.
2. Use two arrays:
   - `keys`: To store nodes based on keys. Size is set to 100001 (arbitrary large value).
   - `cnts`: To store nodes based on frequency count. Size is set to 200001 to accommodate the possible range of frequency counts.
3. Maintain a `tail` pointer to the last node in the linked list, and variables `size` (current size of the cache) and `capacity` (maximum capacity of the cache).
4. Implement helper methods:
   - `remove(Node node)`: Remove a node from the linked list and update arrays accordingly.
   - `insert(Node node, Node next)`: Insert a node into the linked list and update arrays accordingly.
   - `moveUp(Node node)`: Move a node up in frequency by removing it from its current position and inserting it into the appropriate position.
5. Implement the `get` method:
   - Retrieve a node based on the key from the `keys` array.
   - If the node exists, move it up in frequency and return the value.
   - If the node does not exist, return -1.
6. Implement the `put` method:
   - Retrieve a node based on the key from the `keys` array.
   - If the node exists, update its value and move it up in frequency.
   - If the node does not exist:
     - Create a new node with the key and value.
     - If the cache is full, remove the least frequently used node (tail).
     - Insert the new node into the linked list with frequency count 1.
7. The `put` method ensures the cache remains within the specified capacity by removing the least frequently used node when necessary.

Time Complexity:
- Both `get` and `put` operations have a time complexity of O(1), as the operations involve constant-time array and linked list manipulations.

Space Complexity:
- The space complexity is O(N + M), where N is the size of the `keys` array and M is the size of the `cnts` array.
- The constant factors in array sizes and node storage are relatively small.
*/

/*
class LFUCache {
    class Node {
        int key;
        int val;
        int cnt = 1;
        Node prev;
        Node next;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node[] keys = new Node[100001]; // Array to hold nodes based on keys
    Node[] cnts = new Node[200001]; // Array to hold nodes based on frequency counts
    Node tail; // Pointer to the last node in the cache list
    int size = 0; // Current number of nodes in the cache
    int capacity; // Maximum number of nodes the cache can hold

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    // Method to remove a node from the linked list and update arrays
    void remove(Node node) {
        // Disconnect node from its neighbors in the list
        if (node.prev != null)
            node.prev.next = node.next;
        if (node.next != null)
            node.next.prev = node.prev;

        // Remove node from keys and cnts arrays
        keys[node.key] = null;
        if (cnts[node.cnt] == node) {
            if (node.next != null && node.next.cnt == node.cnt)
                cnts[node.cnt] = node.next;
            else
                cnts[node.cnt] = null;
        }

        // Update tail if necessary
        if (tail == node)
            tail = node.prev;

        node.prev = null;
        node.next = null;
    }

    // Method to insert a node into the linked list at the appropriate position
    void insert(Node node, Node next) {
        cnts[node.cnt] = node; // Update the cnts array to reflect the new node
        keys[node.key] = node; // Update the keys array to hold the new node

        if (next == null) { // If no next node, append at the end
            if (tail != null)
                tail.next = node;
            node.prev = tail;
            tail = node;
        } else { // Otherwise, insert before the next node
            if (next.prev != null)
                next.prev.next = node;
            node.prev = next.prev;
            node.next = next;
            next.prev = node;
        }
    }

    // Method to increase the frequency count of a node and reposition it
    void moveUp(Node node) {
        Node next = cnts[node.cnt + 1] != null ? cnts[node.cnt + 1] : cnts[node.cnt];
        if (next == node)
            next = node.next;

        remove(node);
        node.cnt++;
        insert(node, next);
    }

    // Retrieve a value; if the node exists, increase its frequency
    public int get(int key) {
        Node node = keys[key];
        if (node == null)
            return -1; // If the node does not exist, return -1

        moveUp(node); // Move the node up in frequency

        return node.val; // Return the value of the node
    }

    // Add a new node or update an existing node
    public void put(int key, int value) {
        if (capacity == 0) return; // If capacity is 0, do nothing

        Node node = keys[key];
        if (node == null) { // If node does not exist, create a new one
            node = new Node(key, value);

            if (size >= capacity) // If the cache is full, remove the least frequently used node
                remove(tail);
            else
                size++; // Increment size if the cache is not full

            insert(node, cnts[1]); // Insert the new node with frequency count 1
        } else { // If node exists, update its value and frequency
            node.val = value;
            moveUp(node);
        }
    }
}
 */