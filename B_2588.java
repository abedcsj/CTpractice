import java.util.*;


public class B_2588 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        String second=scanner.nextLine();

        int a=second.charAt(2)-'0';
        int b=second.charAt(1)-'0';
        int c=second.charAt(0)-'0';

        int firstLine=first*a;
        int secondLine=first*b;
        int thirdLine=first*c;

        int total=firstLine+secondLine*10+thirdLine*100;

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(total);




    }

}
