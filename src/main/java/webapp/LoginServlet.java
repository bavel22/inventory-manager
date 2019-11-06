package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?



@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	private UserValidationService uservalidaitonservice = new UserValidationService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//request.setAttribute("name", request.getParameter("name"));
		//Date date = new Date();
		//request.setAttribute("date", date);
		//request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = uservalidaitonservice.isUserValid(name, password);


		
		if (isUserValid) {
			
			// request.setAttribute("name", name);
			// request.setAttribute("password", password);
			// request.getRequestDispatcher("/WEB-INF/views/locations.jsp").forward(request, response);
			response.sendRedirect("/locations");
			
		}
		else {
			
			
			request.setAttribute("errorMessage", "Invalid Crendentials");
			
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}