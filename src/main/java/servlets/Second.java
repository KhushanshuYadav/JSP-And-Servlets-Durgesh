package servlets;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//Below is the second way to create servlet by extending the GenericServlet class

//its mapping is done in web.xml deployment descriptor not by annotation

//here we create a servlet indirectly as GenericServlet in turn implements the Servlet interface

//here we need to  only override the abstract service method.
public class Second extends GenericServlet  {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Recived a request from client on second Servlet");
	}

}
