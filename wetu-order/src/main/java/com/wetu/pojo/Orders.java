package com.wetu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders implements Serializable {
    private String id; // 主键id
    private String name; // 商品名称
    private Double price; // 商品价格
    private String dbSource; // 所存的数据库
}
