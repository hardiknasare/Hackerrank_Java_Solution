import java.util.*;
import java.io.*;

public class Solution7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = 1;
            int o = a;
            for (int k = 0; k < n; k++) {
                o = o + x * b;
                System.out.print(o);
                x = x << 1;
                System.out.print(' ');
            }
            System.out.println();
        }
        in.close();
    }
}