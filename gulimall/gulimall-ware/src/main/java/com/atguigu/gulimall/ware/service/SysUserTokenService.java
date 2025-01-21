package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.SysUserTokenEntity;

import java.util.Map;

/**
 * 系统用户Token
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

