package Servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Monture;
import dao.MontureDao;


@WebServlet("/consulterProduit")
public class ConsulterProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConsulterProduit() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		MontureDao pDao = new MontureDao();
		
		//int para = parseInt("test");
		Monture monture_actuel = (Monture) pDao.read(Integer.parseInt(request.getParameter("reference")));
		System.out.println("rrrrrr");
		System.out.println(Integer.parseInt(request.getParameter("reference")) );
		System.out.println(monture_actuel);
		
		request.setAttribute("monture_actuel", monture_actuel);
		request.getRequestDispatcher("/detail.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    
	}

}
