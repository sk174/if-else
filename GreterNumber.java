import java.util.Scanner;
public class GreterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a=sc.nextInt();
        System.out.print("Enter the value of B : ");
        int b=sc.nextInt();
        System.out.print("Enter the value of C : ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greter");
        }
       else if(b>a && b>c){
            System.out.println("B is greter");
        }
        else{
            System.out.println("C is greter");
        }

    }
}
