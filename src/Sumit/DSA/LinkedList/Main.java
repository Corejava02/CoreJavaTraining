package Sumit.DSA.LinkedList;


public class Main {
    public static void main(String[] args) {
  /*       LinkedListDemo list = new LinkedListDemo(50);
        list.append(60);
        list.append(70);
        list.append(80);
        list.append(90);
        list.printList();*/
    //    list.insertatindex(50,2);
    //list.removeatindex(2);
   // list.replaceval(100, 2);
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        LinkedListDemo.Node node=list.removeLast();
    //    System.out.println();
//        System.out.println(node);
//        list.removeFirst();
//        list.prepend(10);
//        System.out.println("Index Element 3: "+list.get(3).value);
//        list.printList();

       // list.reverse();
   //     list.printList();
   DoublyListDemo list = new DoublyListDemo(10);
  /*  System.out.println(list.getHead());
   System.out.println(list.getTail());
   System.out.println(list.getLength());*/
   list.append(60);
        list.append(70);
        list.append(80);
        list.append(90);
//list.printList();
//list.removeLast();
//System.out.println(list.get(4).value);
list.insert(50,1);
System.out.println();
list.printList();
System.out.println();
list.remove(1);
System.out.println();
list.printList();
System.out.println();
list.set(10, 1);
System.out.println();
list.printList();
//System.out.println("\nTail:"+list.getTail());
    }
}