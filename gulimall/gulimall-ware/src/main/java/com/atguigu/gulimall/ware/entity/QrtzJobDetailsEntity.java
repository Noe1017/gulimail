package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author Noe1017
 * @email jixiangli1017@gmail.com
 * @date 2025-01-21 22:44:18
 */
@Data
@TableName("QRTZ_JOB_DETAILS")
public class QrtzJobDetailsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String jobName;
	/**
	 * 
	 */
	private String jobGroup;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String jobClassName;
	/**
	 * 
	 */
	private String isDurable;
	/**
	 * 
	 */
	private String isNonconcurrent;
	/**
	 * 
	 */
	private String isUpdateData;
	/**
	 * 
	 */
	private String requestsRecovery;
	/**
	 * 
	 */
	private byte [] jobData;

}
