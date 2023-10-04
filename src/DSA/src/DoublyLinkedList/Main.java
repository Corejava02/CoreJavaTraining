package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.printList();
        list.removeLast();
        System.out.println();
        list.printList();
    }
}
