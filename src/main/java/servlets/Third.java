package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		
		//super.doPost(req, resp);
	}

	
	

}
