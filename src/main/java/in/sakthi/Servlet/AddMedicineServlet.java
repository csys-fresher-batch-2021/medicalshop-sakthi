package in.sakthi.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sakthi.service.MedicineService;

/**
 * Servlet implementation class AddMedicineServlet
 */
@WebServlet("/AddMedicineServlet")
public class AddMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		System.out.println("AddMedicineServlet");
		
		// Step 1: Get Form Values
		String medicineName = request.getParameter("medicineName");
		out.println(medicineName);
		
		// Step 2: Call Service => add Product
		boolean isAdded = MedicineService.addMedicine(medicineName);
		
		// Step 3: Decide to which page we should redirect ?
		if (isAdded) {
			response.sendRedirect("AvailableMedicine.jsp");
		} else {
			String errorMessage = "Unable to add Medicine Name";
			response.sendRedirect("AddMedicine.jsp?errorMessage=" + errorMessage);
		}
	}
	}

	
