package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.SysRoleMenuEntity;
import com.atguigu.gulimall.ware.service.SysRoleMenuService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 角色与菜单对应关系
 *
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@RestController
@RequestMapping("ware/sysrolemenu")
public class SysRoleMenuController {
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("ware:sysrolemenu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysRoleMenuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("ware:sysrolemenu:info")
    public R info(@PathVariable("id") Long id){
		SysRoleMenuEntity sysRoleMenu = sysRoleMenuService.getById(id);

        return R.ok().put("sysRoleMenu", sysRoleMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
 //   @RequiresPermissions("ware:sysrolemenu:save")
    public R save(@RequestBody SysRoleMenuEntity sysRoleMenu){
		sysRoleMenuService.save(sysRoleMenu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("ware:sysrolemenu:update")
    public R update(@RequestBody SysRoleMenuEntity sysRoleMenu){
		sysRoleMenuService.updateById(sysRoleMenu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
 //   @RequiresPermissions("ware:sysrolemenu:delete")
    public R delete(@RequestBody Long[] ids){
		sysRoleMenuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
