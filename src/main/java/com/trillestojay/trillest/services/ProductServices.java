package com.trillestojay.trillest.services;

import com.trillestojay.trillest.data.model.ProductDto;
import com.trillestojay.trillest.data.model.Products;
import com.trillestojay.trillest.web.Exceptions.ProductException;

import java.util.List;

public interface ProductServices {
    void addProduct(ProductDto productDto) throws ProductException;
    void removeProduct(Integer productId);
    void removeAllProducts();
    ProductDto findProductById(Integer productId) throws ProductException;
    List<ProductDto> getAllProducts();
    Products findProduct(String productId);
    ProductDto updateProduct(String productId, ProductDto updatedProductDetails);
    List<ProductDto> getAllProductsInCategory(String category);
}
