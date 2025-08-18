package Pareja_Bermudez_Palacios.Reto1;

public class Student {
    private final String name;
    private final String lastName;
    private final int semester;
    private final int age;
    private final String email;

    public Student(String name, String lastName, int semester, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.semester = semester;
        this.age = age;
        this.email = email;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    public int getSemester() {
        return semester;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

