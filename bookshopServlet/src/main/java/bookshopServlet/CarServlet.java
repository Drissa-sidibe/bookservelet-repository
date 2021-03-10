package bookshopServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/car.do")
public class CarServlet extends HttpServlet {
	

	CarService service = new CarService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
		request.setAttribute("sekou",service.retrieveAllCars());
		request.getRequestDispatcher("/WEB-INF/views/carList.jsp").forward(request, response);
	}
}
