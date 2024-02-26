package com.entity.model;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 缴费信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-18 10:11:18
 */
public class JiaofeixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 挂号费
	 */
	
	private Float guahaofei;
		
	/**
	 * 问诊费
	 */
	
	private Float wenzhenfei;
		
	/**
	 * 药品费
	 */
	
	private Float yaopinfei;
		
	/**
	 * 其他费用
	 */
	
	private Float qitafeiyong;
		
	/**
	 * 总费用
	 */
	
	private Float zongfeiyong;
		
	/**
	 * 缴费时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaofeishijian;
		
	/**
	 * 缴费说明
	 */
	
	private String jiaofeishuoming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
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
	 * 设置：挂号费
	 */
	 
	public void setGuahaofei(Float guahaofei) {
		this.guahaofei = guahaofei;
	}
	
	/**
	 * 获取：挂号费
	 */
	public Float getGuahaofei() {
		return guahaofei;
	}
				
	
	/**
	 * 设置：问诊费
	 */
	 
	public void setWenzhenfei(Float wenzhenfei) {
		this.wenzhenfei = wenzhenfei;
	}
	
	/**
	 * 获取：问诊费
	 */
	public Float getWenzhenfei() {
		return wenzhenfei;
	}
				
	
	/**
	 * 设置：药品费
	 */
	 
	public void setYaopinfei(Float yaopinfei) {
		this.yaopinfei = yaopinfei;
	}
	
	/**
	 * 获取：药品费
	 */
	public Float getYaopinfei() {
		return yaopinfei;
	}
				
	
	/**
	 * 设置：其他费用
	 */
	 
	public void setQitafeiyong(Float qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	
	/**
	 * 获取：其他费用
	 */
	public Float getQitafeiyong() {
		return qitafeiyong;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(Float zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public Float getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：缴费时间
	 */
	 
	public void setJiaofeishijian(Date jiaofeishijian) {
		this.jiaofeishijian = jiaofeishijian;
	}
	
	/**
	 * 获取：缴费时间
	 */
	public Date getJiaofeishijian() {
		return jiaofeishijian;
	}
				
	
	/**
	 * 设置：缴费说明
	 */
	 
	public void setJiaofeishuoming(String jiaofeishuoming) {
		this.jiaofeishuoming = jiaofeishuoming;
	}
	
	/**
	 * 获取：缴费说明
	 */
	public String getJiaofeishuoming() {
		return jiaofeishuoming;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
