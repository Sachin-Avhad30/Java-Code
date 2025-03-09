
public class Demo1 {
    public static void main(String argc[]){
        Student s1 = new Student();
        s1.name = "sachin";
        s1.roll = 52;
        s1.password = "abc";
        s1.mark[0] = 100;
        s1.mark[1] = 94;
        s1.mark[2] = 95;

        //Copy Constructor
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.mark[2] = 100;
        for(int i = 0; i < 3;i++){
            System.out.println
            (s2.mark[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int mark[];

    Student(){
        mark = new int[3];
        System.out.print("Constructor is called");
    }
    // In copy Constructor we copy name,roll,mark
    //Shallow copy Constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.mark = s1.mark;
    // }

    //Deep Copy Constructor
    Student(Student s1){
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < 3; i++){
            this.mark[i] = s1.mark[i];
        }
    }
    Student(String name){
        mark = new int[3];
        this.name = name;
    }
    Student(int roll){
        mark = new int[3];
        this.roll = roll;
    }
}
