package rocks.zipcode;

//import com.sun.org.apache.xpath.internal.operations.Boolean;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class  TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }


    @Test
    public void TestStackPop() {
        //Test Pop method
        Stack<Integer> intStack = new Stack<>();
        intStack.push(12345);
        intStack.push(5401);

        int element = intStack.pop();
        System.out.println("Element :" + element);

        Assert.assertEquals(element, 5401);

    }

    @Test
    public void TestStackPeek() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("Donut");
        objectStack.push(5401);
        Object value = objectStack.peek();
        System.out.println("Value peeked is: " + value);

        Assert.assertEquals(5401, value);
    }


    @Test
    public void TestStackIsEmpty() {
        Stack<Object> emptyStack = new Stack<>();
        emptyStack.push("Name");
        emptyStack.push("Address");
        Assert.assertFalse(emptyStack.isEmpty());

        System.out.println("Name was found: " + emptyStack.search("Name"));

        emptyStack.pop();
        emptyStack.pop();
        Assert.assertTrue(emptyStack.isEmpty());

    }


    @Test
    public void TestStackSearch() {
        Stack<Object> emptyStack = new Stack<>();
        emptyStack.push("Name");
        emptyStack.push("Address");
        emptyStack.add("Aarav");
        emptyStack.add("Arjun");


        System.out.println("Name was found: " + emptyStack.search("Name"));

        //Search in stack gives position of element in stack.
        Assert.assertEquals(4, emptyStack.search("Name"));
    }

    @Test
    public void StackAddRemoveIndexTest() {

        //ADD AND REMOVE TO AND FROM GIVEN INDEX POINT
        Stack<Object> removeMethod = new Stack<>();

        removeMethod.add(0, 1001);
        removeMethod.add(1, 200);
        removeMethod.add(2, 300);

        //Remove from a given index position in STACK
        Integer valueRemoved = (Integer) removeMethod.remove(2);

        System.out.println("Stack : " + removeMethod);
        System.out.println("Value removed : " + valueRemoved);

    }

}

/*EXAMPLE FOR HOW TO USE OBJECT GENERIC TYPE WITH STRING OR INTEGER DATA*/

//        Stack<Object> objectStack = new Stack<>();
//        objectStack.push("Donut");
//        objectStack.push(5401);
//
//// Peek at the top of the stack and safely cast it to String if needed
//        Object top = objectStack.peek();
//        if (top instanceof String) {
//            String value = (String) top;
//            System.out.println(value);  // This would output "Donut"
//        } else {
//            System.out.println("Top element is not a String");
//        }
//
//// You can also safely pop and cast values:
//        Object popped = objectStack.pop();
//        if (popped instanceof Integer) {
//            Integer intValue = (Integer) popped;
//            System.out.println("Popped value: " + intValue);  // Output will be 5401
//        }


    // Make a bigger test exercising more Stack methods.....

