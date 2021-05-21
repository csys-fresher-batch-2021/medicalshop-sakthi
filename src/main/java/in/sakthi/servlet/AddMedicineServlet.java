package in.sakthi.servlet;

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
 @Override      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("AddMedicineServlet");
	    /**
	     * Add a Medicine 
	     */
	
		String medicineName = request.getParameter("medicineName");
		out.println(medicineName);
	
		try {
			boolean isAdded = MedicineService.addMedicine(medicineName);
			if (isAdded) {
				response.sendRedirect("AvailableMedicine.jsp");
			} else {
				String errorMessage = "Unable to add Medicine Name";
				response.sendRedirect("AddMedicine.jsp?errorMessage=" + errorMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

	
