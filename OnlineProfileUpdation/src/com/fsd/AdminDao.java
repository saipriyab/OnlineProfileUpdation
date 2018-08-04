package com.fsd;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdminDao {
	public  long add(Administrator a)
	{
	SessionFactory factory=new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Administrator.class).buildSessionFactory();
    Session session=factory.openSession();
    
    try
    {
    	session.beginTransaction();
    	session.save(a);
    	System.out.println("inserted");
    	session.getTransaction().commit();
    }
    catch(Exception e1)
	{
    	factory.close();
    	session.close();
	}
    return a.getJobid();
	}
	public void update(Administrator a)
	{
		System.out.println(a);
		SessionFactory factory3=new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Administrator.class).buildSessionFactory();
	    Session session3=factory3.openSession();
	    try
	    {
	    	session3.beginTransaction();
	  
	    	Administrator a1=session3.get(Administrator.class,a.getJobid());
            a1.setJobname(a.getJobname());
            a1.setJobdescription(a.getJobdescription());
            a1.setProjectname(a.getProjectname());
            a1.setSkillsrequired(a.getSkillsrequired());
            a1.setOptionalskills(a.getOptionalskills());
            a1.setLocation(a.getLocation());
            a1.setEmployeeband(a.getEmployeeband());
            a1.setNumberofyearsofexperience(a.getNumberofyearsofexperience());
            a1.setNoofposition(a.getNoofposition());
            a1.setContactemailid(a.getContactemailid());
            a1.setContactnumber(a.getContactnumber());
            session3.update(a1);
        	session3.getTransaction().commit();
        	System.out.println("updated");
	    }
	    catch(Exception e2)
		{
	    	factory3.close();
	    	session3.close();
		}
	}
	public void delete(long jobid)
	{
		SessionFactory factory2=new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Administrator.class).buildSessionFactory();
    	Session session2=factory2.openSession();
    	try
    	{
    		System.out.println(jobid);
    	session2.beginTransaction();
    	Administrator e3=session2.get(Administrator.class,jobid);
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
	
	public Administrator skillsearch(long jobid)
	{
		SessionFactory factory3=new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Administrator.class).buildSessionFactory();
    	Session session3=factory3.getCurrentSession();
     	Administrator a=null;
    	try
    	{
    		System.out.println("hello");
	    	session3.beginTransaction();
	  	  
	   a=session3.get(Administrator.class,jobid);
    		session3.getTransaction().commit();
    	}
    	catch(Exception e)
    	{
    		factory3.close();
    		session3.close();
    	}
    	
    	return a;
	}
}
