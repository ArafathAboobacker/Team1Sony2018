package com.sony.web;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/authenticate")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(userid.equalsIgnoreCase("Arafath") && passwd.equals("pass")){
			out.println("Welcome "+userid+"<br>");
			
		}else{
			out.println("Invalid UserID / Password ");
		}
		
		Enumeration<String> headerNames = request.getHeaderNames();
		String headerName;
		
		while(headerNames.hasMoreElements()){
			headerName = headerNames.nextElement();
			out.println(headerName+" - "+request.getHeader(headerName)+"<br>");
		}
		
		out.println(request.getRemoteAddr());
		
		out.println("</body>");
		out.println("</html>");
	}

}
