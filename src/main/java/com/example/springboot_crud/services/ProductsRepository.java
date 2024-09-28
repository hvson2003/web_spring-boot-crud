package com.example.springboot_crud.services;

import com.example.springboot_crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
