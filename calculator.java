
import java.util.Scanner;
public class calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a=sc.nextInt();
        System.out.println("Enter the second value: ");
        int b=sc.nextInt();
        System.out.println("Enter the operators +,-,*,/ : ");
        char po=sc.next().charAt(0);
        if(po == '+'){
             System.out.println("Output: "+ (a+b));
        }else if(po == '-'){
             System.out.println("Output: "+ (a-b));
        }else if(po == '*'){
             System.out.println("Output: "+ (a*b));
        }else if(po == '/'){
             System.out.println("Output: "+ (a/b));
        }else{
             System.out.println("Get lost");
        }
    }
}