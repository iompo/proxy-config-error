package com.test.proxyconfigerror.database.controllers;

import com.test.proxyconfigerror.database.entities.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

@Repository
@Transactional
public class UserJpaController {

    @PersistenceContext
    protected EntityManager em;

    public User findEntity(Long id) {
        if (id == null) {
            return null;
        }
        return em.find(User.class, id);
    }
}
