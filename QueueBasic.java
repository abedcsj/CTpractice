import java.util.*;

public class QueueBasic {

    public static void main(String[]args){
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        queue.poll();
        queue.poll();


        while(!queue.isEmpty()){
            System.out.println(queue.poll()+" ");

        }

    }
}
