package com.shore.web;

import com.shore.entity.Product;
import com.shore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

   // @ResponseBody
    @RequestMapping("/index")
    public Object  index(){
        List<Product> allProducts = homeService.findAllProducts();
        return allProducts;
    }

}
