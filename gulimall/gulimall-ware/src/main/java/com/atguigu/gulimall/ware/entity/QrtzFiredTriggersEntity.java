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
 * @date 2025-01-18 23:28:01
 */
@Data
@TableName("QRTZ_FIRED_TRIGGERS")
public class QrtzFiredTriggersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String entryId;
	/**
	 * 
	 */
	private String triggerName;
	/**
	 * 
	 */
	private String triggerGroup;
	/**
	 * 
	 */
	private String instanceName;
	/**
	 * 
	 */
	private Long firedTime;
	/**
	 * 
	 */
	private Long schedTime;
	/**
	 * 
	 */
	private Integer priority;
	/**
	 * 
	 */
	private String state;
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
	private String isNonconcurrent;
	/**
	 * 
	 */
	private String requestsRecovery;

}
