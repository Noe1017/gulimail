package com.atguigu.product.dao;

import com.atguigu.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lijixiang
 * @email jixiangli1017@gmail.com
 * @date 2025-01-04 18:59:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
