import java.util.*;

public class BFS {
    static int N;
    static int M;
    static int[][]graph;
    static boolean[][]visited;

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        M=scanner.nextInt();
        scanner.nextLine();
        graph=new int[N][M];
        visited=new boolean[N][M];
        for(int i=0;i<N;i++){
            String str=scanner.nextLine();
            for(int j=0;j<M;j++){
                graph[i][j]=str.charAt(j)-'0';
            }
        }
        Bfs(0,0);
        System.out.println(graph[N-1][M-1]);
    }

    public static void Bfs(int x,int y){
        int[]dx={0,0,-1,+1};
        int[]dy={-1,+1,0,0};
        Queue<int[]>queue=new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y]=true;
        while(!queue.isEmpty()) {
            int[]now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = now[0] + dx[i];
                int newY = now[1] + dy[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (!visited[newX][newY] && graph[newX][newY] == 1) {
                        queue.offer(new int[]{newX, newY});
                        graph[newX][newY]=graph[now[0]][now[1]]+1;
                        visited[newX][newY] = true;
                    }
                }
            }
        }



    }
}
