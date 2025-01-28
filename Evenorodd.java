import java.util.Scanner;
public class Evenorodd {
    private static Scanner sc; 
    public static void main(String[] args){
        int Number;
        sc=new Scanner(System.in);
        System.out.println("\n please enter any integer value:" );
        Number=sc.nextInt();
        if(Number%2==0){
            System.out.println("\n You have entered an Even number");
        }
        else{
            System.out.println("\n You havea entered Odd number");
        }
       
    }


}

