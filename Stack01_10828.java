import java.util.Scanner;
import java.util.Stack;

public class Stack01_10828 {

/*
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < N; i++){

            String input=scanner.next();
            if(input.equals("push")){
               stack.push(scanner.nextInt());
            }else if(input.equals("pop")){
                if(!stack.isEmpty()) {
                    System.out.println(stack.pop());

                }else {
                    System.out.println("-1");
                }
            }else if(input.equals("size")){
                System.out.println(stack.size());

            }else if(input.equals("empty")){
                if(!stack.isEmpty()){
                    System.out.println("0");
                }else{System.out.println("1");
                    }
            }else if(input.equals("top")){
                if(!stack.isEmpty()) {
                    System.out.println(stack.peek());
                }else{System.out.println("-1");}

            }

        }


    }
*/


    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        StringBuilder sb=new StringBuilder();
        Stack<Integer>stack=new Stack<>();

        for (int i = 0; i < N; i++){

            String input=scanner.next();
            if(input.equals("push")){
                stack.push(scanner.nextInt());
            }else if(input.equals("pop")){
                if(!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                }else {
                    sb.append("-1").append("\n");
                }
            }else if(input.equals("size")){
                sb.append(stack.size()).append("\n");

            }else if(input.equals("empty")){
                if(!stack.isEmpty()){
                    sb.append("0").append("\n");
                }else{ sb.append("1").append("\n");
                }
            }else if(input.equals("top")){
                if(!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                }else{ sb.append("-1").append("\n");}

            }


        }
        System.out.println(sb);
    }



}

