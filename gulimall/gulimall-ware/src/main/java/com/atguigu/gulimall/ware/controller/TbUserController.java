package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.TbUserEntity;
import com.atguigu.gulimall.ware.service.TbUserService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 用户
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@RestController
@RequestMapping("ware/tbuser")
public class TbUserController {
    @Autowired
    private TbUserService tbUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("ware:tbuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tbUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
 //   @RequiresPermissions("ware:tbuser:info")
    public R info(@PathVariable("userId") Long userId){
		TbUserEntity tbUser = tbUserService.getById(userId);

        return R.ok().put("tbUser", tbUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
 //   @RequiresPermissions("ware:tbuser:save")
    public R save(@RequestBody TbUserEntity tbUser){
		tbUserService.save(tbUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("ware:tbuser:update")
    public R update(@RequestBody TbUserEntity tbUser){
		tbUserService.updateById(tbUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
 //   @RequiresPermissions("ware:tbuser:delete")
    public R delete(@RequestBody Long[] userIds){
		tbUserService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
