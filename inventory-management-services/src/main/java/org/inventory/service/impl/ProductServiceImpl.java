package org.inventory.service.impl;

import lombok.RequiredArgsConstructor;
import org.inventory.dto.Product;
import org.inventory.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final RestTemplate restTemplate;

    @Override
    public List<Product> getAllProducts() {
        Product[] products = restTemplate.getForObject(
                "https://fakestoreapi.com/products", Product[].class);
        return products != null ? Arrays.asList(products) : null;
    }
}
