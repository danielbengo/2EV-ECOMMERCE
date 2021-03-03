package com.example.RETO2.Web.View;

import com.example.RETO2.Services.ProductsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("products")
public class ProductViewController {
    private final ProductsService productsService;

    ProductViewController(ProductsService productsService) {
        this.productsService = productsService;
    }


    @GetMapping
        public ModelAndView products() {
            ModelAndView mv = new ModelAndView("index");
            mv.addObject("products", productsService.getAll());
            return mv;
        }
}