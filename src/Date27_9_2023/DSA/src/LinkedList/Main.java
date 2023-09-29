package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo(50);
        list.append(60);
        list.append(70);
        list.append(80);
        list.append(90);
        list.printList();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        LinkedListDemo.Node node=list.removeLast();
        System.out.println();
//        System.out.println(node);
//        list.removeFirst();
//        list.prepend(10);
//        System.out.println("Index Element 3: "+list.get(3).value);
//        list.printList();

        list.reverse();
        list.printList();
    }
}