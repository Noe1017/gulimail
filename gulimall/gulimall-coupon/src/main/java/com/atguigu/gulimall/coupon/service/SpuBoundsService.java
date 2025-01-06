package com.atguigu.gulimall.coupon.service;

import com.atguigu.gulimall.coupon.entity.SpuBoundsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-06 22:09:52
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

