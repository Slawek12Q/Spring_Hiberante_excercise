package pl.slawek.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.slawek.model.Category;
import pl.slawek.respository.CategoryRepository;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CategoryController {

    private Scanner scanner;
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.scanner = new Scanner(System.in);
        this.categoryRepository = categoryRepository;
    }

    public Category readCategory (){
        Category category = new Category();
        System.out.println("Podaj nazwe kategorii");
        category.setName(scanner.nextLine());
        System.out.println("Podaj opis kategorii");
        category.setDescription(scanner.nextLine());
        return category;
    }

    public void createCategory(){
        Category category = readCategory();
        categoryRepository.save(category);
        System.out.println("Dodano nowa kategorie");
        System.out.println(category);
    }

    public void rmoveCategory(){
        System.out.println("Podaj id kategorii do usuniecia");
        long categoryId = scanner.nextLong();
        Optional<Category> category = categoryRepository.findById(categoryId);
        category.ifPresentOrElse(categoryRepository::delete, () -> System.out.println("Kategoria o wskazanym ID nie istenieje"));
    }

}
