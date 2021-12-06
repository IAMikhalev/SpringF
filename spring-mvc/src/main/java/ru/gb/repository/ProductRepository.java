package ru.gb.repository;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.gb.dto.Product;

@Component
public class ProductRepository {

  private List<Product> productList;

  @PostConstruct
  public void init() {
    productList = new ArrayList<>();
    productList.add(new Product(1, "Компьютер", 900));
    productList.add(new Product(2, "Монитор", 200));
    productList.add(new Product(3, "Клавиатура", 85));
    productList.add(new Product(4, "Компьютерная мышь", 45));
  }

  public List<Product> getAll() {
    return List.copyOf(productList);
  }

  public void save(Product product) {
    productList.add(product);
  }

  public Product findById(int id) {
    return productList.stream().filter(product -> product.getId() == id)
        .findFirst()
        .orElse(null);
  }
}
