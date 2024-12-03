package org.example.concepts.collections;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//he LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. 

public class LinkedListEx {

    // 1 create
    public static void createLL() {

        // 1
        LinkedList<String> cars = new LinkedList<String>();

        // 2
        List<Integer> nums = new LinkedList<>();

        // 3
        LinkedList<String> copyOfCars = new LinkedList<>(cars);

        // 4
        String[] towns = { "akj", "dffd", "jhkj" };
        LinkedList<String> copyOfTowns = new LinkedList<>(
                Arrays.asList(towns));

        // 5
        ArrayList<Integer> numbers = new ArrayList<>();
        LinkedList<Integer> copyOfNunbers = new LinkedList<>(numbers);
    }

    // 2
    public static void manips() {

        // add items normal
        LinkedList<String> names = new LinkedList<>();
        names.add("kl");
        names.add("dfsdf");
        names.add("dfsdf");
        names.add(1, "second name");
        System.out.println("Original :" + names);

        // add to specific places
        names.addFirst("Dinuka");
        names.addLast("Kavinda");
        System.out.println("First and Last : " + names);

        LinkedList<String> newNAmes = new LinkedList<>();
        newNAmes.add("new");
        newNAmes.add("name");

        // with push === adds to beginning, not to end
        names.push("to brgin");
        names.push("to brgin begin");
        System.out.println("After PUSH : " + names);

        // POP is also here === removes and returns first element
        System.out.println("removeed element : " + names.pop());
        System.out.println("After POP :" + names);

        // with offer
        names.offer("to last");
        System.out.println("After offer : " + names);

        names.offerLast("new last");
        names.offerFirst("new first");
        System.out.println("After offer First and Last : " + names);

        // add all normal
        names.addAll(newNAmes);
        System.out.println("After Add All : " + names);

        // add all in a specific place
        names.addAll(3, newNAmes);
        System.out.println("After Add All specific place : " + names);

        // clear all elements inisde
        newNAmes.clear();

        // get and set
        System.out.println(names.get(1));
        names.set(1, "aaaaaaaaaaaa");
        System.out.println("after get and set : " + names);

        System.out.println(names.getFirst()); 
        System.out.println(names.getLast()); 

        //retrirve first element , same as getFirst
        System.out.println(names.element()); 
        System.out.println(names.peek());
        System.out.println(names.peekFirst());
        //peekLast for last element

        //poll() === Retrieves and removes the first item in the list.
        //  same with pollFirst() and pollLast()

        //indexes 
        System.out.println(names.indexOf("Kavinda"));  //first
        System.out.println(names.lastIndexOf("dfsdf")); //if more than one value is existed, show last one      

    }

    // 2
    public static void moreManipsAndRemovings() {

        LinkedList<Integer> numberzEven = new LinkedList<>();
        LinkedList<Integer> numberzOdd = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                numberzEven.add(i);
            } else {
                numberzOdd.offer(i);
            }
           
        }

        System.out.println("Original Even: " +numberzEven);
        System.out.println("Original Odd: " +numberzOdd);

        //dif types of checks 
        //size
        System.out.println(numberzEven.size());

        //is empty
        System.out.println(numberzOdd.isEmpty());

        //exist or not
        System.out.println(numberzEven.contains(1));
        System.out.println(numberzEven.contains(2));

        //removes the value in the given index
        numberzEven.remove(2);

        //remove with a specific condition
        numberzOdd.removeIf(num -> num<=3);

        //more
        //removeAll() , removeFirst() , removeLast() , removeFirstOccurrence() , removeLastOccurrence() , 

        // change the original array by given condition
        numberzEven.replaceAll(num-> num*10);

        System.out.println(numberzEven);
        System.out.println(numberzOdd);

        //sort() === alphabatically or numerically

        
        //create a view of a portion of a list (not a new independent list)
        //toindex is excluded
        System.out.println( numberzEven.subList(1, 3));

        List<Integer> newNums = numberzEven.subList(1, 3);
        System.out.println(newNums);

        LinkedList<Integer> newLL = new LinkedList<>(numberzEven.subList(1, 3));

        System.out.println(newLL);

      


        


        




    }

}
