package DataStructureAndAlgorithms.SearchAlgorithm;

import java.util.Arrays;


public class ArrayListImplementation {
    private int[] array;
    private int size;
    private int capacity;

    // Constructor to initialize the array with a given capacity
    public ArrayListImplementation(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.size = 0;
        this.capacity = initialCapacity;
    }


    // Method to add an element to the array
    public void add(int element) {
        if (size == capacity) {
            increaseCapacity();
        }
        System.out.println(Arrays.toString(array));
        array[size] = element;
        size++;
    }

    // Method to increase the capacity of the array by 10
    private void increaseCapacity() {
        capacity += 10;
        array = Arrays.copyOf(array, capacity);
    }

    // Method to get an element at a specific index
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // Method to get the current size of the array
    public int size() {
        return size;
    }


    public int capacity() {
        return capacity;
    }

    // Method to display the array elements
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListImplementation dynamicArray = new ArrayListImplementation(10);


        // Adding 11 elements to the array
        for (int i = 0; i < 11; i++) {
            dynamicArray.add(i);
        }

        // Displaying the elements of the array
        dynamicArray.display(); // Output: 0 1 2 3 4 5 6 7 8 9 10

        // Checking the size of the array
        System.out.println("Size: " + dynamicArray.size());
        System.out.println("Capacity: " + dynamicArray.capacity());
        System.out.println("Get element at index: " + dynamicArray.get(5));
    }


}


