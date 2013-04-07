/**
 * 
 */
package in.gov.pc.fyp.hm.objects;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;



/**
 * @author achikane
 */
public class People
{
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date dateOfBirth;
	private Integer aadharId;
	private String type;
	
	private Integer isActive;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
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
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	/**
	 * @return the aadharId
	 */
	public Integer getAadharId()
	{
		return aadharId;
	}
	/**
	 * @param aadharId the aadharId to set
	 */
	public void setAadharId(Integer aadharId)
	{
		this.aadharId = aadharId;
	}
	
	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
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
