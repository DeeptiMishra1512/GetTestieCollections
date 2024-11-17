package rocks.zipcode;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class ComparableTest {

    LinkedList<Person> list1 = new LinkedList<>();
    Stack<Person> stackOfPerson = new Stack<>();

    @org.junit.Before
    public void setUp() throws Exception {

        //Created a linked list of type Person and the add value to list via person constructor
        //Then list1 can use sort method , as person class implements Comparable

        //Notice use of new Class name , because list is of type Person class
        //Similarly we can use this method to add value to any collection of type class
       list1.add(new Person("Kate", 28));
       list1.add(new Person("nemo", 35));
       list1.add(new Person("Dory", 15));
       list1.add(new Person("cleo", 55));
       list1.add(new Person("theo", 51));

       //STACK
        stackOfPerson.addAll(list1);
        System.out.println("Values in stack: " + stackOfPerson);

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }



    @Test
    public void LinkedListComparable(){
        Collections.sort(list1);


        System.out.println("Sorted Linked list: " + list1);

    }

  @Test
    public void stackComparableTest(){

        Collections.sort(stackOfPerson);
      System.out.println("Sorted Stack: " + stackOfPerson);

    }


}
