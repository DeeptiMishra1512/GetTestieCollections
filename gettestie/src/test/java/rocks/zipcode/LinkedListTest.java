package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<Object> list1 = new LinkedList<>();
    @org.junit.Before
    public void setUp() throws Exception {

        list1.add(0,"Big Cat");
        list1.add("Dog");
        list1.add("Cat");

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

@Test
    public void LinkedListTest1(){
   //Test to add remove addfirst addlast remove first removelast

   System.out.println("Size of linked list is: "+ list1.size());
    System.out.println("List Values : " + list1);

   list1.addLast("Meow");


   System.out.println("List Values: " + list1);
}

//cat is  good
//    public class LinkedListIteratorExample {
//        public static void main(String[] args) {
//            // Create a LinkedList of integers
//            LinkedList<Integer> list = new LinkedList<>();
//
//            // Add some elements to the LinkedList
//            list.add(10);
//            list.add(20);
//            list.add(30);
//            list.add(40);
//            list.add(50);
//
//            // Obtain an Iterator for the LinkedList
//            Iterator<Integer> iterator = list.iterator();
//
//            // Traverse the LinkedList using the Iterator
//            System.out.println("List elements using Iterator:");
//            while (iterator.hasNext()) {
//                // Retrieve the next element
//                Integer value = iterator.next();
//                System.out.print(value + " ");
//            }
//            System.out.println();  // New line after printing all elements
//
//            // Modify the list by removing elements using the iterator
//            iterator = list.iterator();  // Reset the iterator
//
//            // Remove the first element (10) from the list
//            if (iterator.hasNext()) {
//                iterator.next();  // Skip the first element (10)
//                iterator.remove(); // Remove it
//            }
//
//            // Print the list after removal
//            System.out.println("List after removing the first element:");
//            iterator = list.iterator();
//            while (iterator.hasNext()) {
//                System.out.print(iterator.next() + " ");
//            }
//            System.out.println();  // New line after printing all elements
//        }
//    }



@Test
    public void LinkedlistIteratorTest(){
       list1.addFirst("Aarav");
       list1.addLast("Noah");


    LinkedList<Object> stringList = new LinkedList<>(list1);

    Iterator<Object> iterate = stringList.iterator();

    if(iterate.hasNext()){
        System.out.println("Linkedlist values :"+ iterate.next());
        iterate.next();
        iterate.remove();
       while(iterate.hasNext()) {
           System.out.println("Linkedlist values1 :" + iterate.next());
       }
    }
    }

}


