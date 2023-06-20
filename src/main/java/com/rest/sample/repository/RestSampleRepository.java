package com.rest.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.sample.model.Product;

@Repository
public interface RestSampleRepository extends JpaRepository<Product,Integer> {
	Product findByName(String name);
}
