package dao;

import java.util.List;

import bean.Monture;
import bean.Panier;
import bean.user;

public interface IDAO<T> {

	public boolean create(T object);
	public List<T> read();
	public void update(T object);
	public void delete(T object);
	public List<T> lister();
	public List<T> findById(int id);
	public void vider_table(T object);
	public user login(String email, String pwd);
	boolean create(Monture object);
	
}