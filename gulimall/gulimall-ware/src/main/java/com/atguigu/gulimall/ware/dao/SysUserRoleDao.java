package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.SysUserRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与角色对应关系
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {
	
}
