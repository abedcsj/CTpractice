import java.util.*;


public class DFS_2667 {

    static int N;
    static int[][]matrix;
    static int numberOfApt=0;
    static ArrayList<Integer>list=new ArrayList<>();
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        scanner.nextLine();
        matrix=new int[N][N];
        int count=0;
        for(int i=0;i<N;i++){
            String str=scanner.nextLine();
            for(int j=0;j<N;j++){
                matrix[i][j]=str.charAt(j)-'0';
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(Dfs(i,j)){
                    count++;
                    list.add(numberOfApt);
                    numberOfApt=0;
                }
            }
        }

        System.out.println(count);
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static boolean Dfs(int x, int y){
        if(x<0||x>=N||y<0||y>=N){
            return false;
        }
        if(matrix[x][y]==1){
            numberOfApt++;
            matrix[x][y]=0;
            Dfs(x,y+1);
            Dfs(x-1,y);
            Dfs(x,y-1);
            Dfs(x+1,y);
            return true;
        }
        return false;
    }
}
