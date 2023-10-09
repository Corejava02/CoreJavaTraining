package Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printStack();
        stack.pop();
        System.out.println();
        stack.printStack();
    }
}
