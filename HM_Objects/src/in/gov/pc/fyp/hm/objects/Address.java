/**
 * 
 */
package in.gov.pc.fyp.hm.objects;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author achikane
 *
 */
public class Address
{
	private int id;
	private String address1;
	private String address2;
	private String area;
	private String city;
	private String taluka;
	private String district;
	private String state;
	private Integer pin;
	
	private Integer isActive;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}	
	/**
	 * @return the address1
	 */
	public String getAddress1()
	{
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1)
	{
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2()
	{
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2)
	{
		this.address2 = address2;
	}
	/**
	 * @return the area
	 */
	public String getArea()
	{
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area)
	{
		this.area = area;
	}
	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/**
	 * @return the taluka
	 */
	public String getTaluka()
	{
		return taluka;
	}
	/**
	 * @param taluka the taluka to set
	 */
	public void setTaluka(String taluka)
	{
		this.taluka = taluka;
	}
	/**
	 * @return the district
	 */
	public String getDistrict()
	{
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district)
	{
		this.district = district;
	}
	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	/**
	 * @return the pin
	 */
	public Integer getPin()
	{
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(Integer pin)
	{
		this.pin = pin;
	}
	/**
	 * @return the isActive
	 */
	public Integer getIsActive()
	{
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Integer isActive)
	{
		this.isActive = isActive;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy()
	{
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate()
	{
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}
	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy()
	{
		return modifiedBy;
	}
	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate()
	{
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate)
	{
		this.modifiedDate = modifiedDate;
	}
	
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this);
	}
}
