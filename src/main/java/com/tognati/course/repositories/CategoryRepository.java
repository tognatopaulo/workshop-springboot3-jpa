package com.tognati.course.repositories;

import com.tognati.course.entities.Category;
import com.tognati.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
