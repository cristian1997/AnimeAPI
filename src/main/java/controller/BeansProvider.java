package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class BeansProvider {
    @Bean
    public EntityManagerFactory entityManagerFactory() {
        return Persistence.createEntityManagerFactory("AnimePU");
    }

    @Bean
    public CharacterController characterController() {
        return new CharacterController();
    }
}
