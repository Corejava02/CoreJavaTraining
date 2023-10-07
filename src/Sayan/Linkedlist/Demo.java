package Linkedlist;

public class Demo {
    private Node head;
    private Node tail;
    private int length;

    public Demo(int value) // create a new Node
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;
        public int data;

        public Node(int value) {
            this.value = value;
        }

        public Node() {
        }
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
        head=newNode;
        length++;
    }

    public Node removeFirst(){
        Node temp=head;
        if(length==0){
            return null;
        }
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public Node get(int index){
        Node temp = head;
        if(index<0 || index>length){
            return null;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public void reverse(){
        Node temp=head;
        Node cur = head;
        Node prev = head;
        Node next = head.next;
        while (next.next!=null){
            prev=next;
            next = prev.next;
            prev.next=cur;
            temp = cur.next;
            cur = cur.next;
        }
    }

    public void insertIndex(int index, int val)
    {
        if(index==0)
        {
            prepend(val);
        }
        else if(index==length)
        {
            append(val);
        }
        else if(index<0 || index>length)
        {
            System.out.println("Invalid");
        }
        else
        {
            Node newNode = new Node(val);
            newNode.data = val;
            Node temp = head;
            for(int i=0; i<index-1; i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            length++;
        }     
    }

    public Node removeIndex(int index)
    {
        if(index==0)
        {
            removeFirst();
        }
        else if(index==length)
        {
            removeLast();
        }
        else if(index<0 || index>length)
        {
            System.out.println("Invalid");
        }
        else
        {
            Node temp = head;
            for(int i=0; i<index-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            length--;
        }
        return head;
    }
}
