import java.util.*;


public class BackTracking_15652 {

    static int N;
    static int M;
    static int[]result;
    static boolean[] visited;

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        N=scanner.nextInt();
        M=scanner.nextInt();
        result=new int[M];
        visited=new boolean[N+1];
        backtrack(0,1);

    }
    static void backtrack(int depth,int start){
        if(depth==M){
            for(int i=0;i<M;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<=N;i++){
                result[depth] = i;
                backtrack(depth + 1,i);
        }
    }
}
