package com.atguigu.product.service;

import com.atguigu.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-04 18:59:34
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

