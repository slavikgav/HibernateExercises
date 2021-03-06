package Application.data.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import Application.data.dao.TeachersDao;
import Application.data.entities.Teacher;


@Repository
public class HibernateTeacherDao implements TeachersDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addTeacher(Teacher teacher) {
		currentSession().save(teacher);
	}

	public Teacher getTeacherById(int id) {
		return (Teacher) currentSession().get(Teacher.class, id);
	}

	public void saveTacher(Teacher teacher) {
		currentSession().update(teacher);
	}
}
