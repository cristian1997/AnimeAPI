package controller;

import entity.Character;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class CharacterController {
    @Autowired
    private EntityManagerFactory emf;

    public Character getByName(String name) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("select t from Character t where t.name=:name");
        List<Character> characters = query.setParameter("name", name).getResultList();
        em.close();

        return characters.isEmpty() ? null : characters.get(0);
    }
}
