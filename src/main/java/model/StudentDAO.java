package model;

/**
 * Created by jesa on 11.03.2016.
 */
import java.util.ArrayList;
import java.util.List;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {

    @SessionTarget
    Session session;

    @TransactionTarget
    Transaction transaction;

    @SuppressWarnings("unchecked")
    public List<Student> getStudents()
    {
        List<Student> students = new ArrayList<Student>();
        try
        {
            students = session.createQuery("from Students").list();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return students;
    }

    public void addStudent(Student student)
    {
        session.save(student);
    }
}