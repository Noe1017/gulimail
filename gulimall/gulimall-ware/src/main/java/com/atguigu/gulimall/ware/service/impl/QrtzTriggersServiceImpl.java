package com.atguigu.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.ware.dao.QrtzTriggersDao;
import com.atguigu.gulimall.ware.entity.QrtzTriggersEntity;
import com.atguigu.gulimall.ware.service.QrtzTriggersService;


@Service("qrtzTriggersService")
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersDao, QrtzTriggersEntity> implements QrtzTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzTriggersEntity> page = this.page(
                new Query<QrtzTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzTriggersEntity>()
        );

        return new PageUtils(page);
    }

}