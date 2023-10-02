import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class levelUp {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        Integer arrx[] = new Integer[x];
        for(int i=0; i<x; i++){
            arrx[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        Integer arry[] = new Integer[y];
        for(int i=0; i<y; i++){
            arry[i] = sc.nextInt();
        }
        int fal = arrx.length;
        int sal = arry.length;

        Integer[] result = new Integer[fal+sal];
        System.arraycopy(arrx, 0, result, 0, fal);
        System.arraycopy(arry, 0, result, fal, sal); 

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(result) );
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        //System.out.println( Arrays.toString(numbersWithoutDuplicates) );
        int fact=1;
        for(int i=1;i<=n;i++){    
            fact=fact*i;    
        } 
        int product = 1;
        for(int i =0; i<numbersWithoutDuplicates.length; i++){
            product = product * numbersWithoutDuplicates[i];
        }

        if(product == fact){
            System.out.println("GAME CLEARED");
        }else{
            System.out.println("GAME NOT CLEARED");
        }
    }

}