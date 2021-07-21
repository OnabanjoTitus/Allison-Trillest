package com.trillestojay.trillest.services;

import com.trillestojay.trillest.data.model.ProductDto;
import com.trillestojay.trillest.data.model.Products;
import com.trillestojay.trillest.data.repository.ProductsRepository;
import com.trillestojay.trillest.web.Exceptions.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductServices{
    @Autowired
    ProductsRepository productsRepository;


    @Override
    public void addProduct(ProductDto productDto) throws ProductException {
        Products productToSave = ProductServiceImpl.unpackDto(productDto);
        if(productsRepository.findById(productToSave.getProductId()).isPresent()){
            throw new ProductException("Product already exists");
        };
        productsRepository.save(productToSave);
    }
    public static Products unpackDto(ProductDto productDto){
        Products product = new Products();
       product.setProductId(product.getProductId());
        return product;
    }
    public static ProductDto packDto(Products product){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setProductImage(product.getProductImage());
        productDto.setProductPrice(product.getProductPrice());

        return productDto;
    }
    @Override
    public void removeProduct(Integer productId) {
        productsRepository.deleteById(productId);
    }

    @Override
    public void removeAllProducts() {
        productsRepository.deleteAll();
    }

    @Override
    public ProductDto findProductById(Integer productId) throws ProductException {
        ProductDto productDto= new ProductDto();
        Optional<Products> products=productsRepository.findById(productId);
        if(products.isPresent()){
            productDto=ProductServiceImpl.packDto(products.get());
            return productDto;
        }
        throw new ProductException("Product not found");
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductDto> productDtoList= new ArrayList<>();
        List<Products> productsList=productsRepository.findAll();
//        productsList.stream().map(products ->)
        return productDtoList;
    }

    @Override
    public Products findProduct(String productId) {
        return null;
    }

    @Override
    public ProductDto updateProduct(String productId, ProductDto updatedProductDetails) {
        return null;
    }

    @Override
    public List<ProductDto> getAllProductsInCategory(String category) {
        return null;
    }
}
