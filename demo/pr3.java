public class pr3 {
    public static void main(String[] args) {
        int a = 321;
        int rev = 0;
        while (a > 0 ) {
            rev = a%10;
            a = a/10;
            System.out.print(rev);
        }
    }
}
