package bookshopServlet;

public class LoginService {
	
	public boolean ValidateUser(String username, String password) {
		return username.equals("Dri") && password.equals("dri");
	}
		
}
