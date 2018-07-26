package com.proangular.chapter20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Chapter20Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter20Application.class, args);
    }

    @RestController
    @RequestMapping("/products")
    public static class ProductController {
        private static List<Food> foods;

        static {
            foods = Arrays.asList(
                    new Food("Apples", "Fruit", 1.20, 10),
                    new Food("Bananas", "Fruit", 2.42, 7),
                    new Food("Pears", "Fruit", 2.02, 6),
                    new Food("Tuna", "Fish", 20.45, 3),
                    new Food("Salmon", "Fish", 17.93, 2),
                    new Food("Trout", "Fish", 12.93, 4));
        }

        @GetMapping
        public List<Food> foods() {
            return foods;
        }
    }

}
