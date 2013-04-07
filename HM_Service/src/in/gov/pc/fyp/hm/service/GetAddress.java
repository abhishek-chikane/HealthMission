package in.gov.pc.fyp.hm.service;

import in.gov.pc.fyp.hm.ds.DSAddress;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class GetAddress
 */
public class GetAddress extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAddress()
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
		DSAddress dsAddress = new DSAddress();
		List<Object> address = dsAddress.getAll();
		PrintWriter pw = new PrintWriter(response.getWriter());
		
		if(address != null)
		{
			Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
			String resultString = gson.toJson(address);
			pw.write(resultString);
		}
		else
		{
			pw.write("No data found");
		}
	}

}
