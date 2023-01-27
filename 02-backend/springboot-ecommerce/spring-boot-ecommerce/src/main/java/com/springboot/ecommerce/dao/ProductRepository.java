package com.springboot.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springboot.ecommerce.entity.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
	// select * from product where category_id=?
	Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
	Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);

}