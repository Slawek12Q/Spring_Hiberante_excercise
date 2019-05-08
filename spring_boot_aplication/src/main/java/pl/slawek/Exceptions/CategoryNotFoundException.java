package pl.slawek.Exceptions;

public class CategoryNotFoundException extends RuntimeException {
    CategoryNotFoundException(String message){
        super(message);
    }
}
