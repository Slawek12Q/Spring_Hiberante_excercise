package main.dao;


import main.model.UserDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDetailDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDetails get(Long id) {
        UserDetails userDetails = entityManager.find(UserDetails.class, id);
        return userDetails;
    }
}
