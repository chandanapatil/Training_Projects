

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           DBConnection conn = new DBConnection();
           Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           stmt.executeUpdate("insert into eproducts (name, price) values ('New Product', 17800");
           out.println("Executed an insert operation<br>");
           
           stmt.executeUpdate("update eproducts set price=2000 where name = 'New Product'");
           out.println("Executed an update operation<br>");
           
           stmt.executeUpdate("delete from eproducts where name = 'New Product'");
           out.println("Executed a delete operation<br>");
           
           stmt.close();
           
           conn.closeConnection();
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (SQLException e) {
           e.printStackTrace();
   }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
