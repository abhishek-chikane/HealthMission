package in.gov.pc.fyp.hm.test;

import in.gov.pc.fyp.hm.ds.hb.HibernateUtil;
import in.gov.pc.fyp.hm.objects.Address;
import in.gov.pc.fyp.hm.objects.Immunization;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestImmunization
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		queryAddress(session);
		System.out.println("done");
	}

	private static void queryAddress(Session session)
	{
		Query query = session.createQuery("from Immunization");
		List<Immunization> list = query.list();
		java.util.Iterator<Immunization> iter = list.iterator();
		while (iter.hasNext())
		{
			Immunization immunization = iter.next();
			System.out.println("Immunization: \"" + immunization );
		}
		session.getTransaction().commit();
	}

	public static void createAddress(Session session)
	{
		
	}
}
