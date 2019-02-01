package main.dao;

import main.model.Book;

public interface BookDao {
    void save(Book book);

    Book get(Long id);

    void update(Book book);

    void remove(Long bookId);
}