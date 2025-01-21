package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.ScheduleJobLogEntity;
import com.atguigu.gulimall.ware.service.ScheduleJobLogService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 定时任务日志
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@RestController
@RequestMapping("ware/schedulejoblog")
public class ScheduleJobLogController {
    @Autowired
    private ScheduleJobLogService scheduleJobLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("ware:schedulejoblog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = scheduleJobLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{logId}")
 //   @RequiresPermissions("ware:schedulejoblog:info")
    public R info(@PathVariable("logId") Long logId){
		ScheduleJobLogEntity scheduleJobLog = scheduleJobLogService.getById(logId);

        return R.ok().put("scheduleJobLog", scheduleJobLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
 //   @RequiresPermissions("ware:schedulejoblog:save")
    public R save(@RequestBody ScheduleJobLogEntity scheduleJobLog){
		scheduleJobLogService.save(scheduleJobLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("ware:schedulejoblog:update")
    public R update(@RequestBody ScheduleJobLogEntity scheduleJobLog){
		scheduleJobLogService.updateById(scheduleJobLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
 //   @RequiresPermissions("ware:schedulejoblog:delete")
    public R delete(@RequestBody Long[] logIds){
		scheduleJobLogService.removeByIds(Arrays.asList(logIds));

        return R.ok();
    }

}
