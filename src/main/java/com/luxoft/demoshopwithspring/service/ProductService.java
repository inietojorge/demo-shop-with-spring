package com.luxoft.demoshopwithspring.service;

import com.luxoft.demoshopwithspring.domain.ProductDto;
import com.luxoft.demoshopwithspring.exception.ShopException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductDto addProductToInventory(ProductDto productDto);
    ProductDto removeProductFromInventory(ProductDto productDto) throws ShopException;

    List<ProductDto> getCurrentStock();
}
