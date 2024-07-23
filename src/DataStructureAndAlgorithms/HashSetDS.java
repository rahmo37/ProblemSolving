package DataStructureAndAlgorithms;

//        HashSet is from the collection framework
//        HashSet is particularly useful in situations where you need:
//        Fast Lookup: Checking if an element exists in the set is average O(1) time complexity.
//        Unique Elements: Ensuring all elements are unique without duplicates.
//        Fast Removal: Removing elements from the set is average O(1) time complexity.
//        The elements in a HashSet are not ordered. The order in which elements are iterated is not predictable and may change over time.

import java.util.*;

public class HashSetDS {

    public static void main(String[] args) {
//      Lets add a collection of names in a set
//      Set is an interface and HashSet implements the Set interface
        Set<String> names = new HashSet<>();

//      Lets find out the attrtibutes of hash set one by one
//      Lets add some names
        names.add("Walter");
        names.add("Skyler");
        names.add("Jesse");
        names.add("Mike");
        System.out.println(names); // #1 As we can see the order of the insertion is not Guaranteed

//      #2 Set only adds unique items. any duplicate items are removed
        names.add("Walter"); // Not added
        names.add("Skyler"); // Not added

        System.out.println(names); // Duplicates are not added


//      #3 You can only remove an item using the name of the element, not with index
        names.remove("Walter");
        System.out.println(names);

//       #4 Print the size of the Set
        System.out.println(names.size());

//       #5 See if an element is in the Set using the contains() method
        System.out.println(names.contains("Mike"));

//      #6 See if your set is empty or not
        System.out.println(names.isEmpty());

//      #7 Iterate
//      -> Iterate through your set using enhanced for loop

        for (String name : names) {
            System.out.println(name);
        }

//      -> using lamda
        names.forEach(System.out::println);

//      -> Iterate using an iterator
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

//       #8 Clear your set
        names.clear();
        System.out.println(names);


//      #9 we can just dump a list of duplicates in the HashSet that will only contain the unique items
        List<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(1);
        numbersList.add(2);

        Set<Integer> uniqueNumberList = new HashSet<>(numbersList);
        System.out.println(uniqueNumberList);


//       #10 TreeSet is another data structure that adds the elements in order, everything else is excatly same as HashSet
//       However HashSet is very faster then TreeSet
//       #11 LinkedHashSet adds item in the order they were added during insertion
    }

}
