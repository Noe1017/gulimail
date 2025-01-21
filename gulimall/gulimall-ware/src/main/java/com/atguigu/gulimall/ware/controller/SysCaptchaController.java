package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.SysCaptchaEntity;
import com.atguigu.gulimall.ware.service.SysCaptchaService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 系统验证码
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@RestController
@RequestMapping("ware/syscaptcha")
public class SysCaptchaController {
    @Autowired
    private SysCaptchaService sysCaptchaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("ware:syscaptcha:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysCaptchaService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
 //   @RequiresPermissions("ware:syscaptcha:info")
    public R info(@PathVariable("uuid") String uuid){
		SysCaptchaEntity sysCaptcha = sysCaptchaService.getById(uuid);

        return R.ok().put("sysCaptcha", sysCaptcha);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
 //   @RequiresPermissions("ware:syscaptcha:save")
    public R save(@RequestBody SysCaptchaEntity sysCaptcha){
		sysCaptchaService.save(sysCaptcha);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("ware:syscaptcha:update")
    public R update(@RequestBody SysCaptchaEntity sysCaptcha){
		sysCaptchaService.updateById(sysCaptcha);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
 //   @RequiresPermissions("ware:syscaptcha:delete")
    public R delete(@RequestBody String[] uuids){
		sysCaptchaService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
