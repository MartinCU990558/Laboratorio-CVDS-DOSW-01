package Pareja_Ramirez_Guzman.Reto1 - RamirezGuzman;

/**
 * Representa un estudiante con su información básica.
 */
public class Students {
    private String name;
    private int age;
    private String email;
    private int semester;

    /**
     * Método constructor del objeto estudiante.
     *
     * @param name
     * @param age
     * @param email
     * @param semester
     */
    public Students(String name, int age, String email, int semester) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getEmail() {return email;}
    public int getSemester() {return semester;}

}
