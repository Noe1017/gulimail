package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.SysRoleMenuEntity;

import java.util.Map;

/**
 * 角色与菜单对应关系
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
public interface SysRoleMenuService extends IService<SysRoleMenuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

