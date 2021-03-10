package bookshopServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
		CarService service = new CarService();
		LoginService loginservice= new LoginService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				boolean isValid = loginservice.ValidateUser(username,password);
				if(!isValid) {
					request.setAttribute("Error","Wrong crendentials");
					request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
				}else {
					request.setAttribute("name", username);
					response.sendRedirect("/car.do");
//					request.setAttribute("sekou",service.obtainAllCars());
//					request.getRequestDispatcher("/WEB-INF/views/carList.jsp").forward(request, response);
					
				}
				
		}
	
		
}