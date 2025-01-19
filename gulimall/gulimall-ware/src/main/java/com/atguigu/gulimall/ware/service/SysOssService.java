package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-19 17:32:28
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

