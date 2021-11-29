package ru.gb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product[] products = {
                new Product(1, "Red Apple", 25),
                new Product(2, "Green Apple", 20),
                new Product(3, "Peach", 40),
                new Product(4, "Orange", 50),
                new Product(5, "Banana", 60),
                new Product(6, "Grape", 70),
                new Product(7, "Kiwi", 60),
                new Product(8, "Raspberries", 120),
                new Product(9, "Blueberries", 90),
                new Product(10, "Strawberry", 140),
        };

        for (Product product : products) {
            resp.getWriter().println("id = " + product.getId() + ", " +
                    "title = " + product.getTitle() + ", " +
                    "cost = " + product.getCost());

        }
    }
}
