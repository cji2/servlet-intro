package edu.gmu.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadParameter")
public class ReadParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReadParameter() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// step 1: set content type.
		response.setContentType("text/html");
		
		// step 2: get printWriter.
		PrintWriter out = response.getWriter();
		
		// step 3: read configuration parameters.
		// getServletContext() is inherited from HttpServlet
		ServletContext context = getServletContext();
		
		String maxCart = context.getInitParameter("max-shopping-cart-size");
		String projectName = context.getInitParameter("project-name");
		
		// step 4: generate HTML content.
		out.println("<html><body>");
		
		out.println("max cart: " + maxCart);
		out.println("<br/><br/>");
		out.println("project name: " + projectName);
		
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
