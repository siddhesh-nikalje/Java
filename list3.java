
import java.util.ArrayList;

public class list3 
{
    public static void main(String[] args) {
        // append(): Adds an element to the end of the list
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList); // OUTPUT: [1, 2, 3, 4]

        // extend(one value): Extends the list by adding all elements from another iterable (i.e list)
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list1.addAll(list2);
        System.out.println(list1); // OUTPUT: [1, 2, 3, 4, 5]

        // insert(): Inserts an element at a specified position in the list
        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(85);
        myList2.add(65);
        myList2.add(97);
        myList2.add(1, 4); // here 1 is the Index and 4 is the Value to be inserted on the index 1
        System.out.println(myList2); // OUTPUT: [85, 4, 65, 97]

        // remove(value): Removes the first occurrence of a value from the list
        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(2);
        myList3.add(3);
        myList3.remove((Integer) 2); // here 2 is the Value from list
        System.out.println(myList3); // Output: [1, 3]

        // pop(index): Removes and returns the element at a specified index in the list
        ArrayList<Integer> myList4 = new ArrayList<>();
        myList4.add(1);
        myList4.add(2);
        myList4.add(3);
        int poppedElement = myList4.remove(1); // here 1 is the index Value
        System.out.println(poppedElement); // OUTPUT: 2
        System.out.println(myList4); // [1, 3]

        // count(value): Returns the number of occurrences of a value in the list
        ArrayList<Integer> myList5 = new ArrayList<>();
        myList5.add(1);
        myList5.add(2);
        myList5.add(2);
        myList5.add(3);
        myList5.add(2);
        int count = 0;
        for (int i : myList5) {
            if (i == 2) {
                count++;
            }
        }
        System.out.println(count); // OUTPUT: 3

        // index(value): Returns the index of the first occurrence of a value in the list
        ArrayList<Integer> myList6 = new ArrayList<>();
        myList6.add(1);
        myList6.add(2);
        myList6.add(3);
        myList6.add(4);
        System.out.println(myList6.indexOf(3)); // here 3 is the Value
        // OUTPUT: 2

        // copy(): Creates a shallow copy of the list
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        ArrayList<Integer> newList = new ArrayList<>(originalList);
        System.out.println(newList); // Output: [1, 2, 3]

        // clear(): Removes all elements from the list
        ArrayList<Integer> myList7 = new ArrayList<>();
        myList7.add(1);
        myList7.add(2);
        myList7.add(3);
        myList7.clear();
        System.out.println(myList7); // OUTPUT: []
    }
}
