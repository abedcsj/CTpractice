import java.util.*;

public class StackBasic {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.pop();

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
