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
public class DSAddress implements IDS
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
		List<Object> address = null;
		try
        {
			address = hbUtil.get(" from Address ");
        }
        catch (HibernateException e)
        {
	        e.printStackTrace();
        }
		return address;
	}
}
