package main.dao;

import main.model.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;


@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    BookDaoImpl() {
    }

    @Transactional
    @Override
    public void save(Book book) {
        entityManager.persist(book);

    }

    @Override
    public Book get(Long id) {
        Book book = entityManager.find(Book.class, id);
        return book;
    }
}