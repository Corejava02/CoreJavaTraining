// odd and even numbers from 1-n
// fibonacci series

class Student{
    int rollNo;
    int name;
    int marks;

    String a;
}

public class EnhancedForLoop1 {
    public static void main(String[] args) {
        Student subham = new Student();
        subham.rollNo=10;
        subham.name=20;
        subham.marks=30;

        Student sumit = new Student();
        sumit.rollNo=40;
        sumit.name=50;
        sumit.marks=60;

        Student ayan = new Student();
        ayan.rollNo=70;
        ayan.name=80;
        ayan.marks=90;

        Student student[] = new Student[3];
        student[0] =subham;
        student[1] = sumit;
        student[2] = ayan;

//        for(int i=0;i<student.length;i++){
//            System.out.println(student[i].name);
//            System.out.println(student[i].rollNo);
//            System.out.println(student[i].marks);
//        }

//        for(Student s : student){
//            System.out.println(s.name);
//            System.out.println(s.rollNo);
//            System.out.println(s.marks);
//        }

        int num[] = new int[4];
        num[0] = 4;
        num[1] = 5;
        num[2] = 3;
        num[3] = 7;

//        for(int i=0;i<num.length/2;i++){
//            System.out.println(num[i]);
//        }

        for(int n:num){
            System.out.println(n);
        }
    }
}
