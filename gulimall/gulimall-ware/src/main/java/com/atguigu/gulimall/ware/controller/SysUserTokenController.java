package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.SysUserTokenEntity;
import com.atguigu.gulimall.ware.service.SysUserTokenService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 系统用户Token
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@RestController
@RequestMapping("ware/sysusertoken")
public class SysUserTokenController {
    @Autowired
    private SysUserTokenService sysUserTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("ware:sysusertoken:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysUserTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
 //   @RequiresPermissions("ware:sysusertoken:info")
    public R info(@PathVariable("userId") Long userId){
		SysUserTokenEntity sysUserToken = sysUserTokenService.getById(userId);

        return R.ok().put("sysUserToken", sysUserToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
 //   @RequiresPermissions("ware:sysusertoken:save")
    public R save(@RequestBody SysUserTokenEntity sysUserToken){
		sysUserTokenService.save(sysUserToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("ware:sysusertoken:update")
    public R update(@RequestBody SysUserTokenEntity sysUserToken){
		sysUserTokenService.updateById(sysUserToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
 //   @RequiresPermissions("ware:sysusertoken:delete")
    public R delete(@RequestBody Long[] userIds){
		sysUserTokenService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
