package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.ScheduleJobEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {
	
}
