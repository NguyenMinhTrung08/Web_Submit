package MinChul.Automation.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Servlet implementation class Controllers_Automation
 */
@WebServlet(urlPatterns = { "/doget" }, initParams = { @WebInitParam(name = "name", value = "Nguyen Minh Trung"),
		@WebInitParam(name = "email", value = "NMTrung@gmail.com") })
public class Controllers_Automation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controllers_Automation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		  
		  response.setContentType("text/html");
		  
		  ServletConfig sc = getServletConfig();
		  
		  out.println(sc.getInitParameter("name"));
		  out.println(sc.getInitParameter("email"));
		  
		  
		  System.out.println("Phuong Thuc Su Dung Cua Resquest: " +
		  request.getMethod()); request.getContentType(); request.getContextPath();
		  System.out.println(request.getServerName());
		  System.out.println(request.getServletPath());
		  
		  Enumeration<String> k = request.getHeaderNames(); while (k.hasMoreElements())
		  { String key = k.nextElement(); System.out.println(key + ":" +
		  request.getHeader(key)); }
		  
		  getServletContext().setAttribute("School",
		  "HO CHI MINH CITY OF TECHNOLOGY AND EDUCATION"); ; String School = (String)
		  getServletContext().getAttribute("School"); out.println(School);
		  
		  out.close();
		 

		response.setIntHeader("Refresh", 1);
		response.setContentType("text/html");
		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		String CT = hour + ":" + minute + ":" + second + " " + am_pm;
		String title = "Auto Refresh Header Setting";
		String docType = "<!doctype html>\n";
		out.println(
				docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor = \"#f0f0f0\">\n"
						+ "<h1 align = \"center\">" + title + "</h1>\n" + "<p>Current Time is: " + CT + "</p>\n"); 																									// defined

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
