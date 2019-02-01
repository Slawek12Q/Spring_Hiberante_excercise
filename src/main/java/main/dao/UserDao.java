package main.dao;

import main.model.User;
import main.model.UserDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save (User user)
    {
        UserDetails userDetails = user.getDetails();
        if(userDetails != null && userDetails.getId() == null) {
            entityManager.persist(userDetails);
        }
        entityManager.persist(user);
    }

    public User get (Long id){
        return entityManager.find(User.class, id);
    }

    public void update (User user)
    {
        UserDetails userDetails = user.getDetails();

        if(userDetails != null){
            userDetails = entityManager.merge(userDetails);
            user.setDetails(userDetails);
        }
        entityManager.merge(user);
    }


    public void delete (User user)
    {
        User userToDelete = entityManager.merge(user);
        entityManager.remove(userToDelete.getDetails());
        entityManager.remove(userToDelete);
    }
}
