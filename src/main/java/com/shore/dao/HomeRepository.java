package com.shore.dao;

import com.shore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Product,Long> {
}
