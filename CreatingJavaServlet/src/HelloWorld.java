// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Extend HttpServlet class
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
 
  private String message;
  private String titleString;

  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World";
      titleString = "Hello World";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
	  request.setAttribute("titleString", titleString);
	  // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
//      PrintWriter out = response.getWriter();
//      out.println("<h1>" + message + "</h1>");
      request.setAttribute("message", message);
      getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
   } 

   public void destroy() 
   { 
     // do nothing. 
   } 
}