package com.dontwait.shopapp.repository;

import com.dontwait.shopapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByCategoryId(Long categoryId);
    List<Category> findAll();
    Boolean existsByCategoryName(String categoryName);
    void deleteByCategoryId(Long categoryId);
}
