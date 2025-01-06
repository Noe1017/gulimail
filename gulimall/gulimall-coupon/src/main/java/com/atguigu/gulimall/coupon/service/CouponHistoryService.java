package com.atguigu.gulimall.coupon.service;

import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-06 22:09:52
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

