class demo1{
     static int i= 0;
     void count(){
        i++;
        System.out.println(i);
     }
}
public class pr9 {
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        demo1 d2 = new demo1();
        d1.count();
        d2.count();

    }
}
