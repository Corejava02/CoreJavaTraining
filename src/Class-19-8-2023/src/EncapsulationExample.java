class Human{
    private int age1;
    private String name;

    public int getAge() {
        return age1;
    }

    public void setAge(int age) {
        this.age1 = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



class EncapsulationExample {
    public static void main(String[] args) {
        Human human = new Human();
//        System.out.println(human.getAge());;
        human.setAge(15);
        System.out.println(human.getAge());
    }
}
