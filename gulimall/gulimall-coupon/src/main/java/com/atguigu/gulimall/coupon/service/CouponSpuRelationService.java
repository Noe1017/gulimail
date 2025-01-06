package com.atguigu.gulimall.coupon.service;

import com.atguigu.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-06 22:09:52
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

