package Servelet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public login() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String mot_de_passe=request.getParameter("mot_de_pass");
		
		System.out.println(email );
		UserDao usDao= new UserDao();
		
		System.out.println("test avant le if");
		
		System.out.println(email+"  ---- "+mot_de_passe);
		
		System.out.println(usDao.login(email, mot_de_passe));
		
		if(usDao.login(email, mot_de_passe)!=null){ //> possible mais INT uniquement.
			String prenom = usDao.login(email, mot_de_passe).getPrenom();
		
			System.out.println(email +" est bien connecté ;)");
			System.out.println(mot_de_passe); 
			
			// Creer une session
			HttpSession session= request.getSession();
			session.setAttribute("utilisateur", prenom);
			
			
			//Si ca se passe bien  afficher la page home
			request.setAttribute("utilisateur", "Bienvenue");
			request.getRequestDispatcher("/accueil.jsp").forward(request, response);
		
		}else {
				//Si ca se passe mal rester sur la page login
				request.setAttribute("utilisateur", "Désolé vous n'etes pas connecté"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}
		
	}
