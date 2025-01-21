package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.SysCaptchaEntity;

import java.util.Map;

/**
 * 系统验证码
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
public interface SysCaptchaService extends IService<SysCaptchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

