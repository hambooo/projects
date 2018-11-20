package com.shuaishuai.service;


import com.github.pagehelper.PageHelper;
import com.shuaishuai.domain.Order;

import java.util.List;

public interface IOrderService {
    /**
     * 查询订单
     */

    List<Order> findAll(int page, int size) throws Exception;
}
