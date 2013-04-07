package in.gov.pc.fyp.hm.ds.hb;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{

	private static final SessionFactory sessionFactory;
	private Session session;
	
	static
	{
		try
		{
			// Create the SessionFactory from hibernate.cfg.xml
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch (Throwable ex)
		{
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
		
	public HibernateUtil()
	{
		session = sessionFactory.getCurrentSession();		
	}	

	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public boolean save(Object object)
	{
		boolean result = false;
		Transaction transaction = session.beginTransaction();	
		try
        {
			transaction.begin();
	        this.session.save(object);
	        transaction.commit();
	        sessionFactory.close();
	        result = true;	        
	        System.out.println("Saving object " + object );
        }
        catch (HibernateException e)
        {
	        e.printStackTrace();
        }
		return result;
	}
	
	public List<Object> get(String sql)
	{
		List<Object> result = null;
		session.beginTransaction();
		try
        {
			Query query = session.createQuery(sql);
			result = query.list();
        }
        catch (HibernateException e)
        {
	        e.printStackTrace();
        }
		return result;
	}


}