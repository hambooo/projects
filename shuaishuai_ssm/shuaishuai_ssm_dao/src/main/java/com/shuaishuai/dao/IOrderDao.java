package com.shuaishuai.dao;

import com.shuaishuai.domain.Order;
import com.shuaishuai.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrderDao {
    //根据id查询产品
    @Select("select * from order where id=#{id}")
    public Order findById(String id) throws Exception;

     //查询所有的产品信息
    @Select("select * from orders")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.shuaishuai.dao.IProductDao.findById")),
    })
    public List<Order> findAll() throws Exception;


}
