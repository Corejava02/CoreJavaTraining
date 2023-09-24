package LinkedList;

public class LinkedListDemo {

    private Node head;
    private Node tail;
    private int length;
    public LinkedListDemo(int value) // create a new Node
    {
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
    }

    public void append(int value) //create a new node
    {}

    public void prepend(int value){} //create a new node

    public boolean insert(int index, int value){return true;} //create a new node


}
