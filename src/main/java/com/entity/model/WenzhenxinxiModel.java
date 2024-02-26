package com.entity.model;

import com.entity.WenzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 问诊信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-18 10:11:18
 */
public class WenzhenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
