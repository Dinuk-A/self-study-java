package org.example.concepts.collections;

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

//mainly used in Undo/Redo Systems: Stores actions for undo/redo operations in text editors or games.
//LIFO (Last In, First Out)
//Ideal for temporary data storage

public class StacksEx {

    public static void createStacks() {

        // 1
        Stack<String> textEditor = new Stack<>();

        // 2 === modern, most efficient and recommended way
        // in next lesson
        Deque<Character> symbols = new ArrayDeque<>();

    }

    // 2
    public static void basicOpsxmWithUNDO() {

        Stack<String> textEditor = new Stack<>();

        // add elements
        textEditor.push("Hello");
        textEditor.push("World");
        textEditor.push("Random Text");

        // see whats on top right now
        System.out.println(textEditor.peek());

        // undo (remove lastly pushed value from stack)
        System.out.println(textEditor.pop());

    }

    //3
    public static void more(){

        Stack<String> textEditor = new Stack<>();

        textEditor.push("Hello");
        textEditor.push("World");
        textEditor.push("Random Text");
        textEditor.push("Random Text 2");
        textEditor.push("Random Text 3");
        textEditor.push("Random Text 4");

        System.out.println(textEditor.isEmpty());

        //from top
        //start from 1, not 0 indexed
        System.out.println(textEditor.search("Random Text 2"));

        System.out.println(textEditor.size());

        System.out.println(textEditor.contains("Random Text 2"));
        System.out.println(textEditor.contains("Random Text 7"));

        //just a visual representation
        System.out.println(textEditor.toString());

        //convert into actual array
        String[] arr = textEditor.toArray(new String[0]);

        //to array list
        ArrayList<String> arrList = new ArrayList<>(textEditor);

        //same with LL

        textEditor.clear();

    }

    //3
    public static void reverseOrder(){

        Stack<Integer> nums = new Stack<>();

        for(int i = 0; i<10;i++){
            nums.push(i);
        }

        System.out.println("Original : "+ nums);
        System.out.println("top : " + nums.peek());

        Stack<Integer> reversedNums = new Stack<>();

        //traditional for loops iterate bottom to top, so we cant use them

        //lets use a while
        while (!nums.isEmpty()) {
            int poppedValue = nums.pop();
            reversedNums.push(poppedValue);
        }

        System.out.println("Reversed : "+ reversedNums);

        //2
        /*
         * convert into a list
         * then use Collection.reverse(name of list) 
         *  then .addAll to new Stack
         */

    }

}
