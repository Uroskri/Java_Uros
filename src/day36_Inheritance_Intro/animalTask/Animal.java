package day36_Inheritance_Intro.animalTask;

public class Animal {

    public String name,breed,color,size;
    public char gender;
    public int age;


    public void setInfo(String name, String breed, String color, String size, char gender, int age) {

        this.name=name;
        this.breed=breed;
        this.color=color;
        this.size=size;
        this.gender=gender;

    }


    public void eat() {
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
