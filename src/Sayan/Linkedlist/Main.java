package Linkedlist;

public class Main {
    public static void main(String[] args) {
        Demo list = new Demo(50);
        list.append(60);
        list.append(70);
        list.append(80);
        list.append(90);
        //Add a Node at The End of a Linkedlist
        System.out.println("The Linkedlist = ");
        list.printList();
        System.out.println();
        //Add a Node at The Beginning of a Linkedlist
        System.out.println("After Adding a Node in The Beginning, The Linkedlist = ");
        list.prepend(10);
        list.printList();
        System.out.println();
        //Remove a Node at The Beginning of a Linkedlist
        System.out.println("After Removing a Node at The Beginning, The Linkedlist = ");
        list.removeFirst();
        list.printList();
        System.out.println();
        //Remove a Node at The End of a Linkedlist
        System.out.println("After Removing a Node at The End, The Linkedlist = ");
        list.removeLast();
        list.printList();
        System.out.println();
        //Get The Index Value of a Node in The Linkedlist
        System.out.println("The Value of The Node in The Index 2 = "+list.get(2).value);
        //Set THhe Index Value of a Node in The Linkedlist
        list.set(2, 10);
        System.out.println("After Replacing The Value in The Index 2, The Linkedlist = ");
        list.printList();
        System.out.println();
        //Reverse The Linkedlist
        System.out.println("After Reversing, The Linkedlist = ");
        list.reverse();
        list.printList();
        System.out.println();
        //Insert a Node at Any Index 
        System.out.println("After Insert a Node at Index 3, The Linkedlist = ");
        list.insertIndex(3, 70);
        list.printList();
        System.out.println();
        //Remove a Node at Any Index
        System.out.println("After Remove a Node at Index 2, The Linkedlist = ");
        list.removeIndex(2);
        list.printList();
        System.out.println();
    }
}
