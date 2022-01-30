

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String regex = "^[A-Z]{1,5}$";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> errors = new HashMap<String, String>();
		String productCategory = "";
		HttpSession session = request.getSession();
		Pattern pattern = Pattern.compile(regex);
		
		if(request.getParameter("productName").length() == 0) {
			errors.put("nullProdName","Enter a product name<br/>");
		}
		if(request.getParameter("productCategory").length() == 0) {
			productCategory = "No description";
		}else {
			productCategory = request.getParameter("productCategory");
		}
		try {
			Integer.parseInt(request.getParameter("productId"));
		}catch(NumberFormatException e) {
			errors.put("notInt", "<br/>Invalid product ID<br/>");
		}
		if(errors.isEmpty()) {
			Product p1 = new Product(Integer.parseInt(request.getParameter("productId")), request.getParameter("productName"), productCategory);
			session.setAttribute("product", p1);
			response.sendRedirect("display.jsp");
		}else {
			session.setAttribute("errors", errors);
			response.sendRedirect("index.jsp");
		}
		
	}
	

}
