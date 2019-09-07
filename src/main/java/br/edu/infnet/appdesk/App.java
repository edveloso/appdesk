package br.edu.infnet.appdesk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.infnet.appdesk.modelo.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mitjava");
        EntityManager em = emf.createEntityManager();
    	
        em.getTransaction().begin();
        Usuario usuario = new Usuario();
        usuario.setEmail("edveloso@gmail.com");
        usuario.setNome("Velosao");
        
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
