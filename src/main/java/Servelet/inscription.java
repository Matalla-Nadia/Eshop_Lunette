package Servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.bcrypt.BCrypt;

import bean.user;
import dao.UserDao;

/**
 * Servlet implementation class inscrition
 */
@WebServlet("/inscription")  
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inscription() {
        super();
       
    }

	//il affiche ubniquement la,page
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	
	}

	//uniquement si on un formulaire
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
		String mot_de_passe=request.getParameter("mot_de_passe");
		
		
		//Cryptage des mots de passe de l'utilisateur
		String hashPasword = BCrypt.hashpw(mot_de_passe, BCrypt.gensalt(12));
		
		//On creer un nouvelle utilisateur et lui ajouter ce que l'on a recuperé
		user nouvel_utilisateur = new user(nom,prenom,email,hashPasword);
		
		UserDao usDao= new UserDao();
		
		//on lui donne la methode pour creer le nouvel user qui se trouve dans UserDao
		//usDao.create(nouvel_utilisateur);
		
		//Si 
		if(usDao.create(nouvel_utilisateur)){
			
			System.out.println(email);
			
			// creer une session
			//HttpSession session= request.getSession();
			request.setAttribute("utilisateur", "Bienvenue parmis nous !");
		//retour
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			
			
		}else {
				//Si ca se passe mal rester sur la page login
			request.setAttribute("utilisateur", "Désolé vous n'etes pas inscrit");
			//retour
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				
		}
		
		
	}
		
	}


