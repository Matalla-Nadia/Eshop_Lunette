package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Montureh;
import bean.Panier;

import dao.MonturehDao;
import dao.PanierDao;


@WebServlet("/Panierh")
public class Panierh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Panierh() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

    	PanierDao pDao = new PanierDao();
        List<Panier> mDao = pDao.read();
        request.setAttribute("listePanier", mDao);
        
        
        System.out.println(mDao);
        System.out.println("helloo");
		request.getRequestDispatcher("panier.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

    	PanierDao pDao = new PanierDao();
    	MonturehDao mDap = new MonturehDao();
       /* List<Panier> nDao = new List<Panier>;*/
        Montureh pan = mDap.read(Integer.parseInt(request.getParameter("reference")));
        	/*pan.setReference(Integer.parseInt(request.getParameter("reference")));*/
        	
        	System.out.println("panier");
        	System.out.println(pan.toString());
        
         pDao.create(pan);
        
         
        request.setAttribute("panier", pan);
        doGet(request, response);
		/*request.getRequestDispatcher("panier.jsp").forward(request, response);*/
	}
	

}
