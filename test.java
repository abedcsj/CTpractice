import java.util.Scanner;

public class test {
    public static void main (String[] args) {
        System.out.println("Enter a line of text.");
        String s1 = "", s2;
        int index;
        Scanner keyboard = new Scanner (System.in);
        while(true) {
            s1 = keyboard.nextLine();
            if (s1.equals( "quit")) break;
            s2 = s1.toLowerCase();
            index = s2.indexOf("hate");
            s1 = s1.substring(0, index) + "love" + s1.substring(index + 4);
            System.out.println("I have rephrased that line to read:\n" + s1);
        }
        keyboard.close();

    }
}
