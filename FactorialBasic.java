public class FactorialBasic {
    public static void main(String[]args){


    System.out.println(factorialRecursive(5));
    System.out.print(factorialLoop(5));


    }
    static int factorialRecursive(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorialRecursive(n-1);
    }

    static int factorialLoop(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }

}
