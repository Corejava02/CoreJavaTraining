class School {
    String name;
    int noOfStud;

    public School(String name, int noOfStud) {
        this.name = name;
        this.noOfStud = noOfStud;
        System.out.println("Inside Cons");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("No Of Stud: " + noOfStud);
    }

    public void display1(){
        System.out.println("Name: " + name);
    }
}


public class AnonymousObjectExample {
    public static void main(String[] args) {
        School school = new School("School",10);
        school.display();
        school.display1();
        new School("Deshbodhu High School",10).display();
        new School("Deshbodhu High School",10).display1();
    }
}
