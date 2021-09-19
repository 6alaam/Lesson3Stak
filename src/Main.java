import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
  //     MyStack<Integer> myStack = new MyStack<>(10);

  //     myStack.push(5);
  //     myStack.push(2);
  //     myStack.push(9);
  //     myStack.push(1);
  //     myStack.push(4);
  //     myStack.push(5);
  //     myStack.push(2);
  //     myStack.push(9);
  //     myStack.push(1);
  //     myStack.push(4);
  //     myStack.push(4);
  //     for (int i = 0; i < 11; i++) {
  //         System.out.println(myStack.pop());

  //     }
  //      Expression e = new Expression("()+{}+[]");
  //      System.out.println(e.checkBracked());

       MyQueue<Integer> queue= new MyQueue<>();
      queue.insert(3);
     queue.insert(2);
      queue.insert(7);
       queue.insert(4);
      for (int i = 0; i < 4; i++) {
          System.out.println((queue.remove()));
        }
   }



}

