package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.QrtzTriggersEntity;
import com.atguigu.gulimall.ware.service.QrtzTriggersService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@RestController
@RequestMapping("ware/qrtztriggers")
public class QrtzTriggersController {
    @Autowired
    private QrtzTriggersService qrtzTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("ware:qrtztriggers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
 //   @RequiresPermissions("ware:qrtztriggers:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzTriggersEntity qrtzTriggers = qrtzTriggersService.getById(schedName);

        return R.ok().put("qrtzTriggers", qrtzTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
 //   @RequiresPermissions("ware:qrtztriggers:save")
    public R save(@RequestBody QrtzTriggersEntity qrtzTriggers){
		qrtzTriggersService.save(qrtzTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("ware:qrtztriggers:update")
    public R update(@RequestBody QrtzTriggersEntity qrtzTriggers){
		qrtzTriggersService.updateById(qrtzTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
 //   @RequiresPermissions("ware:qrtztriggers:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
