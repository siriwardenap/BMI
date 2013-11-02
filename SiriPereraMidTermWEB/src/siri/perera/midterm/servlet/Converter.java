package siri.perera.midterm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
import bmi.calculator.exceptions.calculatorException;

*/
/**
 * Servlet implementation class Converter
 */
@WebServlet("/convert")
public class Converter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Converter() {
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
		HttpSession session = request.getSession();
		bmi.calculator.model.BMICalculator calc = null;
		try {
			calc = new bmi.calculator.model.BMICalculator();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		String measuringUnit = null;
        if ( request.getParameter("Imperial") != null) {
        	measuringUnit = "Imperial";
        } else if ( request.getParameter("Metric") != null) {
        	measuringUnit = "Metric";
        }	
        */

			String height= request.getParameter("height");
			String weight= request.getParameter("weight");
			
			double BMI = 0;
			try {
				/*
				BMI = calc.BMICalculation(Double.parseDouble(height), Double.parseDouble(weight));
			
				bmi = calc.setWeightMetric(weight)/(calc.setHeightMetric(Double.parseDouble(height)))^2;
				
				*/
				request.setAttribute("result", BMI);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		} 
	}


