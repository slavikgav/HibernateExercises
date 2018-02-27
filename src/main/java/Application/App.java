package Application;

import java.util.Date;

import Application.data.entities.Student;
import Application.worker.WorkWithStudents;
import Application.worker.WorkWithTeacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Application.data.entities.Teacher;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
		 //new WorkWithStudents();
		Student student = new Student("Stieve Gerrard", 2);
		worker.saveStudentToDb(student);

		WorkWithTeacher workWithTeacher =
				(WorkWithTeacher) context.getBean("teachersWorker");
				Teacher teacher = new Teacher();
				teacher.setFirstname("Andrii");
				teacher.setLastname("Glybovets");
				teacher.setCellphone("+380675097865");
				teacher = workWithTeacher.addTeacher(teacher);
				teacher.setBirthDate(new Date());
				workWithTeacher.saveTacher(teacher);

	}

}
