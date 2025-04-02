
import java.util.*;

public class BackTracking_15649 {
    static int N;
    static int M;
    static int[]result;
    static boolean[]visited;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        M=scanner.nextInt();
        result=new int[M];
        visited=new boolean[N+1];

        backtrack(0);

    }

    static void backtrack(int depth){

        if(depth==M){
            for(int i=0;i<M;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=N;i++){
            if(!visited[i]){
                visited[i]=true;
                result[depth]=i;
                backtrack(depth+1);
                visited[i]=false;
            }
        }

    }

}


