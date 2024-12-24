package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    private final UserService userService;

    public Main(UserService userService, CategoryRepository categoryRepository) {
        this.userService = userService;  
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.selectAllCategory();
        userService.selectAllProduct();

        int category_id = 5;
        userService.createCategory("Software");
        userService.createProduct("Windows", 2500, category_id);
        userService.createProduct("Antivirus", 1500, category_id);

        userService.selectAllCategory();
        userService.selectAllProduct();

        userService.deleteCategory(category_id);

        userService.selectAllCategory();
        userService.selectAllProduct();

    }
}