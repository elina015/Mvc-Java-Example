package com.company;

public class Main {

    public static void main(String[] args) {
	Student model = retrieveStudentFromDB();

	View view = new View();

	StudentController controller = new StudentController(model, view);

	controller.updateView();

	controller.setStudentName("John");
	
	controller.updateView();
    }
    private static Student retrieveStudentFromDB(){
      Student student = new Student();
      student.setName("Ivan");
      student.setLesson("Java");

      return student;
    }
}
