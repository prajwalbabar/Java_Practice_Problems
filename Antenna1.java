import java.lang.*;
import java.util.*;

public class Antenna1{
    public static void main(String[] args)throws java.lang.Exception{
        Antenna[] ante = new Antenna[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<ante.length;i++){

           int a=sc.nextInt();
           sc.nextLine();
           String b=sc.nextLine();
           String c=sc.nextLine();
           double d=sc.nextDouble();
           sc.nextLine();

          ante[i]= new Antenna(a,b,c,d);
        }
        String name = sc.nextLine();

        double VSWR = sc.nextDouble();
        sc.nextLine();
        
        
        
        //calling method below
        int ans = searchAntennaByName(ante,name);
        if(ans==0){
            System.out.println("There is no antenna with the given parameter.");
        }
        else{
            System.out.println(ans);
        }
        
        
        
        //calling method below
        Antenna[] ans2 = sortAntennaByVSWR(ante,VSWR);
        if(ans2==null){
            System.out.println("No Antenna found");
        }
        else{

            for (int i = 0; i <ans2.length ; i++) {
                System.out.println(ans2[i].projectLead);
            }
        }

    }





//first method
    public static int searchAntennaByName(Antenna[] ante, String name){
        for(int i=0;i<ante.length;i++){
            if((ante[i].antennaName).equalsIgnoreCase(name)){
                return ante[i].antennaid;
            }
        }

        return 0;
    }
    
    
    //second method
    public  static Antenna[] sortAntennaByVSWR(Antenna[] antennas,double inputAntennaVSWR)
{
   Antenna[] help=new Antenna[0];
    for (int i = 0; i <antennas.length ; i++) {
        if(antennas[i].antennaVSWR<inputAntennaVSWR)
        {
            help=Arrays.copyOf(help,help.length+1);
            help[help.length-1]=antennas[i];
        }
    }
 //bubble sort

    for (int i = 0; i < help.length-1; i++) {
        for (int j = 0; j <help.length-i-1 ; j++) {
            if(help[j].antennaVSWR>help[j+1].antennaVSWR)
            {
               Antenna temp=help[j];
               help[j]=help[j+1];
               help[j+1]=temp;
            }
        }
    }
    if(help.length==0)
    {
        return  null;
    }
   else
    {
        return help;
    }

}

}

class Antenna{
    public int antennaid;
    public String antennaName;
    public String projectLead;
    public double antennaVSWR;

    Antenna(int antennaid,String antennaName,String projectLead,double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;

        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }
}