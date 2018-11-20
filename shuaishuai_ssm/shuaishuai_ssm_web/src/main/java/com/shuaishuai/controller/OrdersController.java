package com.shuaishuai.controller;

import com.github.pagehelper.PageInfo;
import com.shuaishuai.domain.Order;
import com.shuaishuai.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private IOrderService orderService;
    @RequestMapping("findAll.do")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "4") int size) throws Exception {


        ModelAndView mv = new ModelAndView();
        List<Order> ordersList = orderService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;

    }
}
