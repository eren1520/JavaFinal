package Bai1;

public class Student {
    private int id;
    private String name;
    private int age;
    private String major;

    public Student(){}

    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayInfor(){
        System.out.println("ID : "+this.id+"\tName : "+this.name+"\tAge : "+this.age
        +"\tMajor : "+this.major);
    }
}
