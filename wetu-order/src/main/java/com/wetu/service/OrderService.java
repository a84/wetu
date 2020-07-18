package com.wetu.service;

import com.wetu.pojo.Orders;
import java.util.List;

public interface OrderService {
    /**
     * 查询所有订单
     * @return
     */
    List<Orders> findAll(Integer pageNum,Integer pageSize);
}
