package pl.slawek.controller;

import org.springframework.stereotype.Service;
import pl.slawek.Exceptions.CategoryNotFoundException;
import pl.slawek.model.Category;
import pl.slawek.model.Device;
import pl.slawek.respository.CategoryRepository;
import pl.slawek.respository.DeviceRepository;

import java.util.Optional;
import java.util.Scanner;

@Service
public class DeviceController {

    private Scanner scanner;
    private DeviceRepository deviceRepository;
    private CategoryRepository categoryRepository;


    public DeviceController(DeviceRepository deviceRepository, CategoryRepository categoryRepository) {
        this.scanner = new Scanner(System.in);
        this.categoryRepository = categoryRepository;
        this.deviceRepository = deviceRepository;
    }


    public Device readDevice (){
        Device device = new Device();
        System.out.println("Podaj nazwe urzadzenia");
        device.setName(scanner.nextLine());
        System.out.println("Podaj opis urzadzenia");
        device.setDescription(scanner.nextLine());
        System.out.println("Podaj cene urzadzenia");
        device.setPrice(scanner.nextDouble());
        System.out.println("Podaj ilosc sztuk");
        device.setQuantity(scanner.nextInt());
        System.out.println("podaj id kategorii urzadzenia");
        long categoryId = scanner.nextLong();

        Optional<Category> category = categoryRepository.findById(categoryId);
        scanner.nextLine();

        category.ifPresentOrElse(device::setCategory,
                () -> {
                    throw new CategoryNotFoundException("Kategoria o podanym ID nie istnieje");
                }
        );
        return device;
    }

    public void removeDevice () {
        System.out.println("Podaj id urzadzenia do usuniecia");
        long deviceId = scanner.nextLong();
        Optional<Device> device = deviceRepository.findById(deviceId);
        device.ifPresentOrElse(deviceRepository::delete, () -> System.out.println("Urzadzenie o podanym id nie istnieje"));
    }


}
