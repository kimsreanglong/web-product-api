package com.setec.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.entiies.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	List<Product> findByName(String name);

}
