public class Stack {
    LinkedList<Integer> list = new LinkedList<Integer>();

    // Push an element onto the stack
    public void push(int data) {
        Node<Integer> newNode = new Node<Integer>(data);
        newNode.next = list.head;
        list.head = newNode;
    }

    // Pop an element from the stack
    public void pop() {
        if (list.head == null) {
        	System.out.println("Stack is empty!");
        	return;
        }else {
        	int data = list.head.data;
            list.head = list.head.next;
            System.out.println("Popped: " + data);
        }
    }

    // Display the stack
    public void display() {
        list.display();
    }

    // Peek at the top element
    public void peek() {
        if (list.head == null) {
        	System.out.println("Stack is empty!");
        	return;
        }else {
        	System.out.println("Top element: " + list.head.data);
        }
    }
}
