package edu.training.js.task_university;

public class Main {
	
    public static void main(String[] args) {
    	
        Student student = new Student("Petrov", 1, "petrov@com", 3);
        student.addCourse("Bio");
        student.displayDetails();
        student.conductResearch();
        System.out.println();
        
        Faculty faculty = new Faculty("Ivanov",2, "ivanov@mail.ru", "teach");
        faculty.addCourse("mehmat");
        faculty.displayDetails();
        faculty.conductResearch();
        System.out.println();
        
        Staff staff = new Staff("Sidorov", 3, "sidorov@com", "automation", "specialist");
        staff.displayDetails();

    }

}
