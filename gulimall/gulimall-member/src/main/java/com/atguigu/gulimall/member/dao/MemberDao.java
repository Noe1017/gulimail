package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-18 23:06:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
