package com.tognati.course.repositories;

import com.tognati.course.entities.Product;
import com.tognati.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
