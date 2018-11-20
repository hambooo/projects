package com.shuaishuai.service.impl;


import com.github.pagehelper.PageHelper;
import com.shuaishuai.dao.IOrderDao;
import com.shuaishuai.domain.Order;
import com.shuaishuai.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderDao orderDao;


    @Override
    public List<Order> findAll(int page, int size) throws Exception {
//参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page,size);
        return orderDao.findAll();
}


}
