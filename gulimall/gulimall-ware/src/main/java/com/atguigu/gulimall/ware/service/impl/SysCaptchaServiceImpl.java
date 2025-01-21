package com.atguigu.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.ware.dao.SysCaptchaDao;
import com.atguigu.gulimall.ware.entity.SysCaptchaEntity;
import com.atguigu.gulimall.ware.service.SysCaptchaService;


@Service("sysCaptchaService")
public class SysCaptchaServiceImpl extends ServiceImpl<SysCaptchaDao, SysCaptchaEntity> implements SysCaptchaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysCaptchaEntity> page = this.page(
                new Query<SysCaptchaEntity>().getPage(params),
                new QueryWrapper<SysCaptchaEntity>()
        );

        return new PageUtils(page);
    }

}