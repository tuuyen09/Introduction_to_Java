package demo;

public class Student {
    private String name = "John";
    private String nameClass = "C02";

    public Student() {
    }

    public Student(String name, String nameClass) {
        this.name = name;
        this.nameClass = nameClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Johan","C11");
        student.setName("Sally");
        student.setNameClass("C03");
        System.out.println(student);
    }
}
