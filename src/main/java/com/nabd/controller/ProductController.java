package com.nabd.controller;

import com.nabd.model.Product;
import com.nabd.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> all() { return productService.getAll(); }

    @GetMapping("/search")
    public List<Product> search(@RequestParam("q") String q) { return productService.searchByName(q); }

    @PostMapping
    public Product create(@RequestBody Product p) { return productService.create(p); }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product p) {
        p.setId(id);
        return productService.update(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { productService.delete(id); }
}
