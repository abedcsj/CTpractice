

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Robber {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i)-'0');
        }
        ArrayList<Integer>dp=new ArrayList<>();
        if(list.size()==0){
            dp.add(0);
        }
        if(list.size()==1){
           dp.add(list.get(0));
        }
        if(list.size()>=2){
            dp.add(list.get(0));
            dp.add(Math.max(list.get(0),list.get(1)));
            for(int i=2;i<list.size();i++){
                dp.add(Math.max((dp.get(i - 1)),dp.get(i-2)+list.get(i)));
            }
            }
        Collections.sort(dp,Collections.reverseOrder());
        System.out.println(dp.get(0));
        //System.out.println(dp.size()-1);
        }

        }




