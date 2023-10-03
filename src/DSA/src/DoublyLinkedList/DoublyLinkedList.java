package DoublyLinkedList;

import javax.sound.midi.Soundbank;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value=value;
        }
    }

    public void getHead(){
        if(head==null){
            System.out.println("Head: "+null);
        }
        else {
            System.out.println("Head: "+head.value);
        }
    }

    public void getTail(){
        if(tail==null){
            System.out.println("Tail: "+null);
        }
        else {
            System.out.println("Tail: "+tail.value);
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        newNode.prev = tail;
        tail.next=newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if (length==0){
            return null;
        }
        Node temp = tail;
        if(length == 1){
            head = null;
            tail =null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print("|"+temp.value+"|");
            temp = temp.next;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail=newNode;
        length=1;
    }
}
