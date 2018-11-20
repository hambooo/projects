package com.shuaishuai.service.impl;

import com.shuaishuai.dao.IProductDao;
import com.shuaishuai.domain.Product;
import com.shuaishuai.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceServiceIpl implements IProductService {
    @Autowired
    private IProductDao produceDao;
    @Override
    public List<Product> findAll() throws Exception {
        return produceDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        produceDao.save(product);

    }
}
