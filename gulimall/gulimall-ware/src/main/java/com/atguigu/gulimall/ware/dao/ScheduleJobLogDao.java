package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
