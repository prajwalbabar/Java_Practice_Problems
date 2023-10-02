import java.util.Scanner;
public class marbals {
public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   int N = in.nextInt();
   System.out.println(N - in.next().replaceAll("W+|Y+|B+", ".").length());
}
}