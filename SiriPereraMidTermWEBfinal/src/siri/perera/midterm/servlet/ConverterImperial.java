package siri.perera.midterm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bmi.calculator.model.BMICalculator;

/**
 * Servlet implementation class ConverterImperial
 */
@WebServlet("/convertImperial")
public class ConverterImperial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConverterImperial() {
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
		BMICalculator cal = new BMICalculator();
		try {
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			String sheight = request.getParameter("height");
			String sweight =request.getParameter("weight");
			
			double BMI = 0;
			try {
				/*
				BMI = calc.BMICalculation(Double.parseDouble(height), Double.parseDouble(weight));
			*/
				double weight = Double.parseDouble(sweight);
				double height = Double.parseDouble(sheight);
				cal.setHeightImperial(height);
				cal.setWeightMetric(weight);
				BMI = cal.getBMI();
				
				
				request.setAttribute("result", BMI);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		
	}

}
