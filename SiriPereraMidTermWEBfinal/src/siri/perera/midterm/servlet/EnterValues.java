package siri.perera.midterm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EnterValues
 */
@WebServlet("/enterValueChoice")
public class EnterValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterValues() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        if ( request.getParameter("Metric") != null) {
        	RequestDispatcher rd = request.getRequestDispatcher("MetricInputForm.jsp");
        	rd.forward(request, response);
        } else if ( request.getParameter("Imperial") != null) {
        	RequestDispatcher rd = request.getRequestDispatcher("ImperialInputForm.jsp");
        	rd.forward(request, response);
        } else {
        	doGet(request, response);
		}
		
	}

}
