package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-04 18:59:34
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

