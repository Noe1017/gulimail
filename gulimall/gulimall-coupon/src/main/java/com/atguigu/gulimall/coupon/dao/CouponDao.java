package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-15 22:42:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
