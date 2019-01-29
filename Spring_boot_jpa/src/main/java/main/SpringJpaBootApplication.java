package main;

import main.dao.BookDao;
import main.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringJpaBootApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaBootApplication.class, args);
        BookDao dao = ctx.getBean(BookDao.class);
        Book book = new Book("1234567890468", "Spring is so cool", "Slawek");
        dao.save(book);

        Book book2 = new Book("1234567820468", "Spring is so cool", "Slawek");
        book2.setId(1L);
        dao.update(book2);



        Book foundBook = dao.get(1L);
        System.out.println(foundBook);

        dao.remove(1L);

    }
}