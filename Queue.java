public class Queue {
	LinkedList<Integer> list = new LinkedList<Integer>();

    // Enqueue an element to the queue
    public void enqueue(int data) {
        list.addEnd(data);
    }

    // Dequeue an element from the queue
    public void dequeue() {
        if (list.head == null) {
        	System.out.println("Queue is empty!");
        	return;
        }
        int data = list.head.data;
        list.head = list.head.next;
        System.out.println("Dequeued: " + data);
    }

    // Display the queue
    public void display() {
        list.display();
    }

    // Peek at the front element
    public void peek() {
    	 if (list.head == null) {
    		 System.out.println("Queue is empty!");
         	 return;
         } else {
             System.out.println("Front element: " + list.head.data);
         }   
    }
}
