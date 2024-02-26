package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 问诊信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-18 10:11:18
 */
@TableName("wenzhenxinxi")
public class WenzhenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenzhenxinxiEntity() {
		
	}
	
	public WenzhenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 问诊编号
	 */
					
	private String wenzhenbianhao;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 问诊时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date wenzhenshijian;
	
	/**
	 * 问诊情况
	 */
					
	private String wenzhenqingkuang;
	
	/**
	 * 药方信息
	 */
					
	private String yaofangxinxi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：问诊编号
	 */
	public void setWenzhenbianhao(String wenzhenbianhao) {
		this.wenzhenbianhao = wenzhenbianhao;
	}
	/**
	 * 获取：问诊编号
	 */
	public String getWenzhenbianhao() {
		return wenzhenbianhao;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：问诊时间
	 */
	public void setWenzhenshijian(Date wenzhenshijian) {
		this.wenzhenshijian = wenzhenshijian;
	}
	/**
	 * 获取：问诊时间
	 */
	public Date getWenzhenshijian() {
		return wenzhenshijian;
	}
	/**
	 * 设置：问诊情况
	 */
	public void setWenzhenqingkuang(String wenzhenqingkuang) {
		this.wenzhenqingkuang = wenzhenqingkuang;
	}
	/**
	 * 获取：问诊情况
	 */
	public String getWenzhenqingkuang() {
		return wenzhenqingkuang;
	}
	/**
	 * 设置：药方信息
	 */
	public void setYaofangxinxi(String yaofangxinxi) {
		this.yaofangxinxi = yaofangxinxi;
	}
	/**
	 * 获取：药方信息
	 */
	public String getYaofangxinxi() {
		return yaofangxinxi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}

}
