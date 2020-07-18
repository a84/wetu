package com.wetu.mapper;


import com.wetu.pojo.Orders;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Repository
public interface OrderMapper extends BaseMapper<Orders> {

//    @Select("select * from orders")
//    List<Order> findAll();
}
