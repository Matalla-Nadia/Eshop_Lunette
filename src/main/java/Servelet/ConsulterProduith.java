package Servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.Montureh;

import dao.MonturehDao;


@WebServlet("/consulterProduith")
public class ConsulterProduith extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConsulterProduith() {
        super();
    } 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MonturehDao pDao = new MonturehDao();
		
		//int para = parseInt("test");
		Montureh montureh_actuel = (Montureh) pDao.read(Integer.parseInt(request.getParameter("reference")));
		System.out.println("iiii");
		System.out.println(Integer.parseInt(request.getParameter("reference")) );
		System.out.println(montureh_actuel);
		
		request.setAttribute("montureh_actuel", montureh_actuel);
		request.getRequestDispatcher("/detailh.jsp").forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
