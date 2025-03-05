class Student{
   int eno;
   String name;

   void display(String name){
    System.out.println(name);
   }

}
public class pr6 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.display("aa");
        s2.display("bb");
        s3.display("cc");
    }
}
