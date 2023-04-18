package com.kbstar.service;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;

import java.util.List;

public class ProductService implements MyService<String, ProductDTO> {

    MyDao<String, ProductDTO> dao;
    //데이터 액세스 오브젝트 - 혹시 sql이나 db가 바뀌었을 때 여기는 건드리지 않아도 되게끔(그거는 DAO만 수정하면 되게 여기에서의 기능 정의를 해야함)

    public ProductService(MyDao dao) {
        this.dao = dao;
    }

    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("Send Mail");
    }

    @Override
    public void remove(String s) {
        dao.delete(s);
    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
        System.out.println("Send Mail");
    }

    @Override
    public ProductDTO get(String s) {
        // 로그인 기능
        return dao.select(s);
    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}
