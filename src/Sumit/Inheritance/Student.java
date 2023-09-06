package Sumit.Inheritance;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double grade;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public boolean isEligibleToGraduate(double thresholdGrade) {
        return grade >= thresholdGrade;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name,age,grade:");
        String n1=sc.nextLine();
        int age1=sc.nextInt();
        double gr1=sc.nextDouble();
        sc.nextLine();
         System.out.println("Enter the second name,age,grade:");
        String n2=sc.nextLine();
        int age2=sc.nextInt();
        double gr2=sc.nextDouble();
        Student student1 = new Student(n1, age1, gr1);
        Student student2 = new Student(n2, age2, gr2);
        System.out.println(student1.getName() + " is " + student1.getAge() + " years old and has a grade of " + student1.getGrade() + ".");
        System.out.println(student2.getName() + " is " + student2.getAge() + " years old and has a grade of " + student2.getGrade() + ".");
        double thresholdGrade = 70.0;
        if (student1.isEligibleToGraduate(thresholdGrade)) {
            System.out.println(student1.getName() + " is eligible to graduate!");
        } else {
            System.out.println(student1.getName() + " is not eligible to graduate.");
        }
        if (student2.isEligibleToGraduate(thresholdGrade)) {
            System.out.println(student2.getName() + " is eligible to graduate!");
        } else {
            System.out.println(student2.getName() + " is not eligible to graduate.");
        }
    }
}
