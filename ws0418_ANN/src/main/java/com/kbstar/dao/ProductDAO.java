package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("pdao")
public class ProductDAO implements MyDao<String, ProductDTO> {

    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle: " + productDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle: " + s);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle: " + productDTO);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO(s, "kiwi", 2000, 3);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("01", "kiwi", 2000, 3));
        list.add(new ProductDTO("02", "mango", 5000, 1));
        list.add(new ProductDTO("03", "plum", 1500, 20));
        return list;
    }
}
