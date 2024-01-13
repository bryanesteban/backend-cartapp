package com.bryan.backend.cartapp.backendcartapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bryan.backend.cartapp.backendcartapp.services.ProductService;
import com.bryan.backend.cartapp.backendcartapp.models.entities.Product;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public SomeData getMethodName(@RequestParam String param) {
        return new SomeData();
    }
    
    public List<Product> list(){
        return service.findAll();
    }

}
