package assn01;
import java.util.Scanner;
public class JavaStarter {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
//task 1
        if(n==1){
            System.out.println("Hello, Universe!\n");
        }
//task 2
        if(n==2){
            //enter 2 doubles and 1 integer
            double a= s.nextDouble();
            double b=s.nextDouble();
            int m=s.nextInt();
            System.out.println("a = "+ a+", b = "+b+", m = "+m);
        }
     //task 3
        if(n==3){
            double a= s.nextDouble();
            double b=s.nextDouble();
            int m=s.nextInt();
            System.out.println(quadFun(a,b,m));
        }
// task 4
        if(n==4){
    // take a string as input
            String s1= s.nextLine();
            System.out.println(stringFun1(s1));
        }

        if(n==5){
        String s1=s.nextLine();
        int i1=s.nextInt();
        int i2=s.nextInt();
        int i3=s.nextInt();
        int i4=s.nextInt();
        String sA = s1.substring(i1, i2);
        String sB= s1.substring(i3, i4);

        System.out.println(stringFun2(sA)+stringFun2(sB));
        }

        if(n==6){
            int m = s.nextInt();
            double avg=0.0;
            double []arr=new double[m];
            for(int i=0;i<m;i++){
                arr[i]=s.nextDouble();
                avg+=arr[i];
            }
            float x= (float) avg/m;
            System.out.printf("Average = %.2f\n", x);
            for(int i=m-1;i>=0;i--){
                System.out.println("arr["+i+"]="+arr[i]);
            }

        }
    }
    static double quadFun(double a, double b, int m){
        return (a*m*m)+b;
    }
    static String stringFun1(String s1){
        return s1.toUpperCase();
    }
    static String stringFun2(String s1){
     return s1;
    }
}
