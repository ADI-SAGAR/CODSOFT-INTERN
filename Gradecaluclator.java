import java.awt.*;
import java.util.Scanner;

public class Gradecaluclator{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5,m6;

        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
        int sum=(m1+m2+m3+m3+m4+m5+m6);
        int total=6;
        double Average=(sum)/total;
        if(Average>90&& Average<100)
        {
            System.out.println("first class with Grade A");
        }
        else if(Average>80&& Average<90)
        {
            System.out.println("second class With grade B ");
        }
        else if(Average>70&&Average<80)
        {
            System.out.println("third class With Grade C ");
        }
         else if(Average>60&&Average<70)
        {
            System.out.println("fourth class With Grade  D ");
        }
         else{
            System.out.println("FAIL");
        }
        System.out.println("the total marks obtained by a student is "+sum);
        System.out.println("The avg percentage is "+Average);

    }
}