package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Monture;
import dao.MontureDao;




@WebServlet("/monture")
public class monture extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public monture() {
        super();
       
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	MontureDao pDao = new MontureDao();

        List<Monture> mDao = pDao.readAll();
        request.setAttribute("listeMonture", mDao);
        
        System.out.println(mDao);
        
		request.getRequestDispatcher("monture.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	
}