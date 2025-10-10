package com.nabd.service;

import com.nabd.model.Product;
import com.nabd.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAll() { return productRepository.findAll(); }
    public Product create(Product p) { return productRepository.save(p); }
    public Product update(Product p) { return productRepository.save(p); }
    public void delete(Long id) { productRepository.deleteById(id); }
    public List<Product> searchByName(String q) { return productRepository.findByNameContainingIgnoreCase(q); }
}
