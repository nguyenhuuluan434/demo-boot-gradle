package com.example.demo.controller;

import com.example.demo.config.SwaggerExposeEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @GetMapping(value = "/products")
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }

    @SwaggerExposeEndpoint
    @PostMapping(value = "/products")
    public String createProduct() {
        return "Product is saved successfully";
    }
}
