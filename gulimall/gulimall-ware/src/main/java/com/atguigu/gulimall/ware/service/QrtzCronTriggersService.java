package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.QrtzCronTriggersEntity;

import java.util.Map;

/**
 * 
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
public interface QrtzCronTriggersService extends IService<QrtzCronTriggersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

