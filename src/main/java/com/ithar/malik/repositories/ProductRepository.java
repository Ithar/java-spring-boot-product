package com.ithar.malik.repositories;

import com.ithar.malik.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
