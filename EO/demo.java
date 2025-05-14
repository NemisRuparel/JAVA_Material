class Student{
    int eno;
    String name;
    void display(String name){
        System.out.println("Student name is : "+name);
    }
}
public class demo {
    public static void main(String s[])    {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        
        s1.display("jay");
        s2.display("ajay");
        s3.display("vijay");
        s4.display("bijay");
        s5.display("cijay");

    }
}
    