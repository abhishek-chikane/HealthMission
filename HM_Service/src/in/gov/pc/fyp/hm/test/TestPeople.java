package in.gov.pc.fyp.hm.test;

import in.gov.pc.fyp.hm.ds.DSPeople;
import in.gov.pc.fyp.hm.ds.hb.HibernateUtil;
import in.gov.pc.fyp.hm.objects.People;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestPeople
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		createPeople(session);
		queryPeople(session);
		System.out.println("done");
	}

	private static void queryPeople(Session session)
	{
		Query query = session.createQuery("from People");
		List<People> list = query.list();
		java.util.Iterator<People> iter = list.iterator();
		while (iter.hasNext())
		{
			People people = iter.next();
			System.out.println("Person: \"" + people.getFirstName() + "\", " + people.getLastName() + "\", " );
		}
		session.getTransaction().commit();
	}

	public static void createPeople(Session session)
	{
		People people = new People();
		people.setFirstName("Barak");
		people.setLastName("Obama");
		people.setDateOfBirth(Calendar.getInstance().getTime());
		people.setAadharId(12345);
		people.setMiddleName("Test");
		people.setType("Mother");
		people.setIsActive(1);
		people.setCreatedBy("system");
		people.setCreatedDate(Calendar.getInstance().getTime());
		people.setModifiedBy("system_mod");
		people.setModifiedDate(Calendar.getInstance().getTime());
		
		DSPeople dsPeople = new DSPeople();
		dsPeople.add(people);
		
		//session.save(people);
	}
}
