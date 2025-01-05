package com.atguigu.product.service;

import com.atguigu.product.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-04 18:59:34
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

