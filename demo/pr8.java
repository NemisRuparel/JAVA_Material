class demo{
    int eno;
    void display(int eno){
       this.eno = eno;
       System.out.println(eno);
    }
}
public class pr8 {
    public static void main(String[] s){
        demo d1 = new demo();
        d1.display(10);
    }
}
