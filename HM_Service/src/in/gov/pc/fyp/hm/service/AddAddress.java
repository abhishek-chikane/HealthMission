package in.gov.pc.fyp.hm.service;

import in.gov.pc.fyp.hm.ds.DSAddress;
import in.gov.pc.fyp.hm.objects.Address;

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
 * Servlet implementation class AddAddress
 */
public class AddAddress extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddAddress()
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
		String dataInJSON = request.getParameter("addressData");		
		PrintWriter pw = new PrintWriter(response.getWriter());
		System.out.println(" Add Address doPost with data : " + dataInJSON);
		
		Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
		// convert java object to JSON format,
		// and returned as JSON formatted string
		Address address = gson.fromJson(dataInJSON, Address.class);
		
		if(address != null)
		{
			System.out.println("Data  = " + address );
			//Save to db		
			DSAddress dsAddress = new DSAddress();
			
			address.setIsActive(1);
			address.setCreatedDate(Calendar.getInstance().getTime());
			if(dsAddress.add(address))
			{
				pw.write("Success");
			}
			else
			{
				pw.write("Failed");
			}
		}			
	}

}
