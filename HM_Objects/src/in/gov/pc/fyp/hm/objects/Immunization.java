/**
 * 
 */
package in.gov.pc.fyp.hm.objects;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;



/**
 * @author achikane
 */
public class Immunization
{
	private int id;
	private Integer ageStart;
	private Integer ageEnd;
	private String ageDesc;
	private String vaccineName;
	private String diseasesPrevented;
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
	 * @return the ageStart
	 */
	public Integer getAgeStart()
	{
		return ageStart;
	}
	/**
	 * @param ageStart the ageStart to set
	 */
	public void setAgeStart(Integer ageStart)
	{
		this.ageStart = ageStart;
	}
	/**
	 * @return the ageEnd
	 */
	public Integer getAgeEnd()
	{
		return ageEnd;
	}
	/**
	 * @param ageEnd the ageEnd to set
	 */
	public void setAgeEnd(Integer ageEnd)
	{
		this.ageEnd = ageEnd;
	}
	/**
	 * @return the ageDesc
	 */
	public String getAgeDesc()
	{
		return ageDesc;
	}
	/**
	 * @param ageDesc the ageDesc to set
	 */
	public void setAgeDesc(String ageDesc)
	{
		this.ageDesc = ageDesc;
	}
	
	
	/**
	 * @return the vaccineName
	 */
	public String getVaccineName()
	{
		return vaccineName;
	}
	/**
	 * @param vaccineName the vaccineName to set
	 */
	public void setVaccineName(String vaccineName)
	{
		this.vaccineName = vaccineName;
	}
	/**
	 * @return the diseasesPrevented
	 */
	public String getDiseasesPrevented()
	{
		return diseasesPrevented;
	}
	/**
	 * @param diseasesPrevented the diseasesPrevented to set
	 */
	public void setDiseasesPrevented(String diseasesPrevented)
	{
		this.diseasesPrevented = diseasesPrevented;
	}
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this);
	}
}
