package kz.home.classes;

public class Action {
    public void findStudentsByFaculty(Student[] students, String faculty) {
        for (Student student : students) {
            if (faculty.equals(student.getFaculty()))
                System.out.println(student);
        }
    }

    public void findStudentsByFacultyAndCourse (Student[] students, String faculty, int course) {
        for (Student student : students) {
            if (faculty.equals(student.getFaculty()) && course == student.getCourse()) {
                System.out.println(student);
            }

        }
    }

    public void findStudentsBornAfterCurrentYear (Student[] students, int year) {
        for (Student student : students) {
            if (student.getDateOfBirth().getYear() > year) {
                System.out.println(student);
            }
        }
    }

    public void findStudentsByGroup (Student[] students, String group) {
        for (Student student : students) {
            if (group.equals(student.getGroup())) {
                System.out.println(student);
            }
        }
    }
}
