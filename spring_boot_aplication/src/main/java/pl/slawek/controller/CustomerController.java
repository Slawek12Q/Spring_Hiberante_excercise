package pl.slawek.controller;


import org.springframework.stereotype.Service;
import pl.slawek.model.Customer;
import pl.slawek.respository.CustomerRepository;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CustomerController {

    private Scanner scanner;
    private CustomerRepository customerRepository;

    public CustomerController( CustomerRepository customerRepository) {
        this.scanner = new Scanner(System.in);
        this.customerRepository = customerRepository;
    }


    public Customer readCustomer(){
        Customer customer = new Customer();
        System.out.println("Podaj imie");
        customer.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko");
        customer.setLastName(scanner.nextLine());
        System.out.println("Podaj pesel");
        customer.setPesel(scanner.nextLine());
        System.out.println("Podaj numer swojego dowodu");
        customer.setIdNumber(scanner.nextLine());
        return customer;
    }

    public void createCustomer(){
        Customer customer = readCustomer();
        customerRepository.save(customer);
        System.out.println("Nowy klient zostal dodany");
        System.out.println(customer);
    }

    public void removeCustomer(){
        System.out.println("podaj id klienta do usuniecia");
        long customerID = scanner.nextLong();
        Optional<Customer> customer = customerRepository.findById(customerID);
        customer.ifPresentOrElse(customerRepository::delete, () -> System.out.println("Klient o takim Id nie istnieje"));
        
    }
}
