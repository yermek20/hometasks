package kz.home.classes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(1L, "Anton", "Ivanov", "Palych", new Date(1996,5,29), "Moscow", +1095000545, "IT", 1, "201");
        students[1] = new Student(2L, "Arman", "Serikov", "Abaych", new Date(1990,9,19), "Astana", +1095000545, "Economics", 3, "205");
        students[2] = new Student(3L, "Sasha", "Voronov", "Abramovich", new Date(1993,7,13), "Barnaul", +1095000545, "Biology", 2, "106");
        students[3] = new Student(4L, "Misha", "Zinovyev", "Potapych", new Date(1991,5,26), "Tomsk", +1095000545, "Economics", 3, "205");
        students[4] = new Student(5L, "Almas", "Kaliev", "Berikovich", new Date(1992,2,25), "Almaty", +1095000545, "IT", 2, "203");
        students[5] = new Student(6L, "Marsel", "Izbasar", "Anvarych", new Date(1996,8,20), "Moscow", +1095000545, "IT", 1, "201");
        students[6] = new Student(7L, "John", "Smith", "Orelly", new Date(1990,9,17), "Astana", +1095000545, "Economics", 3, "305");
        students[7] = new Student(8L, "Masha", "Alieva", "Stepanenko", new Date(1997,4,28), "Barnaul", +1095000545, "Biology", 2, "106");
        students[8] = new Student(9L, "Denis", "Bazylev", "Borisovich", new Date(1995,5,30), "Tomsk", +1095000545, "Economics", 2, "202");
        students[9] = new Student(10L, "Erik", "Kumash", "Serikovich", new Date(1990,11,7), "Almaty", +1095000545, "IT", 2, "203");

        Action action = new Action();
        action.findStudentsByFaculty(students, "IT");
        System.out.println("=======================================================================");
        action.findStudentsByFacultyAndCourse(students, "Economics", 3);
        System.out.println("=======================================================================");
        action.findStudentsBornAfterCurrentYear(students,1992);
        System.out.println("=======================================================================");
        action.findStudentsByGroup(students, "203");

    }
}
