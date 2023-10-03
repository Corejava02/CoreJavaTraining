package Sumit.DSA.LinkedList;

public class DoublyListDemo {
    private Node head;
    private Node tail;
    private int length;

    public DoublyListDemo(int value) // create a new Node
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
    public int getHead()
    {
        if(head==null){
            System.out.println("Head is null.");
        }
        return head.value;
    }
    public int getTail()
    {
        if(tail==null){
            System.out.println("Tail is null.");
        }
        return tail.value;
    }
    public int getLength()
    {
        return length;
    }
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print("|"+temp.value+"|");
            temp=temp.next;
        }
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
        }
        else {
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        length++;
    }
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp=tail.prev;
        temp.next=null;
        tail.prev=null;
        tail=temp;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public Node removeFirst(){
        Node temp=head;
        if(length==0){
            return null;
        }
        head=head.next;
        head.prev=null;
        temp.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public Node get(int index){
        int mid=length/2;
        Node temp;
        if(index<0 || index>length){
            return null;
        }
        else if(index>=mid)
        {
             temp = tail;
           for(int i=length-1;i>index;i--){
            temp=temp.prev;
        } 
        }
        else{
            temp = head;
            for(int i=0;i<index;i++){
            temp=temp.next;
        }
        }
        return temp;
    }
    public void insert(int value,int index)
    {
        Node newNode = new Node(value);
        Node temp;
        if(length==0){
            head=newNode;
        }
        else {
        temp=get(index);
        newNode.next=temp;
        newNode.prev=temp.prev;
        temp.prev.next=newNode;
        temp.prev=newNode;
        length++;
        }
    }
    public  Node remove(int index)
    {
        Node temp,pre;
        if(length==0){
            return null;
        }
        temp=get(index);
        pre=temp.prev;
        pre.next=temp.next;
        temp.next.prev=pre;
        temp.next=null;
        temp.prev=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public Node set(int value,int index)
    {
        Node temp;
        if(index<0 || index>length){
            return null;
        }
        temp=get(index);
        temp.value=value;
        return temp;
    }



}
