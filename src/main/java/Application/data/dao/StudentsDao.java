package Application.data.dao;

import Application.data.entities.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);
}
