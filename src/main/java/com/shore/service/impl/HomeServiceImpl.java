package com.shore.service.impl;

import com.shore.dao.HomeRepository;
import com.shore.entity.Product;
import com.shore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeRepository HomeRepository;
    @Override
    public List<Product> findAllProducts() {
        return HomeRepository.findAll();

    }
}
