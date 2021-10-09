package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Monturetest;
import dao.MonturetestDAO;




@WebServlet("/menutest")
public class menutest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public menutest() {
        super();
       
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id").toString();
    	MonturetestDAO pDao = new MonturetestDAO();
        List<Monturetest> mDao = pDao.readByCategorie(id);
        
        request.setAttribute("listeMonturetest", mDao);
		request.getRequestDispatcher("listtest.jsp").forward(request, response);
		  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
