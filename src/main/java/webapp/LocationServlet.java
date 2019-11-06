package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/locations/1")
//("/locations/{areaNumber}")
public class LocationServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("name", request.getParameter("name"));
		

		System.out.println(request.getPathInfo());
		
		System.out.println(request.getParameterNames());
		
		
		
		System.out.println(request.getAttribute("name"));
	/*	
		System.out.println(request.toString());
		
	
		
		String areaNumber = request.getParameter(arg0)("areaNumber");
		
		request.setAttribute("areaNumber", "entials");
		
		request.getRequestDispatcher("/WEB-INF/views/area.jsp").forward(request, response);
*/
	}
	
	
	
	
}
