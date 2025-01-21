package com.atguigu.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.ware.dao.SysConfigDao;
import com.atguigu.gulimall.ware.entity.SysConfigEntity;
import com.atguigu.gulimall.ware.service.SysConfigService;


@Service("sysConfigService")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigDao, SysConfigEntity> implements SysConfigService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysConfigEntity> page = this.page(
                new Query<SysConfigEntity>().getPage(params),
                new QueryWrapper<SysConfigEntity>()
        );

        return new PageUtils(page);
    }

}