public class RecursiveBasic {


    public static void main(String[]args){

        System.out.println(recursive());

    }
    static String recursive() {

        System.out.println("이것은 재귀함수");

        return recursive();
    }
}
