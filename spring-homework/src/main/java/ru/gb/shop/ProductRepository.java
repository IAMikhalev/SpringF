package ru.gb.shop;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = List.of(
                new Product(1,"Мышка",40f),
                new Product(2,"Наушники", 50f),
                new Product(3, "Материнская плата", 60f),
                new Product(4, "Звуковая карта", 70f),
                new Product(5, "Видеокарта", 80f)
        );
    }

    public Optional<Product> findProductById(Integer id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
    }
}
