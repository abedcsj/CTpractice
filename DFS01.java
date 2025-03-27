import java.util.Scanner;

public class DFS01 {
    static int N;
    static int M;
    static int[][]matrix;

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        M=scanner.nextInt();
        scanner.nextLine();
        matrix=new int[N][M];
        int count=0;
        for(int i=0;i<N;i++){
            String str=scanner.nextLine();
            for(int j=0;j<M;j++) {
                matrix[i][j]=str.charAt(j)-'0';
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                if(dfs(i,j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean dfs(int x,int y){
        if(x<0||x>=N||y<0||y>=M){
            return false;
        }
        if(matrix[x][y]==0){
            matrix[x][y]=1;
            dfs(x-1,y);
            dfs(x,y+1);
            dfs(x+1,y);
            dfs(x,y-1);
            return true;
        }
        return false;
    }


}

