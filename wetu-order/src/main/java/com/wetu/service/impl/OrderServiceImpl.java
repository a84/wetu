package com.wetu.service.impl;

import com.github.pagehelper.PageHelper;
import com.wetu.mapper.OrderMapper;
import com.wetu.pojo.Orders;
import com.wetu.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OrderMapper orderMapper;
   /* *
     * 查询所有订单
     * @return
     */
    @Override
    public List<Orders> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return orderMapper.selectAll();
    }
}
