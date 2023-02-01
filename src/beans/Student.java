package beans;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String groupNumber;

    public Student() {
    }

    public Student(String name, String surname, int age, String groupNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getfullInfo(){
        return name+" "+surname+" "+age+" "+groupNumber;
    }
}
