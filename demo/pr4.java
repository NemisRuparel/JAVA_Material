import java.util.Scanner;

public class pr4 {
    
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i = 0, j = 0;
        System.out.println("enter 1st");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter 2nd");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Answer : ");
        System.out.println("enter 1st");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(" " + c[i][j] +" ");
            }
        System.out.println();

        }

    }
}
