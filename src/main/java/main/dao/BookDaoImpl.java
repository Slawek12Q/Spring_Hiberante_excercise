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

    @Override
    @Transactional
    public void update(Book book) {
        entityManager.merge(book);
    }

    @Override
    @Transactional
    public void remove(Long bookId) {
        Book objToRemove = entityManager.find(Book.class, bookId);
        entityManager.remove(objToRemove);
    }
}