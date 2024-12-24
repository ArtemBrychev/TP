package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public UserService(UserRepository ur, CategoryRepository cr){
        this.userRepository = ur;
        this.categoryRepository = cr;
    }

    //Операции с таблицей Product
    public Product createProduct(String name, double price, int category_id){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setCategory_id(category_id);
        return userRepository.save(product);
    }

    public Product findProductById(long id){
        return userRepository.findById(id).orElse(null);
    }

    public ArrayList<Product> findByCategory(long category_id){
        ArrayList<Product> result = new ArrayList<>();
        for(var x : userRepository.findAll()){
            if(x.getCategory_id() == (int)category_id){
                result.add(x);
            }
        }
        return result;
    }

    public Product updateCategory(long id, int category_id){
        Product product = userRepository.findById(id).orElseThrow();
        product.setCategory_id(category_id);
        return userRepository.save(product);
    }

    public void deleteById(long id){
        userRepository.delete(userRepository.findById(id).orElseThrow());
    }

    public void selectAllProduct(){
        System.out.println("All from Product table");
        for(var x : userRepository.findAll()){
            System.out.println("->" + x);
        }
    }

    //Операции с таблицей категориий
    public void selectAllCategory(){
        System.out.println("All from Category table");
        for(var x : categoryRepository.findAll()){
            System.out.println("->" + x);
        }
    }

    public Category createCategory(String name){
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }

    public void deleteCategory(long id){
        for(var x : findByCategory(id)){
            userRepository.delete(x);
        }
        categoryRepository.delete(categoryRepository.findById(id).orElseThrow());
    }
}
