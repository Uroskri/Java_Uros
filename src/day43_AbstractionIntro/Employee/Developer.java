package day43_AbstractionIntro.Employee;

public final class Developer extends Employee {


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is developing the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps 5 hours");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating meat");
    }

    public void unitTest(){
        System.out.println(getName()+ " is unit testing");
    }
}
