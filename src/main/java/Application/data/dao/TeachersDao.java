package Application.data.dao;

import Application.data.entities.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	void saveTacher(Teacher teacher);

}
