package in.gov.pc.fyp.hm.service;

import in.gov.pc.fyp.hm.ds.DSPeople;
import in.gov.pc.fyp.hm.objects.People;
import in.gov.pc.fyp.hm.util.Utilities;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class AddPeople
 */
public class AddPeople extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPeople()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw = new PrintWriter(response.getWriter());
		/*String dataInJSON = sb.toString();		
		System.out.println(" Add People doPost with data : " + dataInJSON);
		
		Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
		// convert java object to JSON format,
		// and returned as JSON formatted string
		People people = gson.fromJson(dataInJSON, People.class); */
		
		People people = new People();
		people.setFirstName(request.getParameter("firstName"));
		people.setLastName(request.getParameter("lastName"));
		people.setMiddleName(request.getParameter("middleName"));
		System.out.println(request.getParameter("dateOfBirth"));
		Calendar temp = Utilities.convertStringToCalender(request.getParameter("dateOfBirth"), "MM-dd-yyyy");
		people.setDateOfBirth(temp == null ? null : temp.getTime());
		people.setAadharId(Utilities.convertStringToInteger(request.getParameter("aadharId")));		
		people.setType(request.getParameter("type"));
		people.setIsActive(1);
		people.setCreatedBy("system");
		people.setCreatedDate(Calendar.getInstance().getTime());
		
		if(people != null)
		{
			System.out.println("Data  = " + people );
			//Save to db		
			DSPeople dsPeople = new DSPeople();
			people.setIsActive(1);
			people.setCreatedDate(Calendar.getInstance().getTime());
						
			if(dsPeople.add(people))
			{
				response.sendRedirect("enroll.jsp");
			}
			else
			{
				response.sendRedirect("enroll.jsp");
			}
		}				
	}

}
