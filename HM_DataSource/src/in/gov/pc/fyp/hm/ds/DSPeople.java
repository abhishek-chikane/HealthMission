/**
 * 
 */
package in.gov.pc.fyp.hm.ds;

import in.gov.pc.fyp.hm.ds.hb.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;

/**
 * @author achikane
 *
 */
public class DSPeople implements IDS
{	
	private HibernateUtil hbUtil = new HibernateUtil();	
	
	public boolean add(Object object)
	{			
		boolean result = false;		
		result = hbUtil.save(object);		
		return result;
	}
	
	public List<Object> getAll()
	{		
		List<Object> people = null;
		try
        {
			people = hbUtil.get(" from People ");
        }
        catch (HibernateException e)
        {
	        e.printStackTrace();
        }
		return people;
	}
}
