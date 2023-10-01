import java.util.Arrays;
import java.util.Scanner;



public class Antenna{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        antenna an[] =  new antenna[4];
        for(int i =0; i<4; i++){
            int a = sc.nextInt();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            an[i] = new antenna(a, b, c, d);
        }
        String n = sc.nextLine();
        double vs = sc.nextDouble();
        int ans = searchAntennaByName(an,  n);
        antenna ans2[] = sortAntennaByVSWR(an, vs);
     
    }

    public static int searchAntennaByName(antenna an[], String n){
        for(int i =0; i<4; i++){
            if(an[i].antennaName.equals(n)){
                return an[i].antennaid;
            }
        }
        return 0;
    }

    public static antenna[] sortAntennaByVSWR(antenna an[], double vs){
        Arrays.sort(an);
        return null;
    }
   
}

class antenna {
    int antennaid;
    String antennaName;
    String projectLead;
    double antennaVSWR;

    public antenna(int a, String b, String c, double d){
        this.antennaid = a;
        this.antennaName = b;
        this.projectLead = c;
        this.antennaVSWR = d;
    }
}