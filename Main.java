public class Main{
  Public static void main(String[] args){
      System.out.println("==============Queue===============");
		    Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.peek();
        
        System.out.println("===============Stack===============");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop(); 
        stack.display();
        stack.peek(); 
}
}
