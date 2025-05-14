import java.util.*;
public class maxofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("enter a  : ");
         a = sc.nextInt();
         System.out.println("enter b  : ");
         b = sc.nextInt();
         System.out.println("enter c  : ");
         c = sc.nextInt();

         if(a>b && a>c){
            System.out.println("a is greater than b and c :  " + a);            
         }
         if(b>c ){
            System.out.println("b is greater than c :  " + b);          
         }
         else{
            System.out.println("c is greater than a and b :  "+c);
         }

         int res = (a>b && a>c)?a:((b>c?b:c));
         System.out.println("Max from given values is : "+res);

         sc.close();

    }
}