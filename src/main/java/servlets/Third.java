package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//below is the third and most common method of creating sevrlet to handle HTTP protocol communication
@WebServlet("/third")
public class Third extends HttpServlet {

	// doGet method is used to handle the get request sent by client

	// When a client (browser or any HTTP client) sends a GET request to the
	// servlet, the servlet container calls the doGet() method.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Processing get request with third Servlet ");

		// super.doGet(req, resp);
	}

	
	// doPost method is used to handle the post request
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Processing post request with third Servlet ");
		
		//extracting name and age i.e form data from incoming request from form
		//by get parameters method
		
		String fullName=req.getParameter("fullName");
		System.out.println("Full name is "+fullName);
		
		String age=req.getParameter("age");
		System.out.println("Age is "+age);
		
		
		//sending response to client for respective post request
		
		//setting up the response as HTML one
		resp.setContentType("text/HTML");
		
		//creating PrintWriter object
		PrintWriter out=resp.getWriter();
		
		//directly writing the response on browser
		out.println("<h1> Data submitted sucessfully </h1>");
		out.println("<br>");
		out.println("<h2>Hello " + fullName + "</h2>");
		
		
		
		
		
		
		//super.doPost(req, resp);
	}

	
	

}
