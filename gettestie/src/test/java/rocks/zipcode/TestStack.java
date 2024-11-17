package rocks.zipcode;

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
    public void TestStack2(){
        //Test Pop method
        Stack<Integer> intStack = new Stack<>();
        intStack.push(12345);
        intStack.push(5401);

        int element = intStack.pop();
        System.out.println("Element :" + element);

        Assert.assertEquals(element,5401);

    }

    @Test
    public void PeekStackTest(){
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("Donut");
        objectStack.push(5401);
        Object value = objectStack.peek();
        System.out.println("Value peeked is: " + value);

        Assert.assertEquals(5401,value);


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
//

    }


    // Make a bigger test exercising more Stack methods.....
}
