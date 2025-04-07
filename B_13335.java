import java.util.*;

public class B_13335 {


    static int n;
    static int w;
    static int L;
    static int[]trucks;
    static int bridgeWeight=0;
    static int count=0;
    static int howMany=0;
    static Queue<Integer>bridge=new LinkedList<>();
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        w=scanner.nextInt();
        L=scanner.nextInt();
        scanner.nextLine();
        trucks=new int[n];

        String[] str = scanner.nextLine().split(" ");
        for(int i=0;i<n;i++) {
            trucks[i] = Integer.parseInt(str[i]);
        }
        Go(n,w,L);
    }

    static void Go(int n,int w,int L){
        for(int i=0;i<w;i++){
            bridge.offer(0);
        }
        while (howMany< n){
            bridgeWeight = bridgeWeight - bridge.poll();
            if(bridgeWeight+trucks[howMany]<=L) {
                bridge.offer(trucks[howMany]);
                bridgeWeight=bridgeWeight+trucks[howMany];
                howMany=howMany+1;
            }else{
                bridge.offer(0);
            }
            count++;
        }
        count=count+w;
        System.out.println(count);
    }
}
