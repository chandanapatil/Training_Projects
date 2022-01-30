

import java.io.IOException;

import java.io.PrintWriter;
import java.io.Reader;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class DBOperations
 */
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBOperations() {
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
            
          
           Properties props = new Properties();
           Reader in = null;
		props.load(in);
           
           
           DBConnection conn = new DBConnection();
           Statement stmt = conn.getConnection().createStatement();
           stmt.executeUpdate("create database mydatabase");
           out.println("Created database: mydatabase<br>");
           stmt.executeUpdate("use mydatabase");
           out.println("Selected database: mydatabase<br>");
           stmt.executeUpdate("drop database mydatabase");
           stmt.close();
           out.println("Dropped database: mydatabase<br>");
           
           
           
           
           
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
