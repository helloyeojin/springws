package com.kbstar.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class UpdateTest {
    @Autowired
    CustService service;

    @Test
    void contextLoads() {
        try{
            service.modify(new Cust("id01", "pwd01", "mango"));

        } catch (Exception e){
            log.info("에러..........");
            e.printStackTrace();
        }
    }
}