import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
         num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        num3 = sc.nextInt();
        
        int res = 0;
        res = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The largest number is: " + res);
        sc.close();
    }
}
