package com.bryan.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bryan.backend.cartapp.backendcartapp.models.entities.Product;
import com.bryan.backend.cartapp.backendcartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{


    private ProductRepository repository;
    @Override
    public List<Product> findAll() {
        

        return null;
    }
  
}
