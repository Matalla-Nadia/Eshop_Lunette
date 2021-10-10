package Servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Monturetest;
import dao.MonturetestDAO;


@WebServlet("/ConsulterMonturetest")
public class ConsulterMonturetest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConsulterMonturetest() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MonturetestDAO rDao = new MonturetestDAO();
		Monturetest actuel = (Monturetest) rDao.read(Integer.parseInt(request.getParameter("id")));

		request.setAttribute("actuel", actuel);
		request.getRequestDispatcher("/montutestDetail.jsp").forward(request, response); 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
