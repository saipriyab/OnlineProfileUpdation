package com.fsd;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {
	public  void add(Employee e)
	{
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
    Session session=factory.openSession();
    try
    {
    	session.beginTransaction();
    	session.save(e);
    	System.out.println("inserted");
    	session.getTransaction().commit();
    }
    catch(Exception e1)
	{
    	factory.close();
    	session.close();
	}
	}
	public void delete(String profileid)
	{
		SessionFactory factory2=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
    	Session session2=factory2.openSession();
    	try
    	{
    	session2.beginTransaction();
    	Employee e3=session2.get(Employee.class,profileid);
    	session2.delete(e3);
    	session2.getTransaction().commit();
    	System.out.println("deleted");
    	}
        catch(Exception e1)
    	{
        	factory2.close();
        	session2.close();
    	}
	}
	public void update(Employee e1)
	{
		System.out.println(e1);
		SessionFactory factory3=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	    Session session3=factory3.openSession();
	    try
	    {
	    	session3.beginTransaction();
	  
	    	Employee e4=session3.get(Employee.class,e1.getProfileid());
            e4.setFirstname(e1.getFirstname());
            e4.setLastname(e1.getLastname());
            e4.setSkillset(e1.getSkillset());
            e4.setLocation(e1.getLocation());
            e4.setDob(e1.getDob());
            e4.setQualification(e1.getQualification());
            e4.setNumberofyearsofexperience(e1.getNumberofyearsofexperience());
            e4.setGender(e1.getGender());
            e4.setPhonenumber(e1.getPhonenumber());
            e4.setEmailid(e1.getEmailid());
            session3.update(e4);
        	session3.getTransaction().commit();
        	System.out.println("updated");
	    }
	    catch(Exception e2)
		{
	    	factory3.close();
	    	session3.close();
		}
	}
	public Employee skillsearch(String profileid)
	{
		SessionFactory factory3=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Administrator.class).buildSessionFactory();
    	Session session3=factory3.getCurrentSession();
     	Employee e=null;
    	try
    	{
    		System.out.println("hello");
	    	session3.beginTransaction();
	  	  
	   e=session3.get(Employee.class,profileid);
    		session3.getTransaction().commit();
    	}
    	catch(Exception e1)
    	{
    		factory3.close();
    		session3.close();
    	}
    	
    	return e;
	}
}
