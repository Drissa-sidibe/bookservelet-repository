package bookshopServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/create.do")
public class CreateCar extends HttpServlet {
	

	CarService service = new CarService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
	
		request.getRequestDispatcher("/WEB-INF/views/carList.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		String carId = request.getParameter("id");
		int id = Integer.parseInt(carId);
		String name= request.getParameter("name");
		String model= request.getParameter("model");
		String description= request.getParameter("description");
		String picture = request.getParameter("picture");
		String price = request.getParameter("price");
		
		service.addCar(name, model, description,picture,price);
		response.sendRedirect("/car.do");
	}
	
}