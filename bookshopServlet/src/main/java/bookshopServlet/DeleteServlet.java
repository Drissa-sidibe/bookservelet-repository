package bookshopServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/delete.do")
public class DeleteServlet extends HttpServlet {
	
	CarService service = new CarService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		String carId= request.getParameter("id");
		int id = Integer.parseInt(carId);
		service.deleteById(id);
		response.sendRedirect("/car.do");
		
	}
}
