import java.util.*;

public class B_14503 {

    static int N;
    static int M;
    static int[][] list;
    static boolean[][] cleaned;
    static int count = 0;


    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int way = scanner.nextInt();

        list = new int[N][M];
        cleaned = new boolean[N][M];
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                list[i][j] = Integer.parseInt(line[j]);
            }
        }
        clean(a, b, way);
        System.out.println(count);
    }

    static void clean(int a, int b, int way) {
        if(!cleaned[a][b]) {
            cleaned[a][b] = true;
            count++;
        }

        for(int i=0;i<4;i++){
            way=(way+3)%4;
            int newX=a+dx[way];
            int newY=b+dy[way];
            if(newX>=0&&newY>=0&&newX<N&&newY<M){
                if(!cleaned[newX][newY]&&list[newX][newY]==0){
                    clean(newX,newY,way);
                    return;
                }
            }
        }
        int backWay=(way+2)%4;
        int newX=a+dx[backWay];
        int newY=b+dy[backWay];
        if(newX >= 0 && newY >= 0 && newX < N && newY < M && list[newX][newY]==0){
            clean(newX,newY,way);
        }
    }
}
