import java.util.Scanner;
public class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month ypu want to know no of days : ");
        int n=sc.nextInt();
        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12 ){
            System.out.println("31 days");
        }
        else if(n==2){
            System.out.println("29 days");
        }
        else{
            System.out.println("30 days");
        }

    }
}

