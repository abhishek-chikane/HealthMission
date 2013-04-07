package in.gov.pc.fyp.hm.test;

import in.gov.pc.fyp.hm.ds.hb.HibernateUtil;
import in.gov.pc.fyp.hm.objects.Address;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestAddress
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		createAddress(session);
		queryAddress(session);
		System.out.println("done");
	}

	private static void queryAddress(Session session)
	{
		Query query = session.createQuery("from Address");
		List<Address> list = query.list();
		java.util.Iterator<Address> iter = list.iterator();
		while (iter.hasNext())
		{
			Address address = iter.next();
			System.out.println("Person: \"" + address.getAddress1() + "\", " + address.getAddress2() + "\", " );
		}
		session.getTransaction().commit();
	}

	public static void createAddress(Session session)
	{
		Address address = new Address();

		address.setAddress1("add 1");
		address.setAddress2("add 2");
		address.setArea("area");
		address.setCity("city");
		address.setTaluka("taluka");
		address.setDistrict("district");
		address.setState("state");
		address.setPin(12345);
		
		address.setIsActive(1);
		address.setCreatedBy("system");
		address.setCreatedDate(Calendar.getInstance().getTime());
		address.setModifiedBy("system_mod");
		address.setModifiedDate(Calendar.getInstance().getTime());
		
		session.save(address);
	}
}
