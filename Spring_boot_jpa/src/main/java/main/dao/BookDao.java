package main.dao;

import main.model.Book;

public interface BookDao {
    public void save(Book book);
    public Book get(Long id);

}