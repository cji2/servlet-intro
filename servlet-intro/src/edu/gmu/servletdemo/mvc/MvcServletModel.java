package edu.gmu.servletdemo.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcServletWithModel
 */
@WebServlet("/MvcServletModel")
public class MvcServletModel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcServletModel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* step 1: get the customer data from the Model: helper class
		   --> CustomerDataUtil.java
		   The method, getCustomer() is static. 
		   So, we don't need get the instance of the class, CustomerDataUtil. */
		List<Customer> customers = CustomerDataUtil.getCustomers();
		
		// step 2: add customers to request object.
		request.setAttribute("customer_list", customers);
		
		// step 3: get request dispatcher.
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/view_customers_model.jsp");
		
		// step 4: forward to JSP.
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
