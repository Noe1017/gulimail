package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:53:26
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
