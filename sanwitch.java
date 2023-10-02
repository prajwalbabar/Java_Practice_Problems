import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sanwitch {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s, p, f;
        int g,a;
        for(int i=0; i<t; i++){
            s = sc.nextInt();
            p = sc.nextInt();
            f = sc.nextInt();
            g = sc.nextInt();
            a = sc.nextInt();
            // comment
            int san=0;
            int sau=0;
            if(g>a){
                while(s != 0 || p!=0 || s!=1){
                   san++;
                   p--;
                   s=s-2;
                }
            }else{
                while(s != 0 || f!=0 || s!=1){
                    sau++;
                    f--;
                    s=s-2;
                    
                }
            }
            
            if(san>sau){
                System.out.print(san * g);
            }else{
                System.out.print(sau * a);
            }
            
        }
    }
}