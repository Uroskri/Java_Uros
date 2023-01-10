package day36_Inheritance_Intro;

public class StudentEncapsulationTask {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<5||age>90){
            return;
        }
        this.age=age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public void study(){
        System.out.println(name+" is studying");
    }

    public StudentEncapsulationTask(String name, int age, char gender, char grade, String schoolName) {
        setGrade(grade);
        setAge(age);
        setGender(gender);
        setSchoolName(schoolName);
        setName(name);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
