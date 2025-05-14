class demo {

    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
public class overloading {
    public static void main(String[] s){

        demo d1 = new demo();
        int a=10,b=20,c=30;
        d1.sum(a,b);
        d1.sum(a, b, c);        
    }
}
