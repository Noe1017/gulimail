package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统配置信息表
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@Data
@TableName("sys_config")
public class SysConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * key
	 */
	private String paramKey;
	/**
	 * value
	 */
	private String paramValue;
	/**
	 * 状态   0：隐藏   1：显示
	 */
	private Integer status;
	/**
	 * 备注
	 */
	private String remark;

}
