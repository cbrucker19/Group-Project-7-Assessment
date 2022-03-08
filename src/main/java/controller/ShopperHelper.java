package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Shop;

public class ShopperHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Group7");
	
	public void insertShop(Shop s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
	public List<Shop> showAllShops(){
		EntityManager em = emfactory.createEntityManager();
		List<Shop> allShops = em.createQuery("SELECT s FROM Shop s").getResultList();
		return allShops; 
	}
	public Shop findShop(String nameToLookUp) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Shop> typedQuery = em.createQuery("select sh from Shop sh where sh.shopName = :selectedName", Shop.class);
		typedQuery.setParameter("selectedName", nameToLookUp);
		typedQuery.setMaxResults(1);
		
		Shop foundShop;
		try {
			foundShop = typedQuery.getSingleResult();
		}catch (NoResultException ex) {
			foundShop = new Shop(nameToLookUp);
		}
		em.close();
		return foundShop;
	}
}
